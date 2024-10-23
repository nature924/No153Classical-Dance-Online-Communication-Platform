package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShipinEntity;
import com.entity.view.ShipinView;

import com.service.ShipinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 视频
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@RestController
@RequestMapping("/shipin")
public class ShipinController {
    @Autowired
    private ShipinService shipinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShipinEntity shipin,
		HttpServletRequest request){
        EntityWrapper<ShipinEntity> ew = new EntityWrapper<ShipinEntity>();
		PageUtils page = shipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShipinEntity shipin, HttpServletRequest request){
        EntityWrapper<ShipinEntity> ew = new EntityWrapper<ShipinEntity>();
		PageUtils page = shipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShipinEntity shipin){
       	EntityWrapper<ShipinEntity> ew = new EntityWrapper<ShipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shipin, "shipin")); 
        return R.ok().put("data", shipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShipinEntity shipin){
        EntityWrapper< ShipinEntity> ew = new EntityWrapper< ShipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shipin, "shipin")); 
		ShipinView shipinView =  shipinService.selectView(ew);
		return R.ok("查询视频成功").put("data", shipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShipinEntity shipin = shipinService.selectById(id);
		shipin.setClicknum(shipin.getClicknum()+1);
		shipinService.updateById(shipin);
        return R.ok().put("data", shipin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShipinEntity shipin = shipinService.selectById(id);
		shipin.setClicknum(shipin.getClicknum()+1);
		shipinService.updateById(shipin);
        return R.ok().put("data", shipin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ShipinEntity shipin = shipinService.selectById(id);
        if(type.equals("1")) {
        	shipin.setThumbsupnum(shipin.getThumbsupnum()+1);
        } else {
        	shipin.setCrazilynum(shipin.getCrazilynum()+1);
        }
        shipinService.updateById(shipin);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShipinEntity shipin, HttpServletRequest request){
    	shipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipin);
        shipinService.insert(shipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShipinEntity shipin, HttpServletRequest request){
    	shipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipin);
        shipinService.insert(shipin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShipinEntity shipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shipin);
        shipinService.updateById(shipin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShipinEntity> wrapper = new EntityWrapper<ShipinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shipinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

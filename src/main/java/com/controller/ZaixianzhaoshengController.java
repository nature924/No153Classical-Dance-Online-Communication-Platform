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

import com.entity.ZaixianzhaoshengEntity;
import com.entity.view.ZaixianzhaoshengView;

import com.service.ZaixianzhaoshengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 在线招生
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@RestController
@RequestMapping("/zaixianzhaosheng")
public class ZaixianzhaoshengController {
    @Autowired
    private ZaixianzhaoshengService zaixianzhaoshengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaixianzhaoshengEntity zaixianzhaosheng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuanyonghu")) {
			zaixianzhaosheng.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZaixianzhaoshengEntity> ew = new EntityWrapper<ZaixianzhaoshengEntity>();
		PageUtils page = zaixianzhaoshengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianzhaosheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaixianzhaoshengEntity zaixianzhaosheng, HttpServletRequest request){
        EntityWrapper<ZaixianzhaoshengEntity> ew = new EntityWrapper<ZaixianzhaoshengEntity>();
		PageUtils page = zaixianzhaoshengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianzhaosheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaixianzhaoshengEntity zaixianzhaosheng){
       	EntityWrapper<ZaixianzhaoshengEntity> ew = new EntityWrapper<ZaixianzhaoshengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaixianzhaosheng, "zaixianzhaosheng")); 
        return R.ok().put("data", zaixianzhaoshengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZaixianzhaoshengEntity zaixianzhaosheng){
        EntityWrapper< ZaixianzhaoshengEntity> ew = new EntityWrapper< ZaixianzhaoshengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaixianzhaosheng, "zaixianzhaosheng")); 
		ZaixianzhaoshengView zaixianzhaoshengView =  zaixianzhaoshengService.selectView(ew);
		return R.ok("查询在线招生成功").put("data", zaixianzhaoshengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaixianzhaoshengEntity zaixianzhaosheng = zaixianzhaoshengService.selectById(id);
        return R.ok().put("data", zaixianzhaosheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaixianzhaoshengEntity zaixianzhaosheng = zaixianzhaoshengService.selectById(id);
        return R.ok().put("data", zaixianzhaosheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaixianzhaoshengEntity zaixianzhaosheng, HttpServletRequest request){
    	zaixianzhaosheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianzhaosheng);
        zaixianzhaoshengService.insert(zaixianzhaosheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZaixianzhaoshengEntity zaixianzhaosheng, HttpServletRequest request){
    	zaixianzhaosheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianzhaosheng);
        zaixianzhaoshengService.insert(zaixianzhaosheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZaixianzhaoshengEntity zaixianzhaosheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaixianzhaosheng);
        zaixianzhaoshengService.updateById(zaixianzhaosheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaixianzhaoshengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZaixianzhaoshengEntity> wrapper = new EntityWrapper<ZaixianzhaoshengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuanyonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zaixianzhaoshengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

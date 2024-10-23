package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShipinfenleiDao;
import com.entity.ShipinfenleiEntity;
import com.service.ShipinfenleiService;
import com.entity.vo.ShipinfenleiVO;
import com.entity.view.ShipinfenleiView;

@Service("shipinfenleiService")
public class ShipinfenleiServiceImpl extends ServiceImpl<ShipinfenleiDao, ShipinfenleiEntity> implements ShipinfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinfenleiEntity> page = this.selectPage(
                new Query<ShipinfenleiEntity>(params).getPage(),
                new EntityWrapper<ShipinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinfenleiEntity> wrapper) {
		  Page<ShipinfenleiView> page =new Query<ShipinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinfenleiVO> selectListVO(Wrapper<ShipinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinfenleiVO selectVO(Wrapper<ShipinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinfenleiView> selectListView(Wrapper<ShipinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinfenleiView selectView(Wrapper<ShipinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

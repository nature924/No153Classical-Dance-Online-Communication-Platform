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


import com.dao.ShipinDao;
import com.entity.ShipinEntity;
import com.service.ShipinService;
import com.entity.vo.ShipinVO;
import com.entity.view.ShipinView;

@Service("shipinService")
public class ShipinServiceImpl extends ServiceImpl<ShipinDao, ShipinEntity> implements ShipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinEntity> page = this.selectPage(
                new Query<ShipinEntity>(params).getPage(),
                new EntityWrapper<ShipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinEntity> wrapper) {
		  Page<ShipinView> page =new Query<ShipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinVO> selectListVO(Wrapper<ShipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinVO selectVO(Wrapper<ShipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinView> selectListView(Wrapper<ShipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinView selectView(Wrapper<ShipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

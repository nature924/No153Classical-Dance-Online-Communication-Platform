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


import com.dao.FushileixingDao;
import com.entity.FushileixingEntity;
import com.service.FushileixingService;
import com.entity.vo.FushileixingVO;
import com.entity.view.FushileixingView;

@Service("fushileixingService")
public class FushileixingServiceImpl extends ServiceImpl<FushileixingDao, FushileixingEntity> implements FushileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FushileixingEntity> page = this.selectPage(
                new Query<FushileixingEntity>(params).getPage(),
                new EntityWrapper<FushileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FushileixingEntity> wrapper) {
		  Page<FushileixingView> page =new Query<FushileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FushileixingVO> selectListVO(Wrapper<FushileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FushileixingVO selectVO(Wrapper<FushileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FushileixingView> selectListView(Wrapper<FushileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FushileixingView selectView(Wrapper<FushileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

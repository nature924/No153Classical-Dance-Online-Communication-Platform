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


import com.dao.FushiDao;
import com.entity.FushiEntity;
import com.service.FushiService;
import com.entity.vo.FushiVO;
import com.entity.view.FushiView;

@Service("fushiService")
public class FushiServiceImpl extends ServiceImpl<FushiDao, FushiEntity> implements FushiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FushiEntity> page = this.selectPage(
                new Query<FushiEntity>(params).getPage(),
                new EntityWrapper<FushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FushiEntity> wrapper) {
		  Page<FushiView> page =new Query<FushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FushiVO> selectListVO(Wrapper<FushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FushiVO selectVO(Wrapper<FushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FushiView> selectListView(Wrapper<FushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FushiView selectView(Wrapper<FushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

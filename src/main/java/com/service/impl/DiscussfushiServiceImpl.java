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


import com.dao.DiscussfushiDao;
import com.entity.DiscussfushiEntity;
import com.service.DiscussfushiService;
import com.entity.vo.DiscussfushiVO;
import com.entity.view.DiscussfushiView;

@Service("discussfushiService")
public class DiscussfushiServiceImpl extends ServiceImpl<DiscussfushiDao, DiscussfushiEntity> implements DiscussfushiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfushiEntity> page = this.selectPage(
                new Query<DiscussfushiEntity>(params).getPage(),
                new EntityWrapper<DiscussfushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfushiEntity> wrapper) {
		  Page<DiscussfushiView> page =new Query<DiscussfushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfushiVO> selectListVO(Wrapper<DiscussfushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfushiVO selectVO(Wrapper<DiscussfushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfushiView> selectListView(Wrapper<DiscussfushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfushiView selectView(Wrapper<DiscussfushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

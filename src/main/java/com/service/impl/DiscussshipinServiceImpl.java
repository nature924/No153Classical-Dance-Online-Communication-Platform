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


import com.dao.DiscussshipinDao;
import com.entity.DiscussshipinEntity;
import com.service.DiscussshipinService;
import com.entity.vo.DiscussshipinVO;
import com.entity.view.DiscussshipinView;

@Service("discussshipinService")
public class DiscussshipinServiceImpl extends ServiceImpl<DiscussshipinDao, DiscussshipinEntity> implements DiscussshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshipinEntity> page = this.selectPage(
                new Query<DiscussshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshipinEntity> wrapper) {
		  Page<DiscussshipinView> page =new Query<DiscussshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshipinVO> selectListVO(Wrapper<DiscussshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshipinVO selectVO(Wrapper<DiscussshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshipinView> selectListView(Wrapper<DiscussshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshipinView selectView(Wrapper<DiscussshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

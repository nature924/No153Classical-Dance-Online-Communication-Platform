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


import com.dao.DiscusswudaojiaoliuDao;
import com.entity.DiscusswudaojiaoliuEntity;
import com.service.DiscusswudaojiaoliuService;
import com.entity.vo.DiscusswudaojiaoliuVO;
import com.entity.view.DiscusswudaojiaoliuView;

@Service("discusswudaojiaoliuService")
public class DiscusswudaojiaoliuServiceImpl extends ServiceImpl<DiscusswudaojiaoliuDao, DiscusswudaojiaoliuEntity> implements DiscusswudaojiaoliuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswudaojiaoliuEntity> page = this.selectPage(
                new Query<DiscusswudaojiaoliuEntity>(params).getPage(),
                new EntityWrapper<DiscusswudaojiaoliuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswudaojiaoliuEntity> wrapper) {
		  Page<DiscusswudaojiaoliuView> page =new Query<DiscusswudaojiaoliuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswudaojiaoliuVO> selectListVO(Wrapper<DiscusswudaojiaoliuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswudaojiaoliuVO selectVO(Wrapper<DiscusswudaojiaoliuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswudaojiaoliuView> selectListView(Wrapper<DiscusswudaojiaoliuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswudaojiaoliuView selectView(Wrapper<DiscusswudaojiaoliuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

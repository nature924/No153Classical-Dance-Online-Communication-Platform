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


import com.dao.ZaixianzhaoshengDao;
import com.entity.ZaixianzhaoshengEntity;
import com.service.ZaixianzhaoshengService;
import com.entity.vo.ZaixianzhaoshengVO;
import com.entity.view.ZaixianzhaoshengView;

@Service("zaixianzhaoshengService")
public class ZaixianzhaoshengServiceImpl extends ServiceImpl<ZaixianzhaoshengDao, ZaixianzhaoshengEntity> implements ZaixianzhaoshengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianzhaoshengEntity> page = this.selectPage(
                new Query<ZaixianzhaoshengEntity>(params).getPage(),
                new EntityWrapper<ZaixianzhaoshengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianzhaoshengEntity> wrapper) {
		  Page<ZaixianzhaoshengView> page =new Query<ZaixianzhaoshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianzhaoshengVO> selectListVO(Wrapper<ZaixianzhaoshengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianzhaoshengVO selectVO(Wrapper<ZaixianzhaoshengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianzhaoshengView> selectListView(Wrapper<ZaixianzhaoshengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianzhaoshengView selectView(Wrapper<ZaixianzhaoshengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

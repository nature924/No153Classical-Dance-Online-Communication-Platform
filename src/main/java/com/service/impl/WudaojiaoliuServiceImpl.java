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


import com.dao.WudaojiaoliuDao;
import com.entity.WudaojiaoliuEntity;
import com.service.WudaojiaoliuService;
import com.entity.vo.WudaojiaoliuVO;
import com.entity.view.WudaojiaoliuView;

@Service("wudaojiaoliuService")
public class WudaojiaoliuServiceImpl extends ServiceImpl<WudaojiaoliuDao, WudaojiaoliuEntity> implements WudaojiaoliuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WudaojiaoliuEntity> page = this.selectPage(
                new Query<WudaojiaoliuEntity>(params).getPage(),
                new EntityWrapper<WudaojiaoliuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WudaojiaoliuEntity> wrapper) {
		  Page<WudaojiaoliuView> page =new Query<WudaojiaoliuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WudaojiaoliuVO> selectListVO(Wrapper<WudaojiaoliuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WudaojiaoliuVO selectVO(Wrapper<WudaojiaoliuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WudaojiaoliuView> selectListView(Wrapper<WudaojiaoliuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WudaojiaoliuView selectView(Wrapper<WudaojiaoliuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.HuiyuanyonghuDao;
import com.entity.HuiyuanyonghuEntity;
import com.service.HuiyuanyonghuService;
import com.entity.vo.HuiyuanyonghuVO;
import com.entity.view.HuiyuanyonghuView;

@Service("huiyuanyonghuService")
public class HuiyuanyonghuServiceImpl extends ServiceImpl<HuiyuanyonghuDao, HuiyuanyonghuEntity> implements HuiyuanyonghuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanyonghuEntity> page = this.selectPage(
                new Query<HuiyuanyonghuEntity>(params).getPage(),
                new EntityWrapper<HuiyuanyonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanyonghuEntity> wrapper) {
		  Page<HuiyuanyonghuView> page =new Query<HuiyuanyonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanyonghuVO> selectListVO(Wrapper<HuiyuanyonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanyonghuVO selectVO(Wrapper<HuiyuanyonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanyonghuView> selectListView(Wrapper<HuiyuanyonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanyonghuView selectView(Wrapper<HuiyuanyonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

package com.dao;

import com.entity.FushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FushiVO;
import com.entity.view.FushiView;


/**
 * 服饰
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface FushiDao extends BaseMapper<FushiEntity> {
	
	List<FushiVO> selectListVO(@Param("ew") Wrapper<FushiEntity> wrapper);
	
	FushiVO selectVO(@Param("ew") Wrapper<FushiEntity> wrapper);
	
	List<FushiView> selectListView(@Param("ew") Wrapper<FushiEntity> wrapper);

	List<FushiView> selectListView(Pagination page,@Param("ew") Wrapper<FushiEntity> wrapper);
	
	FushiView selectView(@Param("ew") Wrapper<FushiEntity> wrapper);
	
}

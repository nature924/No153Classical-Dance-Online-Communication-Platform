package com.dao;

import com.entity.DiscussfushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfushiVO;
import com.entity.view.DiscussfushiView;


/**
 * 服饰评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface DiscussfushiDao extends BaseMapper<DiscussfushiEntity> {
	
	List<DiscussfushiVO> selectListVO(@Param("ew") Wrapper<DiscussfushiEntity> wrapper);
	
	DiscussfushiVO selectVO(@Param("ew") Wrapper<DiscussfushiEntity> wrapper);
	
	List<DiscussfushiView> selectListView(@Param("ew") Wrapper<DiscussfushiEntity> wrapper);

	List<DiscussfushiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfushiEntity> wrapper);
	
	DiscussfushiView selectView(@Param("ew") Wrapper<DiscussfushiEntity> wrapper);
	
}

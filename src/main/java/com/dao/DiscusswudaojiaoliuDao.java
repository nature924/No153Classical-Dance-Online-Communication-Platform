package com.dao;

import com.entity.DiscusswudaojiaoliuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswudaojiaoliuVO;
import com.entity.view.DiscusswudaojiaoliuView;


/**
 * 舞蹈交流评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface DiscusswudaojiaoliuDao extends BaseMapper<DiscusswudaojiaoliuEntity> {
	
	List<DiscusswudaojiaoliuVO> selectListVO(@Param("ew") Wrapper<DiscusswudaojiaoliuEntity> wrapper);
	
	DiscusswudaojiaoliuVO selectVO(@Param("ew") Wrapper<DiscusswudaojiaoliuEntity> wrapper);
	
	List<DiscusswudaojiaoliuView> selectListView(@Param("ew") Wrapper<DiscusswudaojiaoliuEntity> wrapper);

	List<DiscusswudaojiaoliuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswudaojiaoliuEntity> wrapper);
	
	DiscusswudaojiaoliuView selectView(@Param("ew") Wrapper<DiscusswudaojiaoliuEntity> wrapper);
	
}

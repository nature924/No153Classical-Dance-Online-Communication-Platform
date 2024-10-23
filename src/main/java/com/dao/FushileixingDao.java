package com.dao;

import com.entity.FushileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FushileixingVO;
import com.entity.view.FushileixingView;


/**
 * 服饰类型
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface FushileixingDao extends BaseMapper<FushileixingEntity> {
	
	List<FushileixingVO> selectListVO(@Param("ew") Wrapper<FushileixingEntity> wrapper);
	
	FushileixingVO selectVO(@Param("ew") Wrapper<FushileixingEntity> wrapper);
	
	List<FushileixingView> selectListView(@Param("ew") Wrapper<FushileixingEntity> wrapper);

	List<FushileixingView> selectListView(Pagination page,@Param("ew") Wrapper<FushileixingEntity> wrapper);
	
	FushileixingView selectView(@Param("ew") Wrapper<FushileixingEntity> wrapper);
	
}

package com.dao;

import com.entity.DiscussshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipinVO;
import com.entity.view.DiscussshipinView;


/**
 * 视频评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface DiscussshipinDao extends BaseMapper<DiscussshipinEntity> {
	
	List<DiscussshipinVO> selectListVO(@Param("ew") Wrapper<DiscussshipinEntity> wrapper);
	
	DiscussshipinVO selectVO(@Param("ew") Wrapper<DiscussshipinEntity> wrapper);
	
	List<DiscussshipinView> selectListView(@Param("ew") Wrapper<DiscussshipinEntity> wrapper);

	List<DiscussshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipinEntity> wrapper);
	
	DiscussshipinView selectView(@Param("ew") Wrapper<DiscussshipinEntity> wrapper);
	
}

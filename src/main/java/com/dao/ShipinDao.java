package com.dao;

import com.entity.ShipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinVO;
import com.entity.view.ShipinView;


/**
 * 视频
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface ShipinDao extends BaseMapper<ShipinEntity> {
	
	List<ShipinVO> selectListVO(@Param("ew") Wrapper<ShipinEntity> wrapper);
	
	ShipinVO selectVO(@Param("ew") Wrapper<ShipinEntity> wrapper);
	
	List<ShipinView> selectListView(@Param("ew") Wrapper<ShipinEntity> wrapper);

	List<ShipinView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinEntity> wrapper);
	
	ShipinView selectView(@Param("ew") Wrapper<ShipinEntity> wrapper);
	
}

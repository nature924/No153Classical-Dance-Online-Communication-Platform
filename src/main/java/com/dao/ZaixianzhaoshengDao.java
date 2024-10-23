package com.dao;

import com.entity.ZaixianzhaoshengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianzhaoshengVO;
import com.entity.view.ZaixianzhaoshengView;


/**
 * 在线招生
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface ZaixianzhaoshengDao extends BaseMapper<ZaixianzhaoshengEntity> {
	
	List<ZaixianzhaoshengVO> selectListVO(@Param("ew") Wrapper<ZaixianzhaoshengEntity> wrapper);
	
	ZaixianzhaoshengVO selectVO(@Param("ew") Wrapper<ZaixianzhaoshengEntity> wrapper);
	
	List<ZaixianzhaoshengView> selectListView(@Param("ew") Wrapper<ZaixianzhaoshengEntity> wrapper);

	List<ZaixianzhaoshengView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianzhaoshengEntity> wrapper);
	
	ZaixianzhaoshengView selectView(@Param("ew") Wrapper<ZaixianzhaoshengEntity> wrapper);
	
}

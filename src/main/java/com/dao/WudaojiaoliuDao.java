package com.dao;

import com.entity.WudaojiaoliuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WudaojiaoliuVO;
import com.entity.view.WudaojiaoliuView;


/**
 * 舞蹈交流
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface WudaojiaoliuDao extends BaseMapper<WudaojiaoliuEntity> {
	
	List<WudaojiaoliuVO> selectListVO(@Param("ew") Wrapper<WudaojiaoliuEntity> wrapper);
	
	WudaojiaoliuVO selectVO(@Param("ew") Wrapper<WudaojiaoliuEntity> wrapper);
	
	List<WudaojiaoliuView> selectListView(@Param("ew") Wrapper<WudaojiaoliuEntity> wrapper);

	List<WudaojiaoliuView> selectListView(Pagination page,@Param("ew") Wrapper<WudaojiaoliuEntity> wrapper);
	
	WudaojiaoliuView selectView(@Param("ew") Wrapper<WudaojiaoliuEntity> wrapper);
	
}

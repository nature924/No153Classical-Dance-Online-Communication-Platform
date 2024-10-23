package com.dao;

import com.entity.HuiyuanyonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanyonghuVO;
import com.entity.view.HuiyuanyonghuView;


/**
 * 会员用户
 * 
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface HuiyuanyonghuDao extends BaseMapper<HuiyuanyonghuEntity> {
	
	List<HuiyuanyonghuVO> selectListVO(@Param("ew") Wrapper<HuiyuanyonghuEntity> wrapper);
	
	HuiyuanyonghuVO selectVO(@Param("ew") Wrapper<HuiyuanyonghuEntity> wrapper);
	
	List<HuiyuanyonghuView> selectListView(@Param("ew") Wrapper<HuiyuanyonghuEntity> wrapper);

	List<HuiyuanyonghuView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanyonghuEntity> wrapper);
	
	HuiyuanyonghuView selectView(@Param("ew") Wrapper<HuiyuanyonghuEntity> wrapper);
	
}

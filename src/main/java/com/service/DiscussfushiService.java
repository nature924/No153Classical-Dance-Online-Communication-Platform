package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfushiView;


/**
 * 服饰评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface DiscussfushiService extends IService<DiscussfushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfushiVO> selectListVO(Wrapper<DiscussfushiEntity> wrapper);
   	
   	DiscussfushiVO selectVO(@Param("ew") Wrapper<DiscussfushiEntity> wrapper);
   	
   	List<DiscussfushiView> selectListView(Wrapper<DiscussfushiEntity> wrapper);
   	
   	DiscussfushiView selectView(@Param("ew") Wrapper<DiscussfushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfushiEntity> wrapper);
   	
}


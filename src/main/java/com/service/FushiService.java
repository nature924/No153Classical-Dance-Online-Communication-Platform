package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FushiView;


/**
 * 服饰
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface FushiService extends IService<FushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FushiVO> selectListVO(Wrapper<FushiEntity> wrapper);
   	
   	FushiVO selectVO(@Param("ew") Wrapper<FushiEntity> wrapper);
   	
   	List<FushiView> selectListView(Wrapper<FushiEntity> wrapper);
   	
   	FushiView selectView(@Param("ew") Wrapper<FushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FushiEntity> wrapper);
   	
}


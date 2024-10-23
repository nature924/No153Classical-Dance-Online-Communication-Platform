package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FushileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FushileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FushileixingView;


/**
 * 服饰类型
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface FushileixingService extends IService<FushileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FushileixingVO> selectListVO(Wrapper<FushileixingEntity> wrapper);
   	
   	FushileixingVO selectVO(@Param("ew") Wrapper<FushileixingEntity> wrapper);
   	
   	List<FushileixingView> selectListView(Wrapper<FushileixingEntity> wrapper);
   	
   	FushileixingView selectView(@Param("ew") Wrapper<FushileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FushileixingEntity> wrapper);
   	
}


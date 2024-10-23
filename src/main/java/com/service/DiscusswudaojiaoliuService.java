package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswudaojiaoliuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswudaojiaoliuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswudaojiaoliuView;


/**
 * 舞蹈交流评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface DiscusswudaojiaoliuService extends IService<DiscusswudaojiaoliuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswudaojiaoliuVO> selectListVO(Wrapper<DiscusswudaojiaoliuEntity> wrapper);
   	
   	DiscusswudaojiaoliuVO selectVO(@Param("ew") Wrapper<DiscusswudaojiaoliuEntity> wrapper);
   	
   	List<DiscusswudaojiaoliuView> selectListView(Wrapper<DiscusswudaojiaoliuEntity> wrapper);
   	
   	DiscusswudaojiaoliuView selectView(@Param("ew") Wrapper<DiscusswudaojiaoliuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswudaojiaoliuEntity> wrapper);
   	
}


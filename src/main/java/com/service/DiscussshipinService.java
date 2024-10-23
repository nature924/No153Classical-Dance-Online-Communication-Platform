package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipinView;


/**
 * 视频评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface DiscussshipinService extends IService<DiscussshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipinVO> selectListVO(Wrapper<DiscussshipinEntity> wrapper);
   	
   	DiscussshipinVO selectVO(@Param("ew") Wrapper<DiscussshipinEntity> wrapper);
   	
   	List<DiscussshipinView> selectListView(Wrapper<DiscussshipinEntity> wrapper);
   	
   	DiscussshipinView selectView(@Param("ew") Wrapper<DiscussshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipinEntity> wrapper);
   	
}


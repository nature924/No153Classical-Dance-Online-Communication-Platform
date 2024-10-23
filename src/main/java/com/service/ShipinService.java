package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinView;


/**
 * 视频
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface ShipinService extends IService<ShipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinVO> selectListVO(Wrapper<ShipinEntity> wrapper);
   	
   	ShipinVO selectVO(@Param("ew") Wrapper<ShipinEntity> wrapper);
   	
   	List<ShipinView> selectListView(Wrapper<ShipinEntity> wrapper);
   	
   	ShipinView selectView(@Param("ew") Wrapper<ShipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinEntity> wrapper);
   	
}


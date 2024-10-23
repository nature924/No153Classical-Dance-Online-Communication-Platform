package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinfenleiView;


/**
 * 视频分类
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface ShipinfenleiService extends IService<ShipinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinfenleiVO> selectListVO(Wrapper<ShipinfenleiEntity> wrapper);
   	
   	ShipinfenleiVO selectVO(@Param("ew") Wrapper<ShipinfenleiEntity> wrapper);
   	
   	List<ShipinfenleiView> selectListView(Wrapper<ShipinfenleiEntity> wrapper);
   	
   	ShipinfenleiView selectView(@Param("ew") Wrapper<ShipinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinfenleiEntity> wrapper);
   	
}


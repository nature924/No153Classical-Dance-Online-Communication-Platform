package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WudaojiaoliuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WudaojiaoliuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WudaojiaoliuView;


/**
 * 舞蹈交流
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface WudaojiaoliuService extends IService<WudaojiaoliuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WudaojiaoliuVO> selectListVO(Wrapper<WudaojiaoliuEntity> wrapper);
   	
   	WudaojiaoliuVO selectVO(@Param("ew") Wrapper<WudaojiaoliuEntity> wrapper);
   	
   	List<WudaojiaoliuView> selectListView(Wrapper<WudaojiaoliuEntity> wrapper);
   	
   	WudaojiaoliuView selectView(@Param("ew") Wrapper<WudaojiaoliuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WudaojiaoliuEntity> wrapper);
   	
}


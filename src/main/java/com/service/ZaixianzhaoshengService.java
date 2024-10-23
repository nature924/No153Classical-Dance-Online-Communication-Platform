package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianzhaoshengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianzhaoshengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianzhaoshengView;


/**
 * 在线招生
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface ZaixianzhaoshengService extends IService<ZaixianzhaoshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianzhaoshengVO> selectListVO(Wrapper<ZaixianzhaoshengEntity> wrapper);
   	
   	ZaixianzhaoshengVO selectVO(@Param("ew") Wrapper<ZaixianzhaoshengEntity> wrapper);
   	
   	List<ZaixianzhaoshengView> selectListView(Wrapper<ZaixianzhaoshengEntity> wrapper);
   	
   	ZaixianzhaoshengView selectView(@Param("ew") Wrapper<ZaixianzhaoshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianzhaoshengEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanyonghuView;


/**
 * 会员用户
 *
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public interface HuiyuanyonghuService extends IService<HuiyuanyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanyonghuVO> selectListVO(Wrapper<HuiyuanyonghuEntity> wrapper);
   	
   	HuiyuanyonghuVO selectVO(@Param("ew") Wrapper<HuiyuanyonghuEntity> wrapper);
   	
   	List<HuiyuanyonghuView> selectListView(Wrapper<HuiyuanyonghuEntity> wrapper);
   	
   	HuiyuanyonghuView selectView(@Param("ew") Wrapper<HuiyuanyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanyonghuEntity> wrapper);
   	
}


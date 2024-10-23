package com.entity.view;

import com.entity.FushiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服饰
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@TableName("fushi")
public class FushiView  extends FushiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FushiView(){
	}
 
 	public FushiView(FushiEntity fushiEntity){
 	try {
			BeanUtils.copyProperties(this, fushiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

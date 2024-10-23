package com.entity.view;

import com.entity.FushileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服饰类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@TableName("fushileixing")
public class FushileixingView  extends FushileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FushileixingView(){
	}
 
 	public FushileixingView(FushileixingEntity fushileixingEntity){
 	try {
			BeanUtils.copyProperties(this, fushileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

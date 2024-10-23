package com.entity.view;

import com.entity.ZaixianzhaoshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线招生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@TableName("zaixianzhaosheng")
public class ZaixianzhaoshengView  extends ZaixianzhaoshengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixianzhaoshengView(){
	}
 
 	public ZaixianzhaoshengView(ZaixianzhaoshengEntity zaixianzhaoshengEntity){
 	try {
			BeanUtils.copyProperties(this, zaixianzhaoshengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

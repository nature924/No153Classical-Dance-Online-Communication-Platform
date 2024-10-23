package com.entity.view;

import com.entity.WudaojiaoliuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 舞蹈交流
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@TableName("wudaojiaoliu")
public class WudaojiaoliuView  extends WudaojiaoliuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WudaojiaoliuView(){
	}
 
 	public WudaojiaoliuView(WudaojiaoliuEntity wudaojiaoliuEntity){
 	try {
			BeanUtils.copyProperties(this, wudaojiaoliuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.ShipinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@TableName("shipinfenlei")
public class ShipinfenleiView  extends ShipinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipinfenleiView(){
	}
 
 	public ShipinfenleiView(ShipinfenleiEntity shipinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shipinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

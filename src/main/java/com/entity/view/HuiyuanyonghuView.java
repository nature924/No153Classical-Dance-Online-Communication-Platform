package com.entity.view;

import com.entity.HuiyuanyonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员用户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
@TableName("huiyuanyonghu")
public class HuiyuanyonghuView  extends HuiyuanyonghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanyonghuView(){
	}
 
 	public HuiyuanyonghuView(HuiyuanyonghuEntity huiyuanyonghuEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanyonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

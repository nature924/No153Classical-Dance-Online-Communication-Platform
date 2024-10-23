package com.entity.model;

import com.entity.ShipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 视频
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-19 10:26:36
 */
public class ShipinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 视频名称
	 */
	
	private String shipinmingcheng;
		
	/**
	 * 视频分类
	 */
	
	private String shipinfenlei;
		
	/**
	 * 视频封面
	 */
	
	private String shipinfengmian;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 视频介绍
	 */
	
	private String shipinjieshao;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：视频名称
	 */
	 
	public void setShipinmingcheng(String shipinmingcheng) {
		this.shipinmingcheng = shipinmingcheng;
	}
	
	/**
	 * 获取：视频名称
	 */
	public String getShipinmingcheng() {
		return shipinmingcheng;
	}
				
	
	/**
	 * 设置：视频分类
	 */
	 
	public void setShipinfenlei(String shipinfenlei) {
		this.shipinfenlei = shipinfenlei;
	}
	
	/**
	 * 获取：视频分类
	 */
	public String getShipinfenlei() {
		return shipinfenlei;
	}
				
	
	/**
	 * 设置：视频封面
	 */
	 
	public void setShipinfengmian(String shipinfengmian) {
		this.shipinfengmian = shipinfengmian;
	}
	
	/**
	 * 获取：视频封面
	 */
	public String getShipinfengmian() {
		return shipinfengmian;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：视频介绍
	 */
	 
	public void setShipinjieshao(String shipinjieshao) {
		this.shipinjieshao = shipinjieshao;
	}
	
	/**
	 * 获取：视频介绍
	 */
	public String getShipinjieshao() {
		return shipinjieshao;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}

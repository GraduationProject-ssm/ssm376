package com.entity.vo;

import com.entity.JiangjinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 奖金信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-10 20:49:05
 */
public class JiangjinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 奖金类型
	 */
	
	private String jiangjinleixing;
		
	/**
	 * 奖金金额
	 */
	
	private Integer jiangjinjine;
		
	/**
	 * 申请条件
	 */
	
	private String shenqingtiaojian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：奖金类型
	 */
	 
	public void setJiangjinleixing(String jiangjinleixing) {
		this.jiangjinleixing = jiangjinleixing;
	}
	
	/**
	 * 获取：奖金类型
	 */
	public String getJiangjinleixing() {
		return jiangjinleixing;
	}
				
	
	/**
	 * 设置：奖金金额
	 */
	 
	public void setJiangjinjine(Integer jiangjinjine) {
		this.jiangjinjine = jiangjinjine;
	}
	
	/**
	 * 获取：奖金金额
	 */
	public Integer getJiangjinjine() {
		return jiangjinjine;
	}
				
	
	/**
	 * 设置：申请条件
	 */
	 
	public void setShenqingtiaojian(String shenqingtiaojian) {
		this.shenqingtiaojian = shenqingtiaojian;
	}
	
	/**
	 * 获取：申请条件
	 */
	public String getShenqingtiaojian() {
		return shenqingtiaojian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}

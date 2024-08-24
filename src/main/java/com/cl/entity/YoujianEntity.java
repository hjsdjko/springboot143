package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 邮件
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
@TableName("youjian")
public class YoujianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YoujianEntity() {
		
	}
	
	public YoujianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 邮件标题
	 */
					
	private String youjianbiaoti;
	
	/**
	 * 发送日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fasongriqi;
	
	/**
	 * 邮件内容
	 */
					
	private String youjianneirong;
	
	/**
	 * 接收人账号
	 */
					
	private String jieshourenzhanghao;
	
	/**
	 * 发送人账号
	 */
					
	private String fasongrenzhanghao;
	
	/**
	 * 发送人姓名
	 */
					
	private String fasongrenxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：邮件标题
	 */
	public void setYoujianbiaoti(String youjianbiaoti) {
		this.youjianbiaoti = youjianbiaoti;
	}
	/**
	 * 获取：邮件标题
	 */
	public String getYoujianbiaoti() {
		return youjianbiaoti;
	}
	/**
	 * 设置：发送日期
	 */
	public void setFasongriqi(Date fasongriqi) {
		this.fasongriqi = fasongriqi;
	}
	/**
	 * 获取：发送日期
	 */
	public Date getFasongriqi() {
		return fasongriqi;
	}
	/**
	 * 设置：邮件内容
	 */
	public void setYoujianneirong(String youjianneirong) {
		this.youjianneirong = youjianneirong;
	}
	/**
	 * 获取：邮件内容
	 */
	public String getYoujianneirong() {
		return youjianneirong;
	}
	/**
	 * 设置：接收人账号
	 */
	public void setJieshourenzhanghao(String jieshourenzhanghao) {
		this.jieshourenzhanghao = jieshourenzhanghao;
	}
	/**
	 * 获取：接收人账号
	 */
	public String getJieshourenzhanghao() {
		return jieshourenzhanghao;
	}
	/**
	 * 设置：发送人账号
	 */
	public void setFasongrenzhanghao(String fasongrenzhanghao) {
		this.fasongrenzhanghao = fasongrenzhanghao;
	}
	/**
	 * 获取：发送人账号
	 */
	public String getFasongrenzhanghao() {
		return fasongrenzhanghao;
	}
	/**
	 * 设置：发送人姓名
	 */
	public void setFasongrenxingming(String fasongrenxingming) {
		this.fasongrenxingming = fasongrenxingming;
	}
	/**
	 * 获取：发送人姓名
	 */
	public String getFasongrenxingming() {
		return fasongrenxingming;
	}

}

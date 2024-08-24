package com.cl.entity.view;

import com.cl.entity.TehuihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 特惠活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
@TableName("tehuihuodong")
public class TehuihuodongView  extends TehuihuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TehuihuodongView(){
	}
 
 	public TehuihuodongView(TehuihuodongEntity tehuihuodongEntity){
 	try {
			BeanUtils.copyProperties(this, tehuihuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}

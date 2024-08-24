package com.cl.entity.view;

import com.cl.entity.DiscusstehuihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 特惠活动评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
@TableName("discusstehuihuodong")
public class DiscusstehuihuodongView  extends DiscusstehuihuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstehuihuodongView(){
	}
 
 	public DiscusstehuihuodongView(DiscusstehuihuodongEntity discusstehuihuodongEntity){
 	try {
			BeanUtils.copyProperties(this, discusstehuihuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}

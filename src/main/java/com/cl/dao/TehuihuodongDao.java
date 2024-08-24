package com.cl.dao;

import com.cl.entity.TehuihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TehuihuodongView;


/**
 * 特惠活动
 * 
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
public interface TehuihuodongDao extends BaseMapper<TehuihuodongEntity> {
	
	List<TehuihuodongView> selectListView(@Param("ew") Wrapper<TehuihuodongEntity> wrapper);

	List<TehuihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<TehuihuodongEntity> wrapper);
	
	TehuihuodongView selectView(@Param("ew") Wrapper<TehuihuodongEntity> wrapper);
	

}

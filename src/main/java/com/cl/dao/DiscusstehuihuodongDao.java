package com.cl.dao;

import com.cl.entity.DiscusstehuihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusstehuihuodongView;


/**
 * 特惠活动评论表
 * 
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
public interface DiscusstehuihuodongDao extends BaseMapper<DiscusstehuihuodongEntity> {
	
	List<DiscusstehuihuodongView> selectListView(@Param("ew") Wrapper<DiscusstehuihuodongEntity> wrapper);

	List<DiscusstehuihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstehuihuodongEntity> wrapper);
	
	DiscusstehuihuodongView selectView(@Param("ew") Wrapper<DiscusstehuihuodongEntity> wrapper);
	

}

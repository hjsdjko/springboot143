package com.cl.dao;

import com.cl.entity.YoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YoujianView;


/**
 * 邮件
 * 
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
public interface YoujianDao extends BaseMapper<YoujianEntity> {
	
	List<YoujianView> selectListView(@Param("ew") Wrapper<YoujianEntity> wrapper);

	List<YoujianView> selectListView(Pagination page,@Param("ew") Wrapper<YoujianEntity> wrapper);
	
	YoujianView selectView(@Param("ew") Wrapper<YoujianEntity> wrapper);
	

}

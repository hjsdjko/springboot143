package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TehuihuodongEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TehuihuodongView;


/**
 * 特惠活动
 *
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
public interface TehuihuodongService extends IService<TehuihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TehuihuodongView> selectListView(Wrapper<TehuihuodongEntity> wrapper);
   	
   	TehuihuodongView selectView(@Param("ew") Wrapper<TehuihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TehuihuodongEntity> wrapper);
   	

}


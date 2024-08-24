package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusstehuihuodongEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusstehuihuodongView;


/**
 * 特惠活动评论表
 *
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
public interface DiscusstehuihuodongService extends IService<DiscusstehuihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstehuihuodongView> selectListView(Wrapper<DiscusstehuihuodongEntity> wrapper);
   	
   	DiscusstehuihuodongView selectView(@Param("ew") Wrapper<DiscusstehuihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstehuihuodongEntity> wrapper);
   	

}


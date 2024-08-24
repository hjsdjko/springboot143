package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YoujianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YoujianView;


/**
 * 邮件
 *
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
public interface YoujianService extends IService<YoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YoujianView> selectListView(Wrapper<YoujianEntity> wrapper);
   	
   	YoujianView selectView(@Param("ew") Wrapper<YoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YoujianEntity> wrapper);
   	

}


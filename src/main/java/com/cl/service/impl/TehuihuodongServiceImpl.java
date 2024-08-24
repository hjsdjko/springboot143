package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.TehuihuodongDao;
import com.cl.entity.TehuihuodongEntity;
import com.cl.service.TehuihuodongService;
import com.cl.entity.view.TehuihuodongView;

@Service("tehuihuodongService")
public class TehuihuodongServiceImpl extends ServiceImpl<TehuihuodongDao, TehuihuodongEntity> implements TehuihuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TehuihuodongEntity> page = this.selectPage(
                new Query<TehuihuodongEntity>(params).getPage(),
                new EntityWrapper<TehuihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TehuihuodongEntity> wrapper) {
		  Page<TehuihuodongView> page =new Query<TehuihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TehuihuodongView> selectListView(Wrapper<TehuihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TehuihuodongView selectView(Wrapper<TehuihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

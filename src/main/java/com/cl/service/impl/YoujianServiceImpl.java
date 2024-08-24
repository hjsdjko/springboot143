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


import com.cl.dao.YoujianDao;
import com.cl.entity.YoujianEntity;
import com.cl.service.YoujianService;
import com.cl.entity.view.YoujianView;

@Service("youjianService")
public class YoujianServiceImpl extends ServiceImpl<YoujianDao, YoujianEntity> implements YoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YoujianEntity> page = this.selectPage(
                new Query<YoujianEntity>(params).getPage(),
                new EntityWrapper<YoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YoujianEntity> wrapper) {
		  Page<YoujianView> page =new Query<YoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YoujianView> selectListView(Wrapper<YoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YoujianView selectView(Wrapper<YoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

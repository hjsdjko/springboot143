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


import com.cl.dao.DiscusstehuihuodongDao;
import com.cl.entity.DiscusstehuihuodongEntity;
import com.cl.service.DiscusstehuihuodongService;
import com.cl.entity.view.DiscusstehuihuodongView;

@Service("discusstehuihuodongService")
public class DiscusstehuihuodongServiceImpl extends ServiceImpl<DiscusstehuihuodongDao, DiscusstehuihuodongEntity> implements DiscusstehuihuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstehuihuodongEntity> page = this.selectPage(
                new Query<DiscusstehuihuodongEntity>(params).getPage(),
                new EntityWrapper<DiscusstehuihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstehuihuodongEntity> wrapper) {
		  Page<DiscusstehuihuodongView> page =new Query<DiscusstehuihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusstehuihuodongView> selectListView(Wrapper<DiscusstehuihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstehuihuodongView selectView(Wrapper<DiscusstehuihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

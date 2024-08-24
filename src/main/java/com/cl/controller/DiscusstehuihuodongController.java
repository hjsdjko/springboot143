package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.DiscusstehuihuodongEntity;
import com.cl.entity.view.DiscusstehuihuodongView;

import com.cl.service.DiscusstehuihuodongService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MD5Util;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;

/**
 * 特惠活动评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
@RestController
@RequestMapping("/discusstehuihuodong")
public class DiscusstehuihuodongController {
    @Autowired
    private DiscusstehuihuodongService discusstehuihuodongService;





    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusstehuihuodongEntity discusstehuihuodong, 
		HttpServletRequest request){

        EntityWrapper<DiscusstehuihuodongEntity> ew = new EntityWrapper<DiscusstehuihuodongEntity>();


		PageUtils page = discusstehuihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusstehuihuodong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusstehuihuodongEntity discusstehuihuodong, 
		HttpServletRequest request){
        EntityWrapper<DiscusstehuihuodongEntity> ew = new EntityWrapper<DiscusstehuihuodongEntity>();

		PageUtils page = discusstehuihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusstehuihuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusstehuihuodongEntity discusstehuihuodong){
       	EntityWrapper<DiscusstehuihuodongEntity> ew = new EntityWrapper<DiscusstehuihuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusstehuihuodong, "discusstehuihuodong")); 
        return R.ok().put("data", discusstehuihuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusstehuihuodongEntity discusstehuihuodong){
        EntityWrapper< DiscusstehuihuodongEntity> ew = new EntityWrapper< DiscusstehuihuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusstehuihuodong, "discusstehuihuodong")); 
		DiscusstehuihuodongView discusstehuihuodongView =  discusstehuihuodongService.selectView(ew);
		return R.ok("查询特惠活动评论表成功").put("data", discusstehuihuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusstehuihuodongEntity discusstehuihuodong = discusstehuihuodongService.selectById(id);
        return R.ok().put("data", discusstehuihuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusstehuihuodongEntity discusstehuihuodong = discusstehuihuodongService.selectById(id);
        return R.ok().put("data", discusstehuihuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusstehuihuodongEntity discusstehuihuodong, HttpServletRequest request){
    	discusstehuihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusstehuihuodong);

        discusstehuihuodongService.insert(discusstehuihuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusstehuihuodongEntity discusstehuihuodong, HttpServletRequest request){
    	discusstehuihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusstehuihuodong);

        discusstehuihuodongService.insert(discusstehuihuodong);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscusstehuihuodongEntity discusstehuihuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusstehuihuodong);
        discusstehuihuodongService.updateById(discusstehuihuodong);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusstehuihuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusstehuihuodongEntity discusstehuihuodong, HttpServletRequest request,String pre){
        EntityWrapper<DiscusstehuihuodongEntity> ew = new EntityWrapper<DiscusstehuihuodongEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discusstehuihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusstehuihuodong), params), params));
        return R.ok().put("data", page);
    }







}

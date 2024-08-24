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

import com.cl.entity.TehuihuodongEntity;
import com.cl.entity.view.TehuihuodongView;

import com.cl.service.TehuihuodongService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MD5Util;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 特惠活动
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
@RestController
@RequestMapping("/tehuihuodong")
public class TehuihuodongController {
    @Autowired
    private TehuihuodongService tehuihuodongService;



    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TehuihuodongEntity tehuihuodong, 
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){

        EntityWrapper<TehuihuodongEntity> ew = new EntityWrapper<TehuihuodongEntity>();

                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = tehuihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tehuihuodong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TehuihuodongEntity tehuihuodong, 
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<TehuihuodongEntity> ew = new EntityWrapper<TehuihuodongEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = tehuihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tehuihuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TehuihuodongEntity tehuihuodong){
       	EntityWrapper<TehuihuodongEntity> ew = new EntityWrapper<TehuihuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tehuihuodong, "tehuihuodong")); 
        return R.ok().put("data", tehuihuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TehuihuodongEntity tehuihuodong){
        EntityWrapper< TehuihuodongEntity> ew = new EntityWrapper< TehuihuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tehuihuodong, "tehuihuodong")); 
		TehuihuodongView tehuihuodongView =  tehuihuodongService.selectView(ew);
		return R.ok("查询特惠活动成功").put("data", tehuihuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TehuihuodongEntity tehuihuodong = tehuihuodongService.selectById(id);
		tehuihuodong.setClicknum(tehuihuodong.getClicknum()+1);
		tehuihuodongService.updateById(tehuihuodong);
        return R.ok().put("data", tehuihuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TehuihuodongEntity tehuihuodong = tehuihuodongService.selectById(id);
		tehuihuodong.setClicknum(tehuihuodong.getClicknum()+1);
		tehuihuodongService.updateById(tehuihuodong);
        return R.ok().put("data", tehuihuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TehuihuodongEntity tehuihuodong, HttpServletRequest request){
    	tehuihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tehuihuodong);

        tehuihuodongService.insert(tehuihuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TehuihuodongEntity tehuihuodong, HttpServletRequest request){
    	tehuihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tehuihuodong);

        tehuihuodongService.insert(tehuihuodong);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TehuihuodongEntity tehuihuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tehuihuodong);
        tehuihuodongService.updateById(tehuihuodong);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tehuihuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







}

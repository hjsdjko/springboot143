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

import com.cl.entity.YoujianEntity;
import com.cl.entity.view.YoujianView;

import com.cl.service.YoujianService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MD5Util;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;

/**
 * 邮件
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 09:18:08
 */
@RestController
@RequestMapping("/youjian")
public class YoujianController {
    @Autowired
    private YoujianService youjianService;





    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YoujianEntity youjian, 
		HttpServletRequest request){

        EntityWrapper<YoujianEntity> ew = new EntityWrapper<YoujianEntity>();


		String tableName = request.getSession().getAttribute("tableName").toString();
        ew.andNew();
		if(tableName.equals("yonghu")) {
            ew.eq("jieshourenzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
            ew.or();
            ew.eq("fasongrenzhanghao", (String)request.getSession().getAttribute("username"));
		}
		PageUtils page = youjianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youjian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YoujianEntity youjian, 
		HttpServletRequest request){
        EntityWrapper<YoujianEntity> ew = new EntityWrapper<YoujianEntity>();

		PageUtils page = youjianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youjian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YoujianEntity youjian){
       	EntityWrapper<YoujianEntity> ew = new EntityWrapper<YoujianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youjian, "youjian")); 
        return R.ok().put("data", youjianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YoujianEntity youjian){
        EntityWrapper< YoujianEntity> ew = new EntityWrapper< YoujianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youjian, "youjian")); 
		YoujianView youjianView =  youjianService.selectView(ew);
		return R.ok("查询邮件成功").put("data", youjianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YoujianEntity youjian = youjianService.selectById(id);
        return R.ok().put("data", youjian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YoujianEntity youjian = youjianService.selectById(id);
        return R.ok().put("data", youjian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YoujianEntity youjian, HttpServletRequest request){
    	youjian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youjian);

        youjianService.insert(youjian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YoujianEntity youjian, HttpServletRequest request){
    	youjian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youjian);

        youjianService.insert(youjian);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YoujianEntity youjian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youjian);
        youjianService.updateById(youjian);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youjianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







}

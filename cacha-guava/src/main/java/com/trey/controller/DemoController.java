package com.trey.controller;

import com.trey.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: DemoController.java
 * @Description: DemoController.java类说明
 * @Author: tao.shi
 * @Date: 2019/4/8 20:21
 */
@RestController
public class DemoController {

	@Autowired
	private CacheService cacheService;

	private static final String cacheName = "user";

	@RequestMapping("/set")
	public String input(Long id) {
		cacheService.set(cacheName,id,"test"+id);
		return "添加成功";
	}

	@RequestMapping("/get")
	public String get(Long id) {
		Object o = cacheService.get(cacheName,id);
		if(o == null) {
			return "过期了";
		} else {
			return "有值" + o;
		}
	}


}

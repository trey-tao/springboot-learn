package com.trey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

/**
 * @FileName: CacheService.java
 * @Description: CacheService.java类说明
 * @Author: tao.shi
 * @Date: 2019/4/9 15:01
 */
@Service
public class CacheService {

	@Autowired
	@Qualifier("caffeineCache")
	private CacheManager cacheManager;

	public void set(String cacheName, Object key, Object value) {
		cacheManager.getCache(cacheName)
				.put(key,value);
	}

	public Object get(String cacheName, Object key) {
		Cache cache  =  cacheManager.getCache(cacheName);
		String result = cache.get(key,String.class);
		return result;
	}

}

package com.trey.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @FileName: CacheConfig.java
 * @Description: CacheConfig.java类说明
 * @Author: tao.shi
 * @Date: 2019/4/9 14:59
 */
@Configuration
@EnableCaching
public class CacheConfig {

	private static final int DEFAULT_MAXSIZE = 100;
	private static final int DEFAULT_TTL = 30;

	/**
	 * 个性化配置缓存
	 */
	@Bean(name="caffeineCache")
	public CacheManager cacheManager() {
		CaffeineCacheManager cacheManager = new CaffeineCacheManager();
		Caffeine caffeine = Caffeine.newBuilder()
				//cache的初始容量值
				.initialCapacity(10)
				.expireAfterWrite(DEFAULT_TTL, TimeUnit.SECONDS)
				//maximumSize用来控制cache的最大缓存数量，maximumSize和maximumWeight不可以同时使用，
				.maximumSize(DEFAULT_MAXSIZE);
		cacheManager.setCaffeine(caffeine);
		cacheManager.setCacheNames(getNames());
		return cacheManager;
	}

	private static List<String> getNames(){
		List<String> names = new ArrayList<>(2);
		names.add("user");
		return names;
	}

}

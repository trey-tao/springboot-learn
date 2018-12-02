package com.trey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName: AutherAutoConfiguration.java
 * @Description: AutherAutoConfiguration.java类说明
 * @Author: tao.shi
 * @Date: 2018/11/27 17:26
 */
@Configuration
@ConditionalOnClass({AutherServer.class})
@EnableConfigurationProperties(AutherProperties.class)
public class AutherAutoConfiguration {

	@Autowired
	private AutherProperties autherProperties;

	@Bean
	@ConditionalOnMissingBean(AutherServer.class)
	public AutherServer autherServer() {
		AutherServer server = new AutherServer();
		server.setEmail(autherProperties.getEmail());
		server.setName(autherProperties.getName());
		return server;
	}

}

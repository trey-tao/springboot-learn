package com.trey;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @FileName: AutherProperties.java
 * @Description: AutherProperties.java类说明
 * @Author: tao.shi
 * @Date: 2018/11/27 17:18
 */
@ConfigurationProperties(prefix = "auther")
public class AutherProperties {

	private static final String DEFAULT_AUTHOR = "trey";
	public String name = DEFAULT_AUTHOR;

	private static String DEFAULT_EMAIL = "trey_stao@163.com";

	public String email = DEFAULT_EMAIL;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String author) {
		this.name = author;
	}
}

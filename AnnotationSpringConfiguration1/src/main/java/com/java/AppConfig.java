package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Library getlibrart()
	{
		return new Library();
	}
	@Bean
	public Note getnote()
	{
		return new Book();
	}

}

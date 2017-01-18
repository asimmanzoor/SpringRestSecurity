package com.spring.rest.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/person/*").hasRole("ADMIN")
			.antMatchers("/person/user/*").hasRole("USER")
			//.and().rememberMe()
		//	.anyRequest().authenticated()
			//.and().formLogin();
			.and().httpBasic();
	}

	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("test").password("test").roles("USER");

	}
	@Override
	public void configure(WebSecurity web) throws Exception {

	}



}

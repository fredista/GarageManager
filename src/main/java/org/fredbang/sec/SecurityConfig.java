package org.fredbang.sec;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	  @Autowired private DataSource datasource; protected void
	  configure(AuthenticationManagerBuilder auth) throws Exception {
	  
	  auth .jdbcAuthentication() .dataSource(datasource) 
	  .usersByUsernameQuery("select username as principal , password as credentials,active from user where username =?")
	  .authoritiesByUsernameQuery("select username as principal ,roles as role from user_roles where username = ?")
	  .rolePrefix("")
	  .passwordEncoder(NoOpPasswordEncoder.getInstance()); }
	  
	  protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/login", "/resources","/css/**","css/logincss.css").permitAll()
		.antMatchers("/register", 
				"/resources/**", 
				"/css/**", 
				"/fonts/**", 
				"/img/**", 
				"/js/**").permitAll()
		.antMatchers("/users/addNew").permitAll()
	   .anyRequest().authenticated()
	   .and()
	  .formLogin()
	  .loginPage("/login").defaultSuccessUrl("/index")
	  .permitAll() ;
	  
	  }
	 
	
}

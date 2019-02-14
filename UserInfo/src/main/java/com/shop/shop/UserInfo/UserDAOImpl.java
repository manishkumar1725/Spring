package com.shop.shop.UserInfo;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImpl implements UserDAO{
	
	    

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public int saveUser(User user) {
		String query = "insert into employee values('" + user.getId() + "','"+ user.getName() + "')";
		return jdbcTemplate.update(query);
		
	}
	
	  
	
}  
	
	




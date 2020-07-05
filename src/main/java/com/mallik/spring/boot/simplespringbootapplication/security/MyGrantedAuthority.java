package com.mallik.spring.boot.simplespringbootapplication.security;

import org.springframework.security.core.GrantedAuthority;

public class MyGrantedAuthority implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getAuthority() {
		// TODO Auto-generated method stub
		return role;
	}

	private String role;

	public MyGrantedAuthority(String role) {
		super();
		this.role = role;
	}
	
	
	
}

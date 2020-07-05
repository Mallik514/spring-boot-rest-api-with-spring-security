package com.mallik.spring.boot.simplespringbootapplication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider  {

	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		String username = auth.getName();
		String password = auth.getCredentials().toString();
		System.out.println("Password from auth object::"+password);
		UserDetails myUserDetails = myUserDetailsService.loadUserByUsername(username);
		System.out.println("Pwd from Userdetails::"+myUserDetails.getPassword());
		if(myUserDetails.getPassword().equals(password))
			return new UsernamePasswordAuthenticationToken(username, myUserDetails.getPassword(), myUserDetails.getAuthorities());
		else return null;
	}

	public boolean supports(Class<? extends Object> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}

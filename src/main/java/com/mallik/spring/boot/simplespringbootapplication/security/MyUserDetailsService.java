package com.mallik.spring.boot.simplespringbootapplication.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.mallik.spring.boot.simplespringbootapplication.dto.User;
import com.mallik.spring.boot.simplespringbootapplication.repo.UserRepo;

@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Load user by user name is called");
		User user = userRepo.findByUsername(username);
		
		System.out.println("Found user for username:"+username+" is:"+user);
		List<MyGrantedAuthority> authorities = new ArrayList<MyGrantedAuthority>();
		authorities.add(new MyGrantedAuthority(user.getRole()));
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
		
		
	}

}

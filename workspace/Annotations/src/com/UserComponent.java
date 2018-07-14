package com;

public class UserComponent {

	@RequestMapping(url = "/login" , method = "GET")
	public void login(String username , String password) {
		
		System.out.println("logged in ..");
		
	}
	
	@RequestMapping(url = "/register" , method = "GET")
	public void register(String username , String password) {
		
		System.out.println("registered..");
		
	}
	
	
	
}

package com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Container {

	
	public void handle(String url , String username , String password) {
	try {
		
		Class<?> clazz = Class.forName("com.UserComponent");
		Object comp = clazz.newInstance();
		
		Method[] methods = clazz.getMethods();
		for(Method method : methods) {
			
		RequestMapping rm = null;
		rm = method.getAnnotation(RequestMapping.class);
		if(rm!=null) {
			
			String givernUrl = rm.url();
			if(givernUrl.equals(url)) {
				
				method.invoke(comp, username , password);
			}
			
		}
			
		}
		
	}catch(ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e){ e.printStackTrace();}
	catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
}

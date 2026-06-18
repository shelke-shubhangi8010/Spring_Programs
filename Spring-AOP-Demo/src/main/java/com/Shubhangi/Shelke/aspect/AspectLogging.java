package com.Shubhangi.Shelke.aspect;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

 
 
@Component
@Aspect
public class AspectLogging {

	@Before("execution(* com.Shubhangi.Shelke.service.*.*(..))")
	public void beforelog()
	{
		
		System.out.println("Before logging method execute");
	}
	
	
	@After("execution(* com.Shubhangi.Shelke.service.*.*(..))")
	public void Afterlog()
	{
		
		System.out.println("After logging method execute");
	}
	
}
/*
 * *com.shubhangi.shelke.service.*.*(..)
 *    *  ->  any return type
 *    com.shubhangi.shelke  ---> package name
 *    *  -> any class from this package
 *    *  -> any method from this package
 *    (..) -> method with any number of parameter 
 * 
 * 
 * 
 * */
 
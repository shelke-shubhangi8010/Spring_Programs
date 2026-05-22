package com.config.task;

import org.springframework.stereotype.Component;
@Component("acc")
public class AccountImpl implements AccountInterface {
	
	 public void accountDetails() {
	        System.out.println("Account created successfully");
	    }
}

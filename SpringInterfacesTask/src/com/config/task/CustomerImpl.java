package com.config.task;

import org.springframework.stereotype.Component;

@Component("cust")
public class CustomerImpl implements CustomerInterface {
	public void customerDetails() {
        System.out.println("Customer verified");
    }
}

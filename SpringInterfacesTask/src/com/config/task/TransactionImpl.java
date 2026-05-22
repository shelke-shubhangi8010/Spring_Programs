package com.config.task;

import org.springframework.stereotype.Component;

@Component("trans")
public class TransactionImpl implements TransactionInterface {
	 public void transactionProcess() {
	        System.out.println("Transaction completed");
	    }
}

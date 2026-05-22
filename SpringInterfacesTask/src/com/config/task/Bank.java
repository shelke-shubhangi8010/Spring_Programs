package com.config.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	@Autowired
	private AccountInterface account;
	@Autowired
	private CustomerInterface customer;
	@Autowired
	private TransactionInterface transaction;

	public AccountInterface getAccount() {
		return account;
	}

	public void setAccount(AccountInterface account) {
		this.account = account;
	}

	public CustomerInterface getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInterface customer) {
		this.customer = customer;
	}

	public TransactionInterface getTransaction() {
		return transaction;
	}

	public void setTransaction(TransactionInterface transaction) {
		this.transaction = transaction;
	}

	public void startBanking() {
		customer.customerDetails();
		account.accountDetails();
		transaction.transactionProcess();
	}

	@Override
	public String toString() {
		return "Bank [account=" + account + ", customer=" + customer + ", transaction=" + transaction + "]";
	}

}

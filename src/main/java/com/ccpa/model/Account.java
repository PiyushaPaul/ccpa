package com.ccpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Account {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
  private Long accountId;
	
  private String accountName;
	
  private Double balance;

  private String accountType;

public Long getAccountId() {
	return accountId;
}

public void setAccountId(Long accountId) {
	this.accountId = accountId;
}

public String getAccountName() {
	return accountName;
}

public void setAccountName(String accountName) {
	this.accountName = accountName;
}

public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public Account(Long accountId, String accountName, Double balance, String accountType) {
	super();
	this.accountId = accountId;
	this.accountName = accountName;
	this.balance = balance;
	this.accountType = accountType;
}

@Override
public String toString() {
	return "Account [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance
			+ ", accountType=" + accountType + "]";
}

public Account() {
	}
}
  

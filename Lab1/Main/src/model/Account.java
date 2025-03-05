package model;

import java.util.Date;

public class Account {
	String accountNumber;
	String accountNickName;
	String usernameOfAccountHolder;
	String accountType;	//"Standard" or "Savings"
	Date accountOpeningDate;

	public Account(String usernameOfAccountHolder, String accountNickName, String accountType, String accountNumber, Date accountOpeningDate) {
		this.usernameOfAccountHolder = usernameOfAccountHolder;
		this.accountNickName = accountNickName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountOpeningDate = accountOpeningDate;
	}

	public String getAccountNickName(){
		return accountNickName;
	}

	public void setAccountNickName(String newNickName){
		this.accountNickName = newNickName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getUsernameOfAccountHolder() {
		return usernameOfAccountHolder;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setUsernameOfAccountHolder(String usernameOfAccountHolder) {
		this.usernameOfAccountHolder = usernameOfAccountHolder;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	@Override
	public String toString() {
		return "Account{" +
				"accountNumber='" + accountNumber + '\'' +
				", accountNickName='" + accountNickName + '\'' +
				", usernameOfAccountHolder='" + usernameOfAccountHolder + '\'' +
				", accountType='" + accountType + '\'' +
				", accountOpeningDate=" + accountOpeningDate +
				'}';
	}
}

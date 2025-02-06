package model;

import java.util.Date;

public class Transaction {
	String AccountNumber;
	double TransactionAmount;
	Date TransactionDate;

	public Transaction( String accountNumber,double transactionAmount, Date transactionDate) {
		TransactionAmount = transactionAmount;
		AccountNumber = accountNumber;
		TransactionDate = transactionDate;
	}
}

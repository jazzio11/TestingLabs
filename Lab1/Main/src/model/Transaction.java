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

	public Date getTransactionDate() {
		return TransactionDate;
	}

	public double getTransactionAmount() {
		return TransactionAmount;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public void setTransactionAmount(double transactionAmount) {
		TransactionAmount = transactionAmount;
	}

	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"AccountNumber='" + AccountNumber + '\'' +
				", TransactionAmount=" + TransactionAmount +
				", TransactionDate=" + TransactionDate +
				'}';
	}
}

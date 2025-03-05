package tests.unitTests;

import model.Transaction;
import model.User;
import utils.TestUtils;

import java.util.Date;

import static utils.TestUtils.*;

public class TranscationTest {

	public static void main(String[] args) {
		testUserConstructor();
	}

	public static void testUserConstructor() {
		String accountNumber = "0001";
		double transactionAmount = 100.00;
		Date transactionDate = new Date();

		Transaction transaction = new Transaction(accountNumber, transactionAmount, transactionDate);

		assert accountNumber.equals(transaction.getAccountNumber());
		String testCaseName = "TC1-getAccountNumber";
		if (transaction.getAccountNumber().equals(accountNumber)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert transactionAmount == transaction.getTransactionAmount();
		testCaseName = "TC2-getTransactionAmount";
		if (transaction.getTransactionAmount() == transactionAmount) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert transactionDate.equals(transaction.getTransactionDate());
		testCaseName = "TC3-getTransactionDate";
		if (transaction.getTransactionDate().equals(transactionDate)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert false; //assert check
	}
}

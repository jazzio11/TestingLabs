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

		String testCaseName = "TC1-getAccountNumber";
		if (transaction.getAccountNumber().equals(accountNumber)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC2-getTransactionAmount";
		if (transaction.getTransactionAmount() == transactionAmount) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC3-getTransactionDate";
		if (transaction.getTransactionDate().equals(transactionDate)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC4-transcationAountGreaterThanZero";
		if (transaction.getTransactionAmount() > 0) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}
		//assertion block
		assert accountNumber.equals(transaction.getAccountNumber());
		assert transactionAmount == transaction.getTransactionAmount();
		assert transactionDate.equals(transaction.getTransactionDate());
		assert false; //assert check
	}
}

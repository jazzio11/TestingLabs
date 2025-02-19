package tests.unitTests;

import model.Account;
import utils.TestUtils;

import java.util.Date;

import static utils.TestUtils.*;

public class AccountTest {

	public static void main(String[] args) {
		testAccountConstructor();
	}

	public static void testAccountConstructor() {
		String accountNumber = "0001";
		String usernameOfAccountHolder = "mike";
		String accountType = "Standard";	//"Standard" or "Savings"
		Date accountOpeningDate = new Date();//gets the current date

		Account testAccountUser = new Account(usernameOfAccountHolder, accountType, accountNumber, accountOpeningDate);

		assert accountNumber.equals(testAccountUser.getAccountNumber());
		String testCaseName = "TC1-accountNumber";
		if (testAccountUser.getAccountNumber().equals(accountNumber)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert usernameOfAccountHolder.equals(testAccountUser.getUsernameOfAccountHolder());
		testCaseName = "TC2-getUsernameOfAccountHolder";
		if (testAccountUser.getUsernameOfAccountHolder().equals(usernameOfAccountHolder)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert accountType.equals(testAccountUser.getAccountType());
		testCaseName = "TC3-getAccountType";
		if (testAccountUser.getAccountType().equals(accountType)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert accountOpeningDate == testAccountUser.getAccountOpeningDate();
		testCaseName = "TC4-getAccountOpeningDate";
		if (testAccountUser.getAccountOpeningDate().equals(accountOpeningDate)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert false;// assert check

	}
}

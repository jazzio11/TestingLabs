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

		String testCaseName = "TC1-accountNumber";
		if (testAccountUser.getAccountNumber().equals(accountNumber)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC2-getFirstName";
		if (testAccountUser.getUsernameOfAccountHolder().equals(usernameOfAccountHolder)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC3-getLastName";
		if (testAccountUser.getAccountType().equals(accountType)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		//Ensures the account type is 'Savings' or 'Standard'
		testCaseName = "TC4-savingsOrStandard";
		if (testAccountUser.getAccountType().equals("Savings") || testAccountUser.getAccountType().equals("Standard")) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC5-getPassword";
		if (testAccountUser.getAccountOpeningDate().equals(accountOpeningDate)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}
	}
}

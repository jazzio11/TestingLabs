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
		String accountNickname = "Mike's Account";
		String accountType = "Standard";	//"Standard" or "Savings"
		Date accountOpeningDate = new Date();//gets the current date

		Account testAccountUser = new Account(usernameOfAccountHolder, accountNickname, accountType, accountNumber, accountOpeningDate);

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


		testCaseName = "TC6-getNickname";
		if (testAccountUser.getAccountNickName().equals(accountNickname)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC7-setNickname";
		String newNickname = "New Account Nickname";
		testAccountUser.setAccountNickName(newNickname);
		if (testAccountUser.getAccountNickName().equals(newNickname)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}
	}
}

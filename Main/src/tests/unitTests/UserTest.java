package tests.unitTests;

import model.User;
import utils.TestUtils;

public class UserTest {

	public static void main(String[] args) {
		testUserConstructor();
	}

	public static void testUserConstructor() {
		String TestUserName = "mike";
		String TestPassword = "myPassword";
		String TestPhone = "07706653477";
		String TestFirstName = "Mike";
		String TestLastName = "Smith";

		User TestUser = new User(TestUserName, TestPassword, TestFirstName, TestLastName, TestPhone);

		String testCaseName = "TC1-getUsername";
		if (TestUser.getUsername().equals(TestUserName)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC2-getFirstName";
		if (TestUser.getFirstName().equals(TestFirstName)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC3-getLastName";
		if (TestUser.getLastName().equals(TestLastName)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC4-getPassword";
		if (TestUser.getPassword().equals(TestPassword)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		testCaseName = "TC5-getMobileNumber";
		if (TestUser.getMobileNumber().equals(TestPhone)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}
	}
}

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

		assert TestUserName.equals(TestUser.getUsername());
		String testCaseName = "TC1-getUsername";
		if (TestUser.getUsername().equals(TestUserName)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert TestFirstName.equals(TestUser.getFirstName());
		testCaseName = "TC2-getFirstName";
		if (TestUser.getFirstName().equals(TestFirstName)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert TestLastName.equals(TestUser.getLastName());
		testCaseName = "TC3-getLastName";
		if (TestUser.getLastName().equals(TestLastName)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert TestPassword.equals(TestUser.getPassword());
		testCaseName = "TC4-getPassword";
		if (TestUser.getPassword().equals(TestPassword)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert TestPhone.equals(TestUser.getMobileNumber());
		testCaseName = "TC5-getMobileNumber";
		if (TestUser.getMobileNumber().equals(TestPhone)) {
			TestUtils.printTestPass(testCaseName);
		} else {
			TestUtils.printTestFail(testCaseName);
		}

		assert false; //assert check
	}
}

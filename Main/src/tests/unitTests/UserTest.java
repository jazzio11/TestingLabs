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

		if (TestUser.getUsername().equals(TestUserName)) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "Test Passed" + TestUtils.TEXT_COLOR_RESET);
		} else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "Test Failed" + TestUtils.TEXT_COLOR_RESET);
		}

	}
}

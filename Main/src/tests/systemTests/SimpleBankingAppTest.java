package tests.systemTests;

import controller.AccountController;
import controller.UserController;
import model.Account;
import model.User;
import utils.TestUtils;

import java.util.Vector;

public class SimpleBankingAppTest {


	// system under test (SUT):
	//static SimpleBankingApp mainApp = new SimpleBankingApp ();

	// this test method (test case) verifies if the data load feature of the class (unit or component)
	// under test (UUT) works properly
	public static void testLoadData() {
		// Reminder: the classical Four-Phase test pattern (Setup-Exercise-Verify-Teardown
		// http://xunitpatterns.com/Four%20Phase%20Test.html

		// 1-Setup phase: none
		UserController userController = new UserController();
		// 2-Exercise phase
		Vector<User> users = userController.getUsers();

		// 3-Verify phase
		// we see in the load function of the UUT that we have loaded 3 users, so let's verify that
		if (users.size() == 3)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "testLoadData: loadUserData: TC1 passed" + TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "testLoadData: loadUserData: TC1 FAILED" + TestUtils.TEXT_COLOR_RESET);

		// The above only verification is basic (simple, weak)
		// To do STRONGER verification, we would need more assertions for user names and account balances, etc.

		AccountController accountController = new AccountController();
		Vector<Account> accounts = accountController.getAccounts();
		if (accounts.size() == 4)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "testLoadData: loadAccountData: TC1 passed" + TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "testLoadData: loadAccountData: TC1 FAILED" + TestUtils.TEXT_COLOR_RESET);

		// 4-Teardown phase: if our goal was to only test the load, as Teardown (mainApp.accounts)
		// we would have deleted the loaded deleted from memory (variables users, and accounts), but we want
		// to use those data in the other tests, thus, we do not do any Teardown in this test case
	}

	// this test method (test case) verifies if the Deposit feature works properly
	public static void testDeposits() {
		// 1-Setup phase
		AccountController accountController = new AccountController();
		double balanceBefore = accountController.getBalance("5495-1234");
		double depositAmount = 50.21;

		// 2-Exercise phase
		accountController.addTransaction("5495-1234", depositAmount);
		double balanceAfter = accountController.getBalance("5495-1234");

		// 3-verify
		assert balanceBefore + depositAmount == balanceAfter;
		if (balanceBefore + depositAmount == balanceAfter)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "testDeposits: TC1 passed"+ TestUtils.TEXT_COLOR_RESET);
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "testDeposits: TC1 FAILED XXX: balanceBefore + depositAmount != balanceAfter");
			System.out.format("testDeposits: balanceBefore = %.2f ; depositAmount = %.2f ; balanceAfter = %.2f %s\n",
					balanceBefore , depositAmount , balanceAfter, TestUtils.TEXT_COLOR_RESET);
		}

		// 4-tear-down: put the system state back in where it was
		// read more about the tear-down phase of test cases: http://xunitpatterns.com/Four%20Phase%20Test.html
	}

	// this test method (test case) verifies if the Deposit feature works properly
	public static void testDepositsUnhappyPath() {
		// 1-Setup phase
		AccountController accountController = new AccountController();
		double balanceBefore = accountController.getBalance("5495-1234");
		double depositAmount = 0;

		// 2-Exercise phase
		boolean transactionSuccess = accountController.addTransaction("5495-1234", depositAmount);
		double balanceAfter = accountController.getBalance("5495-1234");

		// 3-verify
		assert balanceBefore + depositAmount == balanceAfter;
		if (balanceBefore + depositAmount == balanceAfter && !transactionSuccess)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "testDepositsUnhappyPath: TC1 passed"+ TestUtils.TEXT_COLOR_RESET);
		else {
			if(!transactionSuccess){
				System.out.println(TestUtils.TEXT_COLOR_RED + "testDepositsUnhappyPath: TC1 FAILED XXX: balanceBefore + depositAmount != balanceAfter");
			}else{
				System.out.println(TestUtils.TEXT_COLOR_RED + "testDepositsUnhappyPath: TC1 FAILED XXX: add transaction function returned success");
			}
			System.out.format("testDeposits: balanceBefore = %.2f ; depositAmount = %.2f ; balanceAfter = %.2f %s\n",
					balanceBefore , depositAmount , balanceAfter, TestUtils.TEXT_COLOR_RESET);

		}

		// 4-tear-down: put the system state back in where it was
		// read more about the tear-down phase of test cases: http://xunitpatterns.com/Four%20Phase%20Test.html
	}

	// this test method (test case) verifies if the Withdraw feature works properly
	public static void testWithdrawals() {
		// 1-Setup phase
		AccountController accountController = new AccountController();
		double balanceBefore = accountController.getBalance("5495-1234");
		double withdrawalAmount = -50;

		// 2-Exercise phase
		accountController.addTransaction("5495-1234", withdrawalAmount);
		double balanceAfter = accountController.getBalance("5495-1234");

		// 3-verify
		assert balanceBefore + withdrawalAmount == balanceAfter;
		if (balanceBefore + withdrawalAmount == balanceAfter)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "testWithdrawals: TC1 passed"+ TestUtils.TEXT_COLOR_RESET);
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "testWithdrawals: TC1 FAILED XXX: balanceBefore - withdrawalAmount != balanceAfter");
			System.out.format("testDeposits: balanceBefore = %.2f ; withdrawalAmount = %.2f ; balanceAfter = %.2f %s\n",
					balanceBefore , withdrawalAmount , balanceAfter, TestUtils.TEXT_COLOR_RESET);
		}

		// 4-tear-down
	}

	public static void main(String[] args) {
		// we need to call our test cases (methods)
		testLoadData();
		testDeposits();
		testWithdrawals(); // uncomment this call, when you have developed the test method (test case)
		testDepositsUnhappyPath();
	}

}

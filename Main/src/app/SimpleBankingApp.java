package app;

import controller.AccountController;
import controller.UserController;

public class SimpleBankingApp {

	//////////////////////////////////////////////////////
	public static void main(String[] args) {

		UserController userController = new UserController();
		AccountController accountController = new AccountController();
		// let's print them all to see if they have been loaded (populated) properly
		userController.printAllUsers();

		// let's print them all to see if they have been loaded (populated) properly
		System.out.println("Accounts: initial state, after loading...");
		accountController.printAllAccounts();
		
		// let's do some activities on the populated accounts, add transactions, etc.
		// Deposit: adding a transaction with a positive value
		// Withdraw: adding a transaction with a negative value
		if(!accountController.addTransaction("5495-1234", -50.21)){
			System.out.println("Add Transaction Failed");
		}
		System.out.println("Account: after the 1st addTransaction function call...");
		accountController.printAllAccounts();
		
		// and some more activities on the accounts

		if(!accountController.addTransaction("5495-1234", 0)){
			System.out.println("Add Transaction Failed");
		}
		if(!accountController.addTransaction("9999-1111", 21.00)){ // it seems this account does not exist in the loaded (populated) data)
			System.out.println("Add Transaction Failed");
		}
											// but the addTransaction does not do that check, need to improve that function in future
		// let's print the accounts and their balance to see if the above transaction have impacted their balances
		System.out.println("Account: after the 2nd/3rd addTransaction function calls...");
		accountController.printAllAccounts();
		

	}

}

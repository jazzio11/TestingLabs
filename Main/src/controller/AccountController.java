package controller;

import model.Account;
import model.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

public class AccountController {
    private Vector<Account> accounts;
    private Vector<Transaction> transactions;

    public AccountController() {
        this.accounts = new Vector<>();
        this.transactions = new Vector<>();
        loadAccountData();
    }

    /**
     * Calculate the balance of a given account (by its number).
     * It iterates over all transactions related to the account and sums them up.
     *
     * @param accountNumber The account number
     * @return The calculated balance
     */
    public double getBalance(String accountNumber) {
        return transactions.stream()
                .filter(transaction -> transaction.getAccountNumber().equals(accountNumber))
                .mapToDouble(Transaction::getTransactionAmount)
                .sum();
    }

    /**
     * Adds a new transaction to the system.
     *
     * @param accountNumber The account number
     * @param amount        The transaction amount
     */
    public void addTransaction(String accountNumber, double amount) {
        transactions.add(new Transaction(accountNumber, amount, Calendar.getInstance().getTime()));
    }

    /**
     * Prints all accounts in the system.
     */
    public void printAllAccounts() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println("There are: " + accounts.size() + " accounts in the system.");
        System.out.println(String.format("%-10s| %-30s| %-10s| %-15s| %-15s",
                "Account #", "Username", "Type", "Opening Date", "Balance"));
        System.out.println("--------------------------------------------------------------------------------");

        accounts.forEach(account -> System.out.println(String.format("%-10s| %-30s| %-10s| %-15s| %-15s",
                account.getAccountNumber(),
                account.getUsernameOfAccountHolder(),
                account.getAccountType(),
                "(" + sdf.format(account.getAccountOpeningDate()) + ")",
                "$" + getBalance(account.getAccountNumber())
        )));
        System.out.println();
    }

    private void loadAccountData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            accounts.add(new Account("mike", "Standard", "5495-1234", sdf.parse("20/08/2019")));
            accounts.add(new Account("mike", "Standard", "5495-1239", sdf.parse("20/08/2020")));
            accounts.add(new Account("mike", "Saving", "5495-1291", sdf.parse("21/07/2019")));
            accounts.add(new Account("David.McDonald@gmail.com", "Saving", "5495-6789", sdf.parse("20/08/2019")));
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
    }

    public Vector<Account> getAccounts() {
        return new Vector<>(accounts);
    }

    public Vector<Transaction> getTransactions() {
        return new Vector<>(transactions);
    }

    public static void main(String[] args) {
        AccountController controller = new AccountController();
        controller.printAllAccounts();
    }
}
package task6;

class Account {
    double balance;

    // Constructors
    public Account() {
        balance = 0.0;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        Account account = new Account(1000.0);
        System.out.println("Initial Balance: " + account.checkBalance());
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.checkBalance());
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.checkBalance());
    }
}

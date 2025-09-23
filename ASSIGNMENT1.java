import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;

    // Constructor
    public Account(int accountNumber, String accountHolderName, double balance, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance       : " + balance);
        System.out.println("Email         : " + email);
        System.out.println("Phone Number  : " + phoneNumber);
        System.out.println("------------------------------------");
    }

    // Update contact details
    public void updateContactDetails(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Contact details updated successfully!");
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class BankingApplication {
    private static Scanner sc = new Scanner(System.in);
    private static Account[] accounts = new Account[100]; // Max 100 accounts
    private static int accountCount = 0;
    private static int nextAccountNumber = 1001; // Auto incrementing account number

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Welcome to the Banking Application ---");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> performDeposit();
                case 3 -> performWithdrawal();
                case 4 -> showAccountDetails();
                case 5 -> updateContact();
                case 6 -> System.out.println("Thank you for using the Banking Application!");
                default -> System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 6);
    }

    // Create account
    private static void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        accounts[accountCount++] = new Account(nextAccountNumber, name, initialDeposit, email, phone);
        System.out.println("Account created successfully with Account Number: " + nextAccountNumber);
        nextAccountNumber++;
    }

    // Deposit money
    private static void performDeposit() {
        Account acc = findAccount();
        if (acc != null) {
            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();
            acc.deposit(amount);
        }
    }

    // Withdraw money
    private static void performWithdrawal() {
        Account acc = findAccount();
        if (acc != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
        }
    }

    // Show account details
    private static void showAccountDetails() {
        Account acc = findAccount();
        if (acc != null) {
            acc.displayAccountDetails();
        }
    }

    // Update contact details
    private static void updateContact() {
        Account acc = findAccount();
        if (acc != null) {
            System.out.print("Enter new email: ");
            String email = sc.nextLine();
            System.out.print("Enter new phone number: ");
            String phone = sc.nextLine();
            acc.updateContactDetails(email, phone);
        }
    }

    // Helper method to find account
    private static Account findAccount() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}

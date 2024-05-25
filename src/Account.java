import java.util.concurrent.ThreadLocalRandom;

public abstract class Account {
    // List of common properties for checking and savings accounts
    String name;
    String sSn;
    double balance;
    static int id = 10000;
    String accountNumber;
    double rate;

    // Constructor with parameters
    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSn = sSn;
        balance = initDeposit;

        id++;
        this.accountNumber = setAccountNumber();
        System.out.println("Name: " + name);
        System.out.println("SSN: " + sSn);
        System.out.println("Initial Balance: $" + balance);
        System.out.println("Account Number: " + accountNumber);
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSn.substring(sSn.length() - 2, sSn.length());
        int uniqueID = id;
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 99);
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
}

public abstract class Account {
    // List of common properties for checking and savings accounts
    String name;
    String sSn;
    double balance;

    String accountNumber;
    double rate;

    // Constructor with parameters
    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSn = sSn;
        balance = initDeposit;
        System.out.println("Name: " + name);
        System.out.println("SSN: " + sSn);
        System.out.println("Initial Balance: $" + balance);
    }
}

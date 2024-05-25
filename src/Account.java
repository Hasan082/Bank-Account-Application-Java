public abstract class Account {
    // List of common properties for checking and savings accounts
    String name;
    String sSn;
    double balance;

    String accountNumber;
    double rate;

    // Constructor
    public Account(String name) {
        System.out.println("New Account");
        System.out.println("Name: " + name);
    }
}

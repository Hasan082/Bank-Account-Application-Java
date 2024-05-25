public class Savings extends Account {
    // List of common properties for savings accounts
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
    }
}

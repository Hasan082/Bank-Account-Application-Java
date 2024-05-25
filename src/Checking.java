public class Checking extends Account implements IBaseRate {

    // List of common properties for checking accounts
    int debitCardNumber;
    int debitCardPIN;

    // Constructor
    public Checking(String name) {
        super(name);
    }
}

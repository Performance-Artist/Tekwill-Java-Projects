public class CheckingAccount extends BankAccount {
    double fee;

    public CheckingAccount(String number, long balance, double fee) {
        super (number, balance);
        this.fee = fee;
    }
}

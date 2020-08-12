public class Main {

    public static void main(String[] args) {
	    Account a1 = new Account();
	    a1.setOwnerName("Boris");
	    a1.setBalance(100500);
	    a1.setLocked(false);

	    String locked1 = a1.isLocked() ? "locked" : "unlocked";

        System.out.println(a1.getOwnerName() + " has " + a1.getBalance() + " and account is " + locked1);

        Account a2 = new Account();
        a2.setOwnerName("John");
        a2.setBalance(1000);
        a2.setLocked(true);

        String locked2 = a2.isLocked() ? "locked" : "unlocked";

        System.out.println(a2.getOwnerName() + " has " + a2.getBalance() + " and account is " + locked2);
    }
}

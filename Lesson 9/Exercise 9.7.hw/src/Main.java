import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        User user = new User("demo-user", "Alexander", "Schmidt");
        Account acc = new Account("123456", 1000, user);

        process(acc);
    }

    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println("Code: " + account.getCode());
            System.out.println("Account: " + account.getBalance());

            owner.ifPresent(o -> {
                System.out.println("Login: " + o.getLogin());
                System.out.println("First Name: " + o.getFirstName());
                System.out.println("Last Name: " + o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }
}

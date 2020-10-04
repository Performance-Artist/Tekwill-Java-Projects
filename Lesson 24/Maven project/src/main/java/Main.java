import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static String url = "jdbc:postgresql://localhost:5432/tekwill_demo_db";
    private static String user = "tekwill";
    private static String password = "tekwill";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
          boolean valid = connection.isValid
        }
}
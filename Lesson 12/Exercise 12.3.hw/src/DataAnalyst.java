import java.util.Arrays;

public class DataAnalyst extends Employee {
    private boolean phd;
    private String[] methods;

    public DataAnalyst (String name, String email, int experience, boolean phd, String[] methods) {
        super (name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }

    public String toString() {
        return "Name: "+ getName() + ", PhD: " + phd + ", Methods: " + Arrays.toString(methods);
    }
}

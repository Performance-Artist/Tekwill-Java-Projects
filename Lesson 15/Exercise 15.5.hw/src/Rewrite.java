import java.util.function.UnaryOperator;

public class Rewrite implements UnaryOperator<String> {
    String pref;
    String suf;

    public Rewrite (String pref, String suf) {
        this.pref = pref;
        this.suf = suf;
    }

    @Override
    public String apply(String s) {
        return pref + s.trim() + suf;
    }
}
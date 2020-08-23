public class MyString implements ReversedString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

//  @Override
//  public String get() {
//    String result = "";
//    for (int i = str.length() - 1; i >= 0; i--) {
//      result += str.charAt(i);
//    }
//    return result;
//  }

//  @Override
//  public String get() {
//    StringBuilder result = new StringBuilder();
//    for (int i = str.length() - 1; i >= 0; i--) {
//      result.append(str.charAt(i));
//    }
//    return result.toString();
//  }

//  @Override
//  public String get() {
//    StringBuilder sb = new StringBuilder(str);
//    return sb.reverse().toString();
//  }

    @Override
    public String get() {
        return new StringBuilder(str).reverse().toString();
    }
}
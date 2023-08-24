package FilterString;

public class FilterString {
    public static void main(String[] args) {
        System.out.println(filterString("asdf532fdaAs"));
    }
    public static long filterString(final String value) {
        return Long.parseLong(value.toLowerCase().replaceAll("([a-z])",""));  // complete this function :)
    }
}

package FilterString;

public class FilterString {
    public static void main(String[] args) {

        System.out.println(filterString("asdf532fdas"));
    }
    public static String filterString(final String value) {

        StringBuilder newStr = new StringBuilder();

        for(int i = 0 ; i < value.length() ; ++i){
            if(!Character.isAlphabetic(value.charAt(i)))
                newStr.append(value.charAt(i));
        }
        return newStr.toString();  // complete this function :)
    }
}

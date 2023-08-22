package SpinWords;
public class SpinWords {

    public static void main(String[] args) {

        System.out.println(SpinWord("Hey fellow warriors"));
    }
    private static String SpinWord(String sentence) {

    String[] stringTable = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    StringBuilder finalsb = new StringBuilder();
    for(int i = 0; i < stringTable.length; i++) {
        if (stringTable[i].length() >= 5) {
            sb.append(stringTable[i]).reverse();
        } else {
            sb.append(stringTable[i]);
        }
        if (i != stringTable.length - 1) {
            finalsb.append(sb).append(" ");
            sb.setLength(0);
        } else {
            finalsb.append(sb);
            sb.setLength(0);
        }
    }
    return finalsb.toString();
    }
}

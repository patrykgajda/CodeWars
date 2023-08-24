package HelpTheBookseller;

import java.util.Arrays;

public class HelpTheBookseller {
    public static void main(String[] args) {
        String[] lstofArt = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[] {"A", "B"};
        System.out.println(stockSummary(lstofArt,cd));
    }
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length < 1 || lstOf1stLetter.length < 1) {
            return "";
        }
        String[] fina = new String[lstOf1stLetter.length];
        int[] sum= new int[lstOf1stLetter.length];
        for (String s : lstOfArt) {
            for (int j = 0; j < lstOf1stLetter.length; j++) {
                if (s.charAt(0) == lstOf1stLetter[j].charAt(0)) {
                    sum[j] = sum[j] + Integer.parseInt(s.replaceAll("[^0-9]", ""));
                }
            }
        }

        for (int i = 0; i < lstOf1stLetter.length; i++){
            fina[i] = ("(" + lstOf1stLetter[i] + " : " + sum[i] + ")");
        }
        return String.join(" - ",fina);
    }
}

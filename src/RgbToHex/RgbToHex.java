package RgbToHex;

import java.util.Locale;

public class RgbToHex {
    public static void main(String[] args) {


        System.out.println(rgb(91,2,255));

    }
    public static String rgb(int r, int g, int b) {
        String hexr = rgbhelp(r);
        String hexg = rgbhelp(g);
        String hexb = rgbhelp(b);
        return hexr + hexg + hexb;
    }

    public static String rgbhelp(int a){
        if (a < 0) a = 0;
        if (a > 255) a = 255;
        String hexa = Integer.toHexString(a);
        // moje rozwiazanie z if
        // w odpowiedziach uzywali String.format czyli dla mnie wygladaloby tak >> String hexa = String.format("%02X",a);
        if (hexa.length() < 2) {
            hexa = "0" + hexa;
        }
        return hexa.toUpperCase();
    }
}

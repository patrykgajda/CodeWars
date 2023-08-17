package SquareDigit;

import java.util.Arrays;

public class SquareDigit {

    public static void main(String[] args) {


        squareDigits(545);

    }

    public static void squareDigits(int n) {

        char[] cyferka = new char[String.valueOf(n).length()];
        int[] cyfrasquare = new int[String.valueOf(n).length()];

        for (int i=0; i < String.valueOf(n).length(); i++) {
            cyferka[i] = String.valueOf(n).charAt(i);
            System.out.println(cyferka[i]);
            cyfrasquare[i] = Integer.parseInt(String.valueOf(cyferka[i]))*Integer.parseInt(String.valueOf(cyferka[i]));
        }

        n = Integer.parseInt((Arrays.toString(cyfrasquare)));
        System.out.println(n);
    }
//https://www.codewars.com/kata/546e2562b03326a88e000020/solutions przegralem :/
}

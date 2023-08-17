package Divisible;

public class Divisible {
    public static void main(String[] args) {

        int a,b,c;
        isDivisible(1,3,5, 4);
    }


    public static boolean isDivisible(int ... values){
        for (int i = 1; i < values.length; i++) {
            if (values[0] == 0 || values[0] % values[i] != 0){
                return false;
            }
        } return true;
    }

}
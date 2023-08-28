package ArrayDiff;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayDiffMethod(new int[]{-8, 5, -16, -9, -20, 14, 16, -4, 1, -20, 4, -7, 4, -14, 0, -15, -7, - 11}, new int[]{-9, -2, 5, -11, -15, 2, 5, -3, 4, 5})));
//        System.out.println(Arrays.toString(arrayDiffMethod(new int[]{1, 2, 2}, new int[]{2,3})));;
    }
    public static int[] arrayDiffMethod(int[] a, int[] b) {
        ArrayList<Integer> arrayDif= new ArrayList<>();
        for (int x : a) {
            arrayDif.add(x);
        }
        for (int i = a.length-1; i >= 0; i--) {
            for (int j = b.length-1; j >= 0; j--) {
                if (a[i] == b[j]) {
                    arrayDif.remove(i);
                    break;
                }
            }
        }
        int[] c = new int[arrayDif.size()];
        for (int i = 0; i < c.length; i++) {
            c[i] = arrayDif.get(i);
        }
        return c;
    }
}

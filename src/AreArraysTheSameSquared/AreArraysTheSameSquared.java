package AreArraysTheSameSquared;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AreArraysTheSameSquared {
    public static void main(String[] args) {

        int[] a = new int[]{-14, 0, 1532, 19, 1434, 161, 19121, 195};
        int[] b = new int[]{196,0,1,361,20736,25921,36481,38025};

        System.out.println(comp(a,b));
    }

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) return false;
        if (a.length < 1 && b.length < 1) return true;

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}


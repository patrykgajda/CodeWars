package GravityFlip;

public class GravityFlip {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 2}; // 1,2,2,3
        flip('R', arr);
        for (int arrs : arr) {
            System.out.println(arrs);
        }
        System.out.println();
        flip('L', arr);
        for (int arrs : arr) {
            System.out.println(arrs);
        }
    }

    public static int[] flip ( char dir, int[] arr){
        if (dir == 'R') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[arr.length - i - 1]) {
                        int temp = arr[arr.length - i - 1];
                        arr[arr.length - i - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }else{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] < arr[arr.length - i - 1]) {
                        int temp = arr[arr.length - i - 1];
                        arr[arr.length - i - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }return arr;
    }
}




//        if (dir == 'L') {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < arr[i + 1]) {
//                    int memory = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = memory;
//                }
//                return arr;
//            }
//        }




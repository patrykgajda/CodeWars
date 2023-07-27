public class Quadrants {

    public static void main(String[] args) {

        System.out.println(quadrant(0,-1));
    }
    public static int quadrant(int x, int y) {
        if (x >= 0 && y >= 0) {
            return 1;
        } else if (x < 0 && y >= 0) {
            return 2;
        } else if (x < 0 && y < 0 ) {
            return 3;
        } else {
            return 4;
        }
    }
    // jesli dobrze rozumiem sprawdzam x > 0 ? <<< znak zapytania to boolean jesli true to patrze na lewo od : jesli false to na prawo
    // tylko skad wiedzialo do ktorego : sie odwoluje
//    public static int quadrant(int x, int y) {
//        return x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3;
//    }
}
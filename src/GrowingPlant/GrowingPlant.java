package GrowingPlant;

public class GrowingPlant {

    public static void main(String[] args) {

        System.out.println(plant(35,13,532));
    }
    public static int plant(int upSpeed, int downSpeed, int desiredHeight){
        int day=1;
        int plantHeight=0;
        while (plantHeight <= desiredHeight) {
            plantHeight = plantHeight+upSpeed;
            System.out.println(plantHeight);
            if (plantHeight >= desiredHeight) return day;
            plantHeight = plantHeight-downSpeed;
            System.out.println(plantHeight);
            day += 1;

        }
        return day;
    }
}

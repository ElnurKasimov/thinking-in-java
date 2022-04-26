package Chapter3;

import java.util.Random;

public class Task_7_CoinTossSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextInt(10) >= 5) {
                System.out.println("выпал орел");
            } else {
                System.out.println("выпала решка");
            }
        }
        System.out.println("-------------------------------------------------------------------");

        random.ints(10, 0, 10).
                forEach(i -> System.out.println("выпал(а)  " + (i>=5 ? "орел" : "решка") ));



    }
}

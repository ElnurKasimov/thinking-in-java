package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class Task_17_EndlessLoopRandomValue {

    static void comparaion (int value, int previous) {
        if (value > previous) {
            System.out.println(" число " + value + "больше предыдущего");}
        else if (value < previous) {
            System.out.println(" число " + value + "меньше предыдущего");}
        else {
            System.out.println(" число " + value + "равно предыдущему");}
    }

    public static void main(String[] args) {
        int previous = new Random(47).nextInt();
        System.out.println("число " + previous + "пока не с чем сравнивать");
        int value = 1;
        while (true) {
            value = new Random().nextInt();
            comparaion(value, previous);
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
             previous = value;
        }
    }
}


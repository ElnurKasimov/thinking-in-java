package Chapter4;

import java.util.Scanner;

public class Task_18_SimpleNumbers {

    static  boolean isSimple(int i) {
        for (int j = 2; j <i ; j++) {
            if (i % j == 0) {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("до какого числа найти простые числа? : ");
        int range = sc.nextInt();

        for (int i = 1; i <=range ; i++) {
            if (isSimple(i)) {
                System.out.print(i);
                if (i!=range) System.out.print(", ");
            }
        }
        System.out.println();
    }
}

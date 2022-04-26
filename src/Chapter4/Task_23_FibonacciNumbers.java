package Chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_23_FibonacciNumbers {
    static int getFibonacciNumber(int i) {
        if (i == 1 ) return 1;
        if (i == 2) return 1;
        return getFibonacciNumber(i-1) + getFibonacciNumber(i-2);
    }


    public static void main(String[] args) {
        System.out.println("--------------  с массивом  -------------------------------");
        System.out.print("сколько чисел Фибоначчи вам распечатать: ");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int [] fibonacciNumbers = new int[quantity];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < quantity; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
        }
        System.out.println("Ваши числа Фибоначчи:");
        System.out.println(Arrays.toString(fibonacciNumbers));

        System.out.println("---------------  без массива  ------------------------------");
        System.out.print("до какого числа Вам вывести чилса Фибоначчи : ");
        int range = sc.nextInt();
        System.out.println("Ваши числа Фибоначчи:");
        int number = 1, previous = 1, temp = 0;
        System.out.print(previous);
        while (number <= range) {
            System.out.print(", " + number);
            temp = number;
            number += previous;
            previous = temp;
        }
        System.out.println();
        System.out.println("---------------  через рекурсию  ------------------------------");
        System.out.print("сколько чисел Фибоначчи вам распечатать: ");
        int depthOfRecursion = sc.nextInt();
        System.out.println("Ваши числа Фибоначчи:");
        for (int i = 1; i <= depthOfRecursion; i++) {
            System.out.print(getFibonacciNumber(i));
            if (i != depthOfRecursion) System.out.print(", ");
        }
        System.out.println();
    }
}

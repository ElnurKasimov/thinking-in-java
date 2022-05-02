package Chapter6;

import  static java.lang.Math.cos;
import  static java.lang.StrictMath.cos;

public class Task_2_NamesConflict {
    public static void main(String[] args) {
        // double cos = cos(3.14); compiller trows Ambigouos Exceprion
        double cos = java.lang.Math.cos(3.14); // так можно
        double cos1 = java.lang.StrictMath.cos(3.14); //  и так можно
        System.out.println(cos + "   " + cos1);
    }
}

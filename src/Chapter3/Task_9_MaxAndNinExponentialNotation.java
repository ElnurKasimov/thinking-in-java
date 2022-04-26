package Chapter3;


public class Task_9_MaxAndNinExponentialNotation {
    public static void main(String[] args) {
        Float i1 = Float.MAX_VALUE;
        Float i2 = Float.MIN_VALUE;
        Double j1 = Double.MAX_VALUE;
        Double j2 = Double.MIN_VALUE;
        System.out.println("Max float = " + i1);
        System.out.println("Min float = " + i2);
        System.out.println("Max double = " + j1);
        System.out.println("Min double = " + j2);
        long maxInt = 1;
        for (int i = 1; i <=32 ; i++) {
            maxInt*=2;
        }
        System.out.println("Int - from   -" + maxInt/2 + " to +" + (maxInt/2-1));
    }
}

package Chapter3;


public class Task_8_TestDifferViewOfLong {
    public static void main(String[] args) {
        long i = 0xA9;
        long j = 032;

        System.out.println("i = " + Long.toBinaryString(i));
        System.out.println("i = " + Long.toBinaryString(j));
        i<<=2;
        j>>=2;
        System.out.println("i = " + Long.toBinaryString(i));
        System.out.println("i = " + Long.toBinaryString(j));
       }
}

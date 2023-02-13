package Chapter5;

class River {
    static String name = "Dnipro";
    static String width;

    static {
        width = "wide";
    }
}

public class Task_14_InitialisationStaticFields {
    public static void main(String[] args) {
        System.out.println("River.name = " + River.name);
        System.out.println("River.width = " + River.width);
    }


}

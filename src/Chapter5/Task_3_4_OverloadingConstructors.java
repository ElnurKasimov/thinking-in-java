package Chapter5;

class OverloagTest {
    OverloagTest() {
        System.out.println("Создан объект");
    }

    OverloagTest(String param) {
        System.out.println("Создан объект с параметром " + param);
    }

}

public class Task_3_4_OverloadingConstructors {
    public static void main(String[] args) {
        OverloagTest test1 = new OverloagTest();
        OverloagTest test2 = new OverloagTest("param");
    }
}

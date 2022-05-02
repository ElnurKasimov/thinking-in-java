package Chapter5;



public class Task_3_4_OverloadingConstructors {

    static class OverloadTest {
        OverloadTest() {
            System.out.println("Создан объект");
        }

        OverloadTest(String param) {
            System.out.println("Создан объект с параметром " + param);
        }

    }
    public static void main(String[] args) {
        OverloadTest test1 = new OverloadTest();
        OverloadTest test2 = new OverloadTest("param");
    }
}

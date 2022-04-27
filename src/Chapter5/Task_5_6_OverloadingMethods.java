package Chapter5;

public class Task_5_6_OverloadingMethods {

    static class Dog {
        void bark(int i) {
            System.out.println("лает");
        }
        void bark(String str) {
            System.out.println("воет");
        }
        void bark(char c) {
            System.out.println("скулит");
        }
        void bark(String str, int i) {
            System.out.println("воет и лает");
        }
        void bark(int i, String str) {
            System.out.println("лает и воет");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(10);
        dog.bark("str");
        dog.bark('c');
        dog.bark(5, "ask");
        dog.bark("no", 3);
    }
}

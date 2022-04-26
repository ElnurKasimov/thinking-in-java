package Chapter5;

public class Task_1_ClassCreation {

    static class Person {
        private String name;

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
    }
}

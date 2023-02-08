package Chapter5;

public class Task_2_FieldsInitialization {

    static class Person {
        private String name;
        private String citizen = "Ukraine";

        Person (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", citizen " + citizen +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Suzie");
        System.out.println(person1);
        System.out.println(person2);
    }
}

package Chapter5;

public class Task_9_ConstructorWithThis {

    static class People {
        private String name;
        private double growth;

        public People(String name) {
            System.out.println("This people with name " + name);
        }

        public People(String name, double growth) {
            this(name);
            System.out.println("This people with name " + name + " and growth " + growth);
        }

    }

        public static void main(String[] args) {
            People people1 = new People ("Petr", 1.78 );
        }
}


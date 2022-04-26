package Chapter3;

    class Dogs {
        String name;
    }
    public class Task_6_ObjectsComparation {

        public static void main (String[] args) {

            Dogs dog1 = new Dogs();
            Dogs dog2 = new Dogs();

            dog1.name = "spots";
            dog2.name = "spots";

            boolean sign = (dog1 == dog2);
            boolean method = dog1.equals(dog2);
            System.out.println("Comparation through sign - " + sign);
            System.out.println("Comparation though method - " + method);

        }
    }

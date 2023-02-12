package Chapter5;


class Tank {
    boolean isFilled;

    Tank () {
        isFilled = false;
    }

    void fill () {
        isFilled = true;
    }

    void empty () {
        isFilled = false;
    }

    public void finalize() {
        if(isFilled) {
            System.out.println("Exception. Empty the tank first.");
        }
    }

}



public class Task_12_FinalizeTesting {

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.fill();
        new Tank().fill();
        System.gc();

    }
}

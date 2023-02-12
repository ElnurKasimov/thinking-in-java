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

class Truck {

    void refuel(Tank tank) {
        if (tank.isFilled) {
            System.out.println("Ok.Refueled from tank  " + tank);
        } else {
            System.out.println("Can not refuel. Fill tank first.");
        }
    }
}

public class Task_12_FinalizeTesting {

    public static void main(String[] args) {
        Tank tank = new Tank();
        Truck truck = new Truck();
        truck.refuel(tank);
        tank.fill();
        truck.refuel(tank);
        new Tank().fill();
        System.gc();
    }
}

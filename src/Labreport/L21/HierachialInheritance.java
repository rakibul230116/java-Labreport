package Labreport.L21;


interface IVehicle {
    void steering();
    void brake();
}

// Bus class implementing IVehicle
class Bus implements IVehicle {
    @Override
    public void steering() {
        System.out.println("Steering is used to control the Bus.");
    }

    @Override
    public void brake() {
        System.out.println("Brake is applied to reduce the speed of the Bus.");
    }
}

// Lorry class implementing IVehicle
class Lorry implements IVehicle {
    @Override
    public void steering() {
        System.out.println("Steering is used to turn the Lorry.");
    }

    @Override
    public void brake() {
        System.out.println("Brake is applied to reduce the speed of the Lorry.");
    }
}

// Car class implementing IVehicle
class Car implements IVehicle {
    @Override
    public void steering() {
        System.out.println("Steering is used to turn the Car.");
    }

    @Override
    public void brake() {
        System.out.println("Brake is applied to reduce the speed of the Car.");
    }
}


public class HierachialInheritance {
    public static void main(String[] args) {
        IVehicle b = new Bus();
        b.steering();
        b.brake();

        IVehicle v = new Lorry();
        v.steering();
        v.brake();

        IVehicle c = new Car();
        c.steering();
        c.brake();
    }
}
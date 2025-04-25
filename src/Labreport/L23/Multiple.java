package Labreport.L23;

interface IKitchen {
    void store();
}

interface IDrawingHall {
    void showcase();
}

interface IBedRoom {
    void airProvision();
}

class House implements IKitchen, IDrawingHall, IBedRoom {
    @Override
    public void store() {
        System.out.println("Place the groceries on the shelf.");
    }

    @Override
    public void showcase() {
        System.out.println("Keep the prizes, mementos, and medals in the showcase.");
    }

    @Override
    public void airProvision() {
        System.out.println("Provide an air conditioner in the bedroom.");
    }
}

public class Multiple {
    public static void main(String[] args) {
        House h = new House();

        h.store();
        h.showcase();
        h.airProvision();

        IKitchen k = new House();
        k.store();

        IDrawingHall d = h;
        d.showcase();

        IBedRoom b = h;
        b.airProvision();
    }
}
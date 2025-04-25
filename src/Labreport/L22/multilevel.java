package Labreport.L22;

// Interface IContinent
interface IContinent {
    void display();
}

// Interface ICountry extending IContinent
interface ICountry extends IContinent {
    void showCountry();
}

// Interface IState extending ICountry
interface IState extends ICountry {
    void displayState();
}

// Class Place implementing IState
class Place implements IState {
    @Override
    public void display() {
        System.out.println("Continent: ASIA");
    }

    @Override
    public void showCountry() {
        System.out.println("Country: BANGLADESH");
    }

    @Override
    public void displayState() {
        System.out.println("State: Rajshahi");
    }

    public void location() {
        System.out.println("Place: Pabna");
    }
}

// Main class
public class multilevel {
    public static void main(String[] args) {
        Place p = new Place();

        // Using IContinent reference
        IContinent cont = p;
        cont.display();

        // Using IState reference
        IState state = p;
        state.displayState();

        // Direct method call
        p.showCountry();
        p.location();
    }
}

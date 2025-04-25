package Labreport;

import java.util.*;

public class EnhancedForloop {
    public static void main(String[] args) {
        System.out.println();

        String states[] = {"Tamil Nadu", "Andhra Pradesh", "Uttar Pradesh", "Rajasthan"};

        // Using a traditional for loop
        for (int i = 0; i < states.length; i++) {
            System.out.println("State name: " + states[i]);
        }

        System.out.println();

        // Using an enhanced for loop
        for (String state : states) {
            System.out.println("Enhanced state name: " + state);
        }
    }
}

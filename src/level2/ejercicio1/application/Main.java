package level2.ejercicio1.application;

import level2.ejercicio1.model.Restaurant;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
        restaurants.add(new Restaurant("KFC", 1));
        restaurants.add(new Restaurant("KFC", 1));
        restaurants.add(new Restaurant("Caracas", 5));

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}

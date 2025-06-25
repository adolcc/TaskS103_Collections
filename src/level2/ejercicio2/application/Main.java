package level2.ejercicio2.application;

import level2.ejercicio2.model.Restaurant;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("KFC", 1) {
            @Override
            public String getName() {
                return super.getName();
            }
        });
        restaurants.add(new Restaurant("KFC", 1) {
            @Override
            public String getName() {
                return super.getName();
            }
        });
        restaurants.add(new Restaurant("Caracas", 5) {
            @Override
            public String getName() {
                return super.getName();
            }
        });

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}


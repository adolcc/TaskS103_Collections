package level1.Exercise3.application;

import level1.Exercise3.model.FileManager;
import level1.Exercise3.model.TestCountries;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        HashMap<String, String> countryCapitalMap = fileManager.loadCountries("src/countries.txt");

        if (countryCapitalMap.isEmpty()) {
            System.out.println("Failed to load data.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String username = scanner.nextLine();

        TestCountries testCountries = new TestCountries(countryCapitalMap);

        int score = testCountries.start();

        fileManager.saveResult(username, score, "classification.txt");

        scanner.close();
    }
}

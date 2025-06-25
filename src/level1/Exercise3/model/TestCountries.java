package level1.Exercise3.model;

import java.util.*;

public class TestCountries {

    private final HashMap<String, String> countryCapitals;
    private final Random random;

    public TestCountries(HashMap<String, String> countryCapitals) {
        this.countryCapitals = countryCapitals;
        this.random = new Random();
    }

    public int start() {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        for (int i = 0; i < 10; i++) {
            Object[] countries = countryCapitals.keySet().toArray();

            String country = (String) countries[random.nextInt(countries.length)];

            String correctCapital = countryCapitals.get(country);

            System.out.print("What is the capital of " + country + "?: ");

            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(correctCapital)) {
                score++;

                System.out.println("Correct!");

            } else {
                System.out.println("Incorrect! The correct capital is: " + correctCapital);
            }
        }

        return score;
    }
}

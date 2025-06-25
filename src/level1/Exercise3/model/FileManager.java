package level1.Exercise3.model;

import java.io.*;
import java.util.HashMap;

public class FileManager {

    public HashMap<String, String> loadCountries(String filePath) {
        HashMap<String, String> countries = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split(" ", 2);
                if (parts.length == 2) {
                    countries.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return countries;
    }

    public void saveResult(String name, int score, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("User: " + name + "\n");

            writer.write("Score: " + score + "\n");

            System.out.println("Results saved to " + filePath);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

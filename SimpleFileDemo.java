/*
 * SimpleFileDemo.java
 * This program demonstrates basic file operations in Java:
 * 1. Writing text to a file
 * 2. Reading text from a file
 * 3. Modifying file content (word replacement)
 *
 * Deliverable: A script showing file handling with clear documentation.
 */

import java.io.*;
import java.util.*;

public class SimpleFileDemo {
    public static void main(String args[]) {
        // File name to work with
        String file = "notefile.txt";

        
        // Step 1: Writing to the file
        
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Hello I am Anay Khandelwal.\n");
            fw.write("Coding in java because i love coding in java.");
            fw.close();
            System.out.println("Step 1: Writing done.");
        } catch (IOException e) {
            System.out.println("Problem writing: " + e);
        }

        
        // Step 2: Reading from the file
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Step 2: Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Problem reading: " + e);
        }

        
        // Step 3: Modifying the file
        
        try {
            List<String> lines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                // Replace the word "first" with "modified"
                lines.add(line.replace("first", "modified"));
            }
            br.close();

            FileWriter fw = new FileWriter(file);
            for (String l : lines) {
                fw.write(l+"\n");
            }
            fw.close();
            System.out.println("Step 3:Modification done.");
        } catch (IOException e) {
            System.out.println("Problem modifying: " + e);
        }
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class CarParkingSystemUtils {

    public static void validateCommands(File file){
        Set<String> commands = Commands.getCommands();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                counter++;
                if(!commands.contains(line.split(" ")[0])){
                    System.out.println(String.format("Unrecognized command at line no: %d", counter));
                    System.exit(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void executeCommands(File file){
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                CommandTranslator.translate(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        //change file path here
        File file = new File("/Users/rukman/parkingSystem.txt");
        //pre-validation
        CarParkingSystemUtils.validateCommands(file);
        //execute all commands in file
        CarParkingSystemUtils.executeCommands(file);
    }
}

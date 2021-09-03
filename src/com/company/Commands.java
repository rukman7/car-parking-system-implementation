package com.company;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Commands {
    public static final String parkCar = "Park";
    public static final String createParkingLot = "Create_parking_lot";
    public static final String slotNumbersByAge = "Slot_numbers_for_driver_of_age";
    public static final String slotNumberByVehicleNumber = "Slot_number_for_car_with_number";
    public static final String vacateSlot = "Leave";
    public static final String vehicleNumberByAge = "Vehicle_registration_number_for_driver_of_age";

    public static Set<String> getCommands(){
        return new HashSet<>(Arrays.asList(parkCar, createParkingLot, slotNumbersByAge, slotNumberByVehicleNumber, vacateSlot, vehicleNumberByAge));
    }
}

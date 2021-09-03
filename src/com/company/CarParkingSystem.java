package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class CarParkingSystem {
    private int size;
    private String[] slots;
    private HashMap<Integer, LinkedList<Car>> parkingDetails;

    CarParkingSystem(int size) {
        this.size = size;
        this.slots = new String[this.size + 1];
        this.parkingDetails = new HashMap<>(size);
        System.out.println(String.format("Created parking of %d slots", this.size));
    }

    public void park(String vehicleNumber, Integer driverAge) {
        int slot = 0;
        for (int i = 1; i < slots.length; i++) {
            if (this.slots[i] == null) {
                slot = i;
                break;
            }
        }
        if (slot > 0) {
            Car car = new Car(vehicleNumber, driverAge, slot);
            if (parkingDetails.containsKey(driverAge)) {
                parkingDetails.get(driverAge).add(car);
            } else {
                parkingDetails.put(driverAge, new LinkedList<>(Arrays.asList(car)));
            }
            System.out.println(String.format("Car with vehicle registration number \"%s\" " +
                    "has been parked at slot %d", vehicleNumber, slot));
            this.slots[slot] = vehicleNumber;
        } else {
            System.out.println("All spots are full at the parking lot");
        }
    }

    public void removeCarFromSlot(int slot) {
        if (slot > this.size) {
            System.out.println("Incorrect slot number");
        }

        if (this.slots[slot] != null) {
            this.slots[slot] = null;
            Car carObj = new Car(slot);
            for (Map.Entry m : this.parkingDetails.entrySet()) {
                LinkedList<Car> l = (LinkedList<Car>) m.getValue();
                if (l.remove(carObj))
                    break;
            }
            System.out.println(String.format("Provided slot %d has been successfully emptied", slot));
        } else {
            System.out.println(String.format("Slot %d is already vacant", slot));
        }
    }

    public void getVehicleNumbersByAge(Integer age) {
        if (this.parkingDetails.containsKey(age)) {
            List<String> vehicleNumbers = this.parkingDetails.get(age).stream().map(Car::getVehicleNumber).collect(Collectors.toList());
            if(vehicleNumbers.size()>0) System.out.println(vehicleNumbers);
        } else {
            System.out.println(String.format("No vehicles with the provided age(%d) exist", age));
        }
    }

    public void getSlotByVehicleNumber(String vehicleNumber){
        for(int i = 1; i < this.slots.length; i++){
            if(vehicleNumber.equalsIgnoreCase(this.slots[i])){
                System.out.println(String.format("Slot number of the vehicle %s is %d", vehicleNumber, i));
                return;
            }
        }
        System.out.println(String.format("No vehicle with number %s is present in the parking lot", vehicleNumber));
    }

    public void getSlotNumbersByAge(Integer age){
        if (this.parkingDetails.containsKey(age)) {
            List<Integer> ages = this.parkingDetails.get(age).stream().map(Car::getAllotedSlot).collect(Collectors.toList());
            if(ages.size()>0) System.out.println(ages);
        } else {
            System.out.println(String.format("No slots for provided age(%d) exist", age));
        }
    }
}

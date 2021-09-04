package com.company;

public class Car {

    private String vehicleNumber;
    private Integer driverAge;
    private int allotedSlot;

    public Car(String licenseNumber, Integer driverAge, int allotedSlot){
        this.vehicleNumber = licenseNumber;
        this.driverAge = driverAge;
        this.allotedSlot = allotedSlot;
    }

    Car(int allotedSlot){
        this(null, null, allotedSlot);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    public int getAllotedSlot() {
        return allotedSlot;
    }

    public void setAllotedSlot(int allotedSlot) {
        this.allotedSlot = allotedSlot;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        Car car = (Car) obj;
        return (car.allotedSlot == this.allotedSlot);
    }

    @Override
    public int hashCode(){
        return this.allotedSlot;
    }

}

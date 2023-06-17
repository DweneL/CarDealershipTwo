package com.cardealership;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    //public ArrayList<Vehicle> inventory;
    ArrayList <Vehicle> inventory = new ArrayList<Vehicle>();


    public ArrayList<Vehicle> getVehiclesByPrice(int min, int max){
      getVehiclesByPrice(min, max);
      return this.getVehiclesByPrice(min, max);
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        getVehiclesByMakeModel(make, model);
        return this.getVehiclesByMakeModel(make, model);
    }

    public ArrayList<Vehicle> getVehiclesByYear (int min, int max){
        getVehiclesByYear(min,max);
        return this.getVehiclesByYear(min, max);
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){
        getVehiclesByColor(color);
        return this.getVehiclesByColor(color);
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        getVehiclesByMileage(min, max);

        return this.getVehiclesByMileage(min, max);
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        getVehiclesByType(vehicleType);
        return this.getVehiclesByType(vehicleType);
    }

    public ArrayList<Vehicle> getAllVehicles(){
        getAllVehicles();
        return this.getAllVehicles();
    }

    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);

    }

    public void removeVehicle(String vehicle){
        this.inventory.remove(inventory);

    }


}

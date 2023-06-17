package com.cardealership;

public abstract class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private int vehicleSold;
    private Vehicle vehicle;

    public Contract(String date, String customerName, String customerEmail, int vehicleSold, Vehicle vehicle) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.vehicle = vehicle;

    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(int vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

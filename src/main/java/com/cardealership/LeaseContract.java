package com.cardealership;

public class LeaseContract extends Contract{
    private double leaseFee = .07;
    private double expectedEndingValue = .50;


    public LeaseContract(String date, String customerName, String customerEmail, int vehicleSold, Vehicle vehicle, double leaseFee, double expectedEndingValue) {
        super(date, customerName, customerEmail, vehicleSold, vehicle);
        this.leaseFee = leaseFee;
        this.expectedEndingValue = expectedEndingValue;
    }

    @Override
    public double getTotalPrice(){
        return 0;
    }
    @Override
    public double getMonthlyPayment(){
        return 0;
    }

}

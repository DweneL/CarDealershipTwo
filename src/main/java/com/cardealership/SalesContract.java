package com.cardealership;

public class SalesContract extends Contract{
    private static double salesTaxRate =0.5;
    private double recordingFee = 100;
    private boolean isFinanced;

    public SalesContract(String date, String customerName, String customerEmail, int vehicleSold, Vehicle vehicle, double recordingFee, boolean isFinanced) {
        super(date, customerName, customerEmail, vehicleSold, vehicle);
        this.recordingFee = recordingFee;
        this.isFinanced = isFinanced;
    }

    public static double getSalesTaxRate() {
        return salesTaxRate;
    }

    public static void setSalesTaxRate(double salesTaxRate) {
        SalesContract.salesTaxRate = salesTaxRate;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public double getProcessingFee(){
        if (getVehicle().getPrice() < 10000){
            return 295;

        } else {
            return 495;
        }

    }




    @Override
    public double getTotalPrice(){
        return getVehicle().getPrice() + getSalesTaxRate() + recordingFee + getProcessingFee();
    }

    @Override
    public double getMonthlyPayment(){
        if (isFinanced){
            double interestRate;
            int months;
            if (getVehicle().getPrice() > 10000){
                months = 48;
                interestRate = 4.25;
            } else{
                months = 24;
                interestRate = 5.25;
            }

            return calculatePayment(getTotalPrice(),months,interestRate);
        }else {

            return 0;
        }

    }

    private double calculatePayment(double totalCost, int numberOfPayments, double rate)
    {
        double interestRate = rate / 12;
        double monthlyPayment = totalCost * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
        monthlyPayment = Math.round(monthlyPayment * 100);
        monthlyPayment /= 100;
        return monthlyPayment;
    }
}




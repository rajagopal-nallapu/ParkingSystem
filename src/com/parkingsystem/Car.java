package com.parkingsystem;

public class Car {

    private String CarBrand;
    private String CarRegistrationNumber;
    private String CarColor;
    // constructor
    public Car(String CarBrand, String CarRegistrationNumber,String CarColor) {
        this.CarBrand  = CarBrand;
        this.CarRegistrationNumber = CarRegistrationNumber;
        this.CarColor  = CarColor;

    }
    //getting Car data
    public String getCarBrand() {
        return CarBrand;
    }

    public String getCarRegistrationNumber() {
        return CarRegistrationNumber;
    }
    public String getCarColor() {
        return CarColor;
    }

    //setting vehiclle data
    public void setCarBrand(String CarBrand) {
        this.CarBrand = CarBrand;
    }
    public void setCarRegistrationNumber(String CarRegistrationNumber) {
        this.CarRegistrationNumber = CarRegistrationNumber;
    }
    public void setCarColor(String CarColor) {
        this.CarColor = CarColor;
    }
    // Printing CarData
    public void prinCarDetails(){
        System.out.println("Brand of this Car is :: " + this.CarBrand);
        System.out.println("Car Number is :: " + this.CarRegistrationNumber);
        System.out.println("Car Number is :: " + this.CarColor);
    }

}

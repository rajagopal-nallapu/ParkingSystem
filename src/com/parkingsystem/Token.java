package com.parkingsystem;
import java.util.Date;
public class Token {

    private String tokenNumber;
    private Slot slotInformation;
    private Car  carInformation;
    private Date tokenDate;
    private long checkoutTime;
    public Token(String tokenNumber, Slot slotInformation, Car carInformation)
    {
        this.tokenNumber = tokenNumber;
        this.slotInformation = slotInformation;
        this.carInformation = carInformation;
        this.tokenDate = new Date();

    }

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public Slot getSlotInformation() {
        return slotInformation;
    }

    public void setSlotInformation(Slot slotInformation) {
        this.slotInformation = slotInformation;
    }

    public Car getCarInformation() {
        return carInformation;
    }

    public void setCarInformation(Car carInformation) {
        this.carInformation = carInformation;
    }
    public Token updateCheckoutTime(){
           this.checkoutTime = System.currentTimeMillis();
           return this;
    }

}

package com.parkingsystem;

public class Slot
{
    private String slotNumber;
    private boolean availability;

    public Slot(String slotNumber)
    {
        this.slotNumber = slotNumber;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public boolean isSlotFree(){
        return !availability;
    }
    public Slot occupyTheSlot(){
        this.availability=true;
        return this;
    }
    public Slot makeSlotFree(){
        this.availability = false;
        return this;
    }



}
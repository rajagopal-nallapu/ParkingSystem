package com.parkingsystem;
import java.util.ArrayList;
import java.util.List;

// park the car, unpark the car, check slot availability,
public class ParkingDetails {


    Slot[] availableSlots;
    private int totalNumberOfParkingSlotsAvailable;
    public List<Token>  tokens = new ArrayList<>();
    private List<Token> historyOfParking= new ArrayList<>();

    public ParkingDetails(int totalNumberOfParkingSlotsAvailable){
        System.out.println("Total slots:"+totalNumberOfParkingSlotsAvailable);
        this.totalNumberOfParkingSlotsAvailable = totalNumberOfParkingSlotsAvailable;
        availableSlots = new Slot[totalNumberOfParkingSlotsAvailable];
        setAvailableSlots(totalNumberOfParkingSlotsAvailable);

    }


    private void setAvailableSlots(int totalNumberOfSlots){

            for (int slotNumber = 0; slotNumber < totalNumberOfSlots; slotNumber++) {

                availableSlots[slotNumber] = new Slot(String.valueOf(slotNumber));

        }

    }

    public Token parkAcar(Car carDetails){
        if(isParkingSlotFree()){
            System.out.println("Free slots are available");
            Slot availableSlots = getSlots();
            Token newToken = new Token(String.valueOf(System.currentTimeMillis()), availableSlots, carDetails);
            tokens.add(newToken);
            availableSlots.occupyTheSlot();
            System.out.println("Car Parked in :: New Token:" + newToken.getTokenNumber());
            for (Token token: tokens
            ) {

                System.out.println(token.getCarInformation().getCarRegistrationNumber());
                System.out.println(token.getCarInformation().getCarColor());
                System.out.println(token.getSlotInformation().getSlotNumber());
            }

            return newToken;
        }
        return null;
    }
    public String unparkAcar(String tokenNumber) {
        for (Token tokensInSlot : tokens) {
            System.out.println(tokensInSlot.getTokenNumber());
            System.out.println("sent by us"+tokenNumber);
            if (tokensInSlot.getTokenNumber().equals(tokenNumber)) {
                tokens.remove(tokensInSlot);
                Slot slot = tokensInSlot.getSlotInformation();
                String slotNumber = slot.getSlotNumber();
                return removeCarFromSlot(tokensInSlot, slotNumber);
            }

        }
        return null;
    }
    public String removeCarFromSlot(Token token, String slotNumber) {
        for (Slot removeEntry:availableSlots){
            System.out.println(removeEntry.getSlotNumber());
            System.out.println(slotNumber);
            if(removeEntry.getSlotNumber() == slotNumber){
                removeEntry.makeSlotFree();
                Token historyToken = token.updateCheckoutTime();
                historyOfParking.add(historyToken);
                return "Car entry removed";
            }

        }
        return null;
    }
   public void showListOfCarDetails() {
       for (Token token: tokens) {

           System.out.println(token.getCarInformation().getCarRegistrationNumber());
           System.out.println(token.getCarInformation().getCarColor());
           System.out.println(token.getCarInformation().getCarBrand());
           System.out.println(token.getSlotInformation().getSlotNumber());
       }

    }
    private boolean isParkingSlotFree() {
        boolean isSlotFree = false;
        for(Slot slot:availableSlots){
            System.out.println(slot.toString());
            if(slot.isSlotFree()){
                isSlotFree = true;
                break;
            }
        }
        System.out.println(isSlotFree);
        return isSlotFree;
    }
    private Slot getSlots() {
        for(Slot slot:availableSlots){
            if(slot.isSlotFree()){
                return slot;
            }
        }
        return null;
    }


}

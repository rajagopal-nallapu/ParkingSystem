package com.parkingsystem;

import java.util.Scanner;

public class ExecuteParkingSystem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int menulist;

        System.out.println("Welcome to Parking System");
        System.out.println("1.Enter parking slot");
        System.out.println("2.Leave parking slot");
        System.out.println("3.List of parking cars");
        System.out.println("4.List of slot numbers with the same car color");
        System.out.println("5.List of car parking details with registration number");
        System.out.println("6.Exit");
        ParkingDetails parkCarInSlot = new ParkingDetails(10);
        do {
            System.out.println("---------------------------------");
            System.out.println("Enter an Option");
            System.out.println("---------------------------------");
            menulist = sc.nextInt();

            switch(menulist) {

                case 1:
                    if(menulist == 1) {
                        System.out.println("\n Enter registration number \n");
                        String CarRegistrationNumber = sc.next();
                        System.out.println("\n Enter Color \n");
                        String CarColor = sc.next();
                        System.out.println("\n Enter brand \n");
                        String CarBrand = sc.next();
                        Car cardetailsObj = new Car(CarBrand, CarRegistrationNumber,CarColor);
                        parkCarInSlot.parkAcar(cardetailsObj);

                    }

                case 2:
                    System.out.println("Enter Token to remove");
                    String tokenNumber = sc.next();

                    String result = parkCarInSlot.unparkAcar(tokenNumber);
                    System.out.println(result);
                case 3:
                    System.out.println("List of Parking cars");
                    parkCarInSlot.showListOfCarDetails();
                    break;

                    break;



            }
        }while(menulist != 6);
        System.out.println("Thankyou for using our parking system.");



    }




}

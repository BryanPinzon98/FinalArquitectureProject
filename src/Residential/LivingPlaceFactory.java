/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Residential;

import AbstractFactory.AbstractFactory;
import Commercial.ICommercial;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class LivingPlaceFactory extends AbstractFactory {

    private IResidential iResidential = null;

    @Override
    public void createLivingPlace() {

        Scanner in = new Scanner(System.in);
        ArrayList<IResidential> residentialPlaces = new ArrayList<>();

        System.out.println("Who type of business place are you interested?");
        System.out.println("1. House.");
        System.out.println("2. Apartment.");
        System.out.print("-> ");
        int businessPlaceSelected = in.nextInt();

        System.out.println("Excelent, now please fill the following data:");

        System.out.print("- Address: ");
        String address = in.next();

        System.out.print("- Owner: ");
        String owner = in.next();

        System.out.print("- Residents number: ");
        int residentsNumber = in.nextInt();

        System.out.print("- Rooms number: ");
        int roomsNumber = in.nextInt();

        System.out.print("- Square Meters: ");
        float squareMeters = in.nextFloat();

        switch (businessPlaceSelected) {
            case 1:
                iResidential = new House(address, owner, residentsNumber, roomsNumber, squareMeters);
                break;
            case 2:
                iResidential = new Apartment(address, owner, residentsNumber, roomsNumber, squareMeters);
                break;
        }

        residentialPlaces.add(iResidential);
    }

    @Override
    public void createBusinessPlace() {
        System.out.println("This functionality is not available here.");
    }

}

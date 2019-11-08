/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commercial;

import AbstractFactory.AbstractFactory;
import FacadePaymentMethod.FacadePaymentMethod;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class BusinessPlaceFactory extends AbstractFactory {

    private ICommercial iCommercial = null;
    private FacadePaymentMethod paymentMethod = null;

    @Override
    public void createLivingPlace() {
        System.out.println("This functionality is not available here.");
    }

    @Override
    public void createBusinessPlace() {

        Scanner in = new Scanner(System.in);
        ArrayList<ICommercial> businessPlaces = new ArrayList<>();
        paymentMethod = FacadePaymentMethod.getInstance();

        System.out.println("Who type of business place are you interested?");
        System.out.println("1. Shop.");
        System.out.println("2. Warehouse.");
        System.out.print("-> ");
        int businessPlaceSelected = in.nextInt();

        System.out.println("Excelent, now please fill the following data:");

        System.out.print("- Address: ");
        String address = in.next();

        System.out.print("- Owner: ");
        String owner = in.next();

        System.out.print("- Square Meters: ");
        float squareMeters = in.nextFloat();

        System.out.print("- Commercial Activity: ");
        String commercialActivity = in.next();

        switch (businessPlaceSelected) {
            case 1:
                iCommercial = new Shop(address, owner, squareMeters, commercialActivity);
                paymentMethod.setBuildingType("SHOP");
                break;
            case 2:
                iCommercial = new Warehouse(address, owner, squareMeters, commercialActivity);
                paymentMethod.setBuildingType("WAREHOUSE");
                break;
        }

        businessPlaces.add(iCommercial);
    }
}

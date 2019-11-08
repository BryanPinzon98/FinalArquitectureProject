/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePaymentMethod;

import VisitorPattern.DiscountElement.ApartmentDiscount;
import VisitorPattern.DiscountElement.HouseDiscount;
import VisitorPattern.DiscountElement.IDiscountElement;
import VisitorPattern.DiscountElement.ShopDiscount;
import VisitorPattern.DiscountElement.WarehouseDiscount;
import VisitorPattern.PaymentMethod.Cash;
import VisitorPattern.PaymentMethod.CreditCard;
import VisitorPattern.PaymentMethod.IPaymentMethod;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class FacadePaymentMethod {

    private static FacadePaymentMethod INSTANCE;
    private IDiscountElement iDiscountElement;

    public FacadePaymentMethod() {
    }

    public static FacadePaymentMethod getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new FacadePaymentMethod();
        } else {
            System.out.println("You have already an instance created.");
        }

        return INSTANCE;
    }

    public void setBuildingType(String buildingType) {

        Scanner in = new Scanner(System.in);
        IPaymentMethod iPaymentMethod = null;

        System.out.println("Now, please choose the payment method:");
        System.out.println("1. Credit card.");
        System.out.println("2. Cash.");
        System.out.print("-> ");
        int paymentMethod = in.nextInt();

        switch (paymentMethod) {
            case 1:
                iPaymentMethod = new CreditCard();
                break;
            case 2:
                iPaymentMethod = new Cash();
                break;
        }

        switch (buildingType) {
            case "HOUSE":
                iDiscountElement = new HouseDiscount();
                iDiscountElement.accept(iPaymentMethod);
                break;
            case "APARTMENT":
                iDiscountElement = new ApartmentDiscount();
                iDiscountElement.accept(iPaymentMethod);
                break;
            case "SHOP":
                iDiscountElement = new ShopDiscount();
                iDiscountElement.accept(iPaymentMethod);
                break;
            case "WAREHOUSE":
                iDiscountElement = new WarehouseDiscount();
                iDiscountElement.accept(iPaymentMethod);
                break;
        }

    }

}

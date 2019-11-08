/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPattern.PaymentMethod;

import VisitorPattern.DiscountElement.ApartmentDiscount;
import VisitorPattern.DiscountElement.HouseDiscount;
import VisitorPattern.DiscountElement.ShopDiscount;
import VisitorPattern.DiscountElement.WarehouseDiscount;

/**
 *
 * @author bryan
 */
public class Cash implements IPaymentMethod {

    @Override
    public void houseDiscount(HouseDiscount houseDiscount) {
        System.out.println("Congratulations, you will get a 6% discount on your house building with cash payment method.");
    }

    @Override
    public void apartmentDiscount(ApartmentDiscount apartmentDiscount) {
        System.out.println("Congratulations, you will get a 10% discount on your apartment building with cash payment method.");
    }

    @Override
    public void shopDiscount(ShopDiscount shopDiscount) {
        System.out.println("Congratulations, you will get a 14% discount on your shop building with cash payment method.");
    }

    @Override
    public void warehouseDiscount(WarehouseDiscount warehouseDiscount) {
        System.out.println("Congratulations, you will get a 20% discount on your warehouse building with cash payment method.");
    }
      
}

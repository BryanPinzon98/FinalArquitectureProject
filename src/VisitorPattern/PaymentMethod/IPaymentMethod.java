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
public interface IPaymentMethod {

    public void houseDiscount(HouseDiscount houseDiscount);

    public void apartmentDiscount(ApartmentDiscount apartmentDiscount);

    public void shopDiscount(ShopDiscount shopDiscount);

    public void warehouseDiscount(WarehouseDiscount warehouseDiscount);

}

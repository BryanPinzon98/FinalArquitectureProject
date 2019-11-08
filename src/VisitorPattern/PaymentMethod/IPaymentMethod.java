/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPattern.PaymentMethod;

/**
 *
 * @author bryan
 */
public interface IPaymentMethod {

    public void houseDiscount();

    public void apartmentDiscount();

    public void shopDiscount();

    public void warehouseDiscount();

}

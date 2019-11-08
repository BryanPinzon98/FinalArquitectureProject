/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPattern.DiscountElement;

import VisitorPattern.PaymentMethod.IPaymentMethod;

/**
 *
 * @author bryan
 */
public interface IDiscountElement {
    public void accept(IPaymentMethod iPaymentMethod);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AbstractFactory.AbstractFactory;
import Commercial.BusinessPlaceFactory;
import Commercial.ICommercial;
import Residential.LivingPlaceFactory;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        AbstractFactory newAbstractFactory;

        System.out.println("--Welcome to Inmobiliarias LTDA--");
        System.out.println("What type of property do you want to create?");
        System.out.println("1. Residential.");
        System.out.println("2. Commercial. ");
        System.out.print("-> ");
        int typeProperty = in.nextInt();

        switch (typeProperty) {
            case 1:
                newAbstractFactory = new LivingPlaceFactory();
                newAbstractFactory.createLivingPlace();
                break;
            case 2:
                newAbstractFactory = new BusinessPlaceFactory();
                newAbstractFactory.createBusinessPlace();
                break;
        }
    }

}

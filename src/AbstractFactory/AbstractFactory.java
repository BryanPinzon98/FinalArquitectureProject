/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Commercial.ICommercial;
import Residential.IResidential;

/**
 *
 * @author bryan
 */
public abstract class AbstractFactory {

    public abstract void createLivingPlace();
    public abstract void createBusinessPlace();

}

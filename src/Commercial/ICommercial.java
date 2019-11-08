/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commercial;

/**
 *
 * @author bryan
 */
public abstract class ICommercial {

    private String address;
    private String owner;
    private float squareMeters;
    private String commercialActivity;

    public ICommercial(String address, String owner, float squareMeters, String commercialActivity) {
        this.address = address;
        this.owner = owner;
        this.squareMeters = squareMeters;
        this.commercialActivity = commercialActivity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(float squareMeters) {
        this.squareMeters = squareMeters;
    }

    public String getCommercialActivity() {
        return commercialActivity;
    }

    public void setCommercialActivity(String commercialActivity) {
        this.commercialActivity = commercialActivity;
    }



}

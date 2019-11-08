/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Residential;

/**
 *
 * @author bryan
 */
public abstract class IResidential {

    private String address;
    private String owner;
    private int residentsNumber;
    private int roomsNumber;
    private float squareMeters;

    public IResidential(String address, String owner, int residentsNumber, int roomsNumber, float squareMeters) {
        this.address = address;
        this.owner = owner;
        this.residentsNumber = residentsNumber;
        this.roomsNumber = roomsNumber;
        this.squareMeters = squareMeters;
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

    public int getResidentsNumber() {
        return residentsNumber;
    }

    public void setResidentsNumber(int residentsNumber) {
        this.residentsNumber = residentsNumber;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public float getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(float squareMeters) {
        this.squareMeters = squareMeters;
    }
    
}

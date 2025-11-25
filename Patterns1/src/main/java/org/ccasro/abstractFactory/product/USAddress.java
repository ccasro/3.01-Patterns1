package org.ccasro.abstractFactory.product;

import org.ccasro.abstractFactory.factory.Address;

public class USAddress implements Address {

    private String street;
    private String city;
    private String zip;

    public USAddress(String street, String city, String zip){
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String getFullAddress(){
        return street + ", " + city + " " + zip + ", USA";
    }

}

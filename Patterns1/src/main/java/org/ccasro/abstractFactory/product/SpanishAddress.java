package org.ccasro.abstractFactory.product;

import org.ccasro.abstractFactory.factory.Address;

public class SpanishAddress implements Address {

    private String street;
    private String city;
    private String postalCode;

    public SpanishAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getFullAddress(){
        return street + ", " + postalCode + " " + city + ", Spain";
    }
}
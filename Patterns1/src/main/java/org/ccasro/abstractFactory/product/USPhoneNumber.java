package org.ccasro.abstractFactory.product;

import org.ccasro.abstractFactory.factory.PhoneNumber;

public class USPhoneNumber implements PhoneNumber {

    private String number;

    public USPhoneNumber(String number){
        this.number = number;
    }

    @Override
    public String getInternationalNumber(){
        return "+1 " + number;
    }
}

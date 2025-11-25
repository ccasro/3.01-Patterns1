package org.ccasro.abstractFactory.product;

import org.ccasro.abstractFactory.factory.PhoneNumber;

public class SpanishPhoneNumber implements PhoneNumber {

    private String number;

    public SpanishPhoneNumber(String number){
        this.number = number;
    }

    @Override
    public String getInternationalNumber() {
        return "+34 " + number;
    }
}


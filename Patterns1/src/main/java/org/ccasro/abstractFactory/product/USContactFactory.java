package org.ccasro.abstractFactory.product;

import org.ccasro.abstractFactory.factory.Address;
import org.ccasro.abstractFactory.factory.ContactFactory;
import org.ccasro.abstractFactory.factory.PhoneNumber;

public class USContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, String city, String zip){
        return new USAddress(street,city,zip);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number){
        return new USPhoneNumber(number);
    }
}

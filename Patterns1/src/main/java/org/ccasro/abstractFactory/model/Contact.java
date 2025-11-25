package org.ccasro.abstractFactory.model;

import org.ccasro.abstractFactory.factory.Address;
import org.ccasro.abstractFactory.factory.PhoneNumber;

public class Contact {
    private Address address;
    private PhoneNumber phone;

    public Contact(Address address, PhoneNumber phone){
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return address.getFullAddress() + "\n" + phone.getInternationalNumber() + "\n";
    }
}

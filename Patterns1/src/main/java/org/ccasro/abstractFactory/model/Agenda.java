package org.ccasro.abstractFactory.model;

import org.ccasro.abstractFactory.factory.Address;
import org.ccasro.abstractFactory.factory.ContactFactory;
import org.ccasro.abstractFactory.factory.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts = new ArrayList<>();

    private ContactFactory factory;

    public Agenda(ContactFactory factory){
        this.factory = factory;
    }

    public void addContact(String street, String city, String postal, String phone){

        Address address = factory.createAddress(street,city, postal);
        PhoneNumber phoneNumber = factory.createPhoneNumber(phone);

        contacts.add(new Contact(address,phoneNumber));
    }

    public List<Contact> getContacts(){
        return List.copyOf(contacts);
    }

    public void showContacts(){
        System.out.println("---Contacts---");

        for(Contact c: contacts) {
            System.out.println(c);
        }
    }






}

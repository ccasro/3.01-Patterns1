package org.ccasro.abstractFactory;

import org.ccasro.abstractFactory.model.Agenda;
import org.ccasro.abstractFactory.product.SpanishContactFactory;
import org.ccasro.abstractFactory.product.USContactFactory;

public class Main {
    public static void main(String[] args){
        Agenda agendaSP = new Agenda(new SpanishContactFactory());
        agendaSP.addContact("Major 10", "Barcelona", "08003","612345342");

        Agenda agendaUS = new Agenda(new USContactFactory());
        agendaUS.addContact("4th Avenue","New York", "10001", "2124454679" );

        agendaUS.showContacts();
        agendaSP.showContacts();
    }
}

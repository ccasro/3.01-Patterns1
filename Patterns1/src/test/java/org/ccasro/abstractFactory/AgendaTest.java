package org.ccasro.abstractFactory;

import org.ccasro.abstractFactory.model.*;
import org.ccasro.abstractFactory.factory.*;
import org.ccasro.abstractFactory.product.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AgendaTest {

    @Test
    void testSpanishFactoryCreatesCorrectObjects(){
        ContactFactory factory = new SpanishContactFactory();

        Address a = factory.createAddress("Major","Bcn","08000");
        PhoneNumber p = factory.createPhoneNumber("653245312");

        assertThat(a).isInstanceOf(SpanishAddress.class);
        assertThat(a.getFullAddress()).contains("Bcn");

        assertThat(p).isInstanceOf(SpanishPhoneNumber.class);
        assertThat(p.getInternationalNumber().startsWith("+34"));
    }

    @Test
    void testUSFactoryCreatesCorrectObjects(){
        ContactFactory factory = new USContactFactory();

        Address a = factory.createAddress("5th","New York","10001");
        PhoneNumber p = factory.createPhoneNumber("2313456764");

        assertThat(a).isInstanceOf(USAddress.class);
        assertThat(a.getFullAddress()).contains("New York");

        assertThat(p).isInstanceOf(USPhoneNumber.class);
        assertThat(p.getInternationalNumber().startsWith("+1"));
    }

    @Test
    void testAddContactToAgenda(){
        Agenda agenda = new Agenda(new SpanishContactFactory());
        agenda.addContact("Castillejos","Bcn","08001","643523456");

        assertThat(agenda.getContacts()).hasSize(1);
        Contact c = agenda.getContacts().getFirst();
        assertThat(c.toString()).contains("Bcn","+34");
    }

}

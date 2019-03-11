package com.step.assignments.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {
    @Test
    void itShouldNewContact() {
        MobilePhone mobilePhone = new MobilePhone(97039L);
        Contact leela = new Contact("leela", 9059071787L);
        assertTrue(mobilePhone.addNewContact(leela));
    }

    @Test
    void shouldnotAddContactIfItPresent() {
        MobilePhone mobilePhone = new MobilePhone(97039L);
        Contact leela = new Contact("leela", 9059071787L);
        mobilePhone.addNewContact(leela);
        Contact leela1 = new Contact("leela", 9059071787L);
        assertFalse(mobilePhone.addNewContact(leela1));
    }
//
//    @Test
//    @DisplayName("should return null because the contactName is not present in contacts.")
//    void queryContact() {
//        MobilePhone mobile = new MobilePhone(90144412L);
//        assertEquals(mobile.queryContact("sai"),null);
//    }
//
//    @Test
//    @DisplayName("should return the contact because the contactName is present in contacts.")
//    void queryContact1() {
//        MobilePhone mobile = new MobilePhone(90144412L);
//        Contact contact = new Contact("sai",948712340L);
//        mobile.addNewContact(contact);
//        assertEquals(mobile.queryContact("sai"),contact);
//    }
//
//    @Test
//    @DisplayName("should return status as true because new contact does not exists.")
//    void updateContact1() {
//        MobilePhone mobile = new MobilePhone(90144412L);
//        Contact contact = new Contact("sai",9014469597L);
//        Contact newContact = new Contact("ganesh",47934L);
//        mobile.addNewContact(contact);
//        assertTrue(mobile.updateContact(contact,newContact));
//    }
//
//    @Test
//    @DisplayName("should return status as false because new contact exists.")
//    void updateContact2() {
//        MobilePhone mobile = new MobilePhone(90144412L);
//        Contact contact = new Contact("sai",9014469597L);
//        Contact newContact = new Contact("ganesh",47934L);
//        mobile.addNewContact(contact);
//        mobile.addNewContact(newContact);
//        assertFalse(mobile.updateContact(contact,newContact));
//    }
//
//    @Test
//    @DisplayName("should return status as true because contact exists.")
//    void removeContact() {
//        MobilePhone mobile = new MobilePhone(90144412L);
//        Contact contact = new Contact("sai",9014469597L);
//        mobile.addNewContact(contact);
//        assertTrue(mobile.removeNumber("sai"););
//    }
//
//    @Test
//    @DisplayName("should return status as false because there is no person with that contact name.")
//    void removeContact2() {
//        MobilePhone mobile = new MobilePhone(90144412L);
//        Contact contact = new Contact("sai",9014469597L);
//        mobile.addNewContact(contact);
//        assertFalse(mobile.removeContact("ganesh"));
//    }

}
package com.step.assignments.arrays;


public class MainForMobile {
    private static MobilePhone mobilePhone = new MobilePhone(9703920932L);

    public static void main(String[] args) {
        Contact nakka = new Contact("nakka", 97039L);
        MobilePhone mobilePhone = new MobilePhone(90590);
        Contact leela = new Contact("leela", 71787L);
        mobilePhone.addNewContact(leela);
        mobilePhone.addNewContact(nakka);
        mobilePhone.modifyContact(nakka,leela);
        mobilePhone.removeNumber(leela);

        mobilePhone.getPhoneNumbers();
    }
}


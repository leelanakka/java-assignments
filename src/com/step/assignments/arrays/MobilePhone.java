package com.step.assignments.arrays;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> phoneNumbers;
    private long myNumber;


    public MobilePhone(long myNumber) {
        this.myNumber = myNumber;
        this.phoneNumbers = new ArrayList<Contact>();
        ;
    }

    public boolean addNewContact(Contact contact) {
        for (int i = 0; i < this.phoneNumbers.size(); i++) {
            if(iscontactPresent(contact)){
                return false;
            }
        }
        phoneNumbers.add(contact);
        return true;
    }

    public boolean iscontactPresent(Contact contact){
        for (int i = 0; i < phoneNumbers.size(); i++) {
            if (phoneNumbers.get(i).getName().equals(contact.getName())){
                return true;
            }
        }
        return false;
    }

    public void modifyContact(Contact previousContact, Contact newContact) {
        int index = this.phoneNumbers.indexOf(previousContact);
        this.phoneNumbers.set(index, newContact);
    }

    public void removeNumber(Contact contact) {
        this.phoneNumbers.remove(this.phoneNumbers.indexOf(contact));
    }

    public void searchContact(String name) {
        for (int i = 0; i < this.phoneNumbers.size(); i++) {
            if (this.phoneNumbers.get(i).getName() == name) {
                System.out.println("the number you are searching with " + name + " is" + this.phoneNumbers.get(i).getPhoneNumber());
                break;
            }
        }
    }

    public void getPhoneNumbers() {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            System.out.println("name is "+phoneNumbers.get(i).getName()+" and number is "+phoneNumbers.get(i).getPhoneNumber());
        }
    }

}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contact (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contact
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.


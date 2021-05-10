package com.tts;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
    ArrayList ourAddressBook;

    public AddressBook() {
        this.ourAddressBook = new ArrayList<>();
    }

    Scanner scanner = new Scanner(System.in);

    public void add() {
        // Function to suggest to users to add values to their entries
        System.out.println("Enter your first name.");
        String firstName = scanner.next();

        System.out.println("Enter your last name.");
        String lastName = scanner.next();

        System.out.println("Enter your phone number.");
        String phoneNumber = scanner.next();

        System.out.println("Enter your email address.");
        String emailAddress = scanner.next();

        System.out.println("Your entry has been added!");

        IndividualInfo NewPerson = new IndividualInfo(firstName, lastName, phoneNumber, emailAddress);

        ourAddressBook.add(NewPerson);
    }

    public void search() {
        System.out.println("Enter a name, number, or email address.");
        String searchFirstName = scanner.next();

        for (int i = 0; i <= ourAddressBook.size(); i++) {
            IndividualInfo NewPerson = (IndividualInfo)ourAddressBook.get(i);

            if (searchFirstName.equals(NewPerson.getFirstName())
                    || searchFirstName.equals(NewPerson.getLastName())
                    || searchFirstName.equals(NewPerson.getEmailAddress())
                    || searchFirstName.equals(NewPerson.getPhoneNumber())
            ) {
                System.out.println(NewPerson.toString());
            }
        }
    }

    public void deletePerson () {
        System.out.println("Enter a name, number, or email address.");
        String deleteIndividual = scanner.next();

        for (int i = 0; i <= ourAddressBook.size(); i++) {
            IndividualInfo NewPerson = (IndividualInfo) ourAddressBook.get(i);
            if ( deleteIndividual.equals(NewPerson.getFirstName())
                    || deleteIndividual.equals(NewPerson.getLastName())
                    || deleteIndividual.equals(NewPerson.getEmailAddress())
                    || deleteIndividual.equals(NewPerson.getPhoneNumber())
            ) {
                ourAddressBook.remove(i);
                System.out.println("There are now " + ourAddressBook.size() + " entries in our address book.");
            } else {
                System.out.println("Our records indicate there is no person that has " + "'" + deleteIndividual +"'" +
                        " as a part of their information");
            }
        }
    }

    public void print() {
        if (ourAddressBook.size() == 0) {
            System.out.println("This address book is currently empty.");
        } else {
            for (int i = 0; i < ourAddressBook.size(); i++) {
                IndividualInfo NewPerson = (IndividualInfo) ourAddressBook.get(i);
                System.out.println(NewPerson.toString());
            }
            if (ourAddressBook.size() == 1) {
                System.out.println("There is currently a single entry in our address book.");
            } else {
                System.out.println("There are currently " + ourAddressBook.size() + " entries in our address book.");
            }
        }
    }

    public void deleteAddressBook() {
        if (ourAddressBook.size() == 0) {
            System.out.println("This address book is currently empty.");
        } else {
            ourAddressBook.clear();
            System.out.println("The contents of the entire address book have been removed.");
        }
    }

    public void quit() {
        System.out.println("Are you sure you want to quit?");
        String quitResponse = scanner.next().toUpperCase();

        if (quitResponse.equals("YES") || quitResponse.equals("Y")) {
            System.out.println("You have quit the program.");
            System.exit(0);
        }
    }
}
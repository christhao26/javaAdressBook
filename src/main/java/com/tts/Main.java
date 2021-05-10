package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressFunction = new AddressBook();

        while (true) {

            System.out.println("Please choose what you'd like to do with the address book: ");
            Integer userDecision = scanner.nextInt();

            switch (userDecision) {
                case 1:
                    addressFunction.add();
                    break;

                case 2:
                    addressFunction.deletePerson();
                    break;

                case 3:
                    addressFunction.search();
                    break;
                case 4:
                    addressFunction.print();
                    break;
                case 5:
                    addressFunction.deleteAddressBook();
                    break;

                case 6:
                    addressFunction.quit();
                    break;

                default:
                    System.out.println("Please choose a number between 1 and 6 (inclusive).");
            }
        }
    }
}
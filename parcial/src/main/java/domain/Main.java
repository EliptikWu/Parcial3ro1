package domain;

import domain.models.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Contact> contact;

        //List<Contact> contactList = Arrays.asList < Contact > ();
        String opc = "1";
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("1. Añadir nuevos contactos\n" +
                    "2. - Listar los contactos existentes y filtrarlos por alguna categoría deseada por el usuario\n" +
                    "3. - Contar la cantidad de contactos de una categoría especifica\n" +
                    "4. - Generar una lista de contactos de una categoría particular, solo indicando su nombre y teléfono.");
            System.out.println("Put the option: ");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("--------------------------------");
                    System.out.println("Add new contact");

                    System.out.println("--------------------------------");
                    break;
                }
                case "2": {
                    System.out.println("--------------------------------");
                    System.out.println("List of all contacts");
                    System.out.println("--------------------------------");
                    break;
                }

            }

        }while (opc != "2") ;
    }
}
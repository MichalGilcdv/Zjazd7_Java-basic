package pl.cdv.test.sobota;

import java.util.Scanner;

public class MethodsName {

    public static void main(String[] args) {


        Scanner human = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = human.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = human.nextLine();

        GiveMeYourName(name,surname);


    }

    public static void GiveMeYourName (String name, String surname){
        System.out.println("Hello, I am " +name + ' '+ surname);


    }
}


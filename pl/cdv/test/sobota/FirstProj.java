package pl.cdv.test.sobota;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class FirstProj {
    public static void main(String[] args) {


   // task3();
    task4();


    }

    private static void task3(){
        Scanner scanner = new Scanner(System.in);

        int firstValue;
        float secondValue;

        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        firstValue = scanner.nextInt();
        System.out.println("Podaj drugą liczbę  -zmiennoprzecinkową: ");
        secondValue = scanner.nextFloat();

        System.out.println(" Pierwszą liczba całkowitą to "+ firstValue);
        System.out.println("Druga liczba zmienno przecinkowa "+secondValue);

    }
    private static void task4(){

        Scanner scanner2= new Scanner(System.in);

      //  System.out.println("Podaj słowo: ");
      //  String nameValue = scanner2.nextLine();

        System.out.println("Przedstaw się : ");

        System.out.println("Podaj imie : ");
        String name = scanner2.nextLine();
        System.out.println("Podaj nazwisko : ");
        String surname = scanner2.nextLine();
        System.out.println("Podaj wiek : ");
        String age = scanner2.nextLine();
        System.out.println("Podaj wzrost : ");
        String height = scanner2.nextLine();
        System.out.println("Podaj wagę : ");
        String weight = scanner2.nextLine();

        System.out.println("Dzień dobry " +name+' '+surname);
        System.out.println("masz "+age+ " lat" );
        System.out.println("masz "+height+ " wzrostu" );
        System.out.println("oraz ważysz "+weight+ " kg" );



    }
}

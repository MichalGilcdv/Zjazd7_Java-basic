package pl.cdv.test.sobota;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Calc();

    }

    private static void Calc() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwsza wartosc");
        int firstValue = scanner.nextInt();

        System.out.println("podaj pierwsza wartosc");
        int secondValue = scanner.nextInt();

        System.out.println("podaj działanie:");
        scanner.nextLine();
        char operator = scanner.nextLine().charAt(0);

        if (operator == '+') {
            System.out.println("wynik dodawania (+) to :");
            System.out.println(firstValue + secondValue);
        }
        else if (operator == '-') {
            System.out.println("wynik odejmowania (-) to :");
            System.out.println(firstValue - secondValue);
        }
        else if (operator == '*') {
            System.out.println("wynik mnożenia (*) to :");
            System.out.println(firstValue * secondValue);
        }
        else if (operator == '/') {
            System.out.println("wynik dzielenia (/) to :");
            System.out.println(firstValue / secondValue);
        }
        else
            System.out.println("Wprowadzono błędny składnik działania");


        switch (operator){
            case '+':
                System.out.println("wynik dodawania (+) to :");
                System.out.println(firstValue + secondValue);
                break;
            case '-':
                System.out.println("wynik odejmowania (-) to :");
                System.out.println(firstValue - secondValue);
                break;
            case '*':
                System.out.println("wynik mnożenia (*) to :");
                System.out.println(firstValue * secondValue);
                break;
            case '/':
                System.out.println("wynik dzielenia (/) to :");
                System.out.println(firstValue / secondValue);
                break;
            default:
                System.out.println("Wybrana opcja nie jest obsługiwana");
                break;

        }


    }
}

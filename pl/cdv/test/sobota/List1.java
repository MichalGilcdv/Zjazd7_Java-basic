package pl.cdv.test.sobota;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {

    public static void main(String[] args) {

        Lista();

    }

    private static void Lista(){

        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String newname ="";



        while(!newname.equals("-")){
            System.out.println("Podaj imie: ");
            newname = scan.next();
            //answer = scan.next();
            names.add(newname);
        }
        if(newname.equals("-")){

            System.out.println("imie indeks od 0 do"+names.size()+"do wyświetlenia: ");
            int place = scan.nextInt();
            System.out.println(names.get(place));

        }
        else{
            System.out.println("Błędna wartość");

        }
       // while (answer.equals("-"));

        System.out.println(names);


    }
}



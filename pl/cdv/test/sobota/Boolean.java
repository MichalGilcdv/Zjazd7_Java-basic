package pl.cdv.test.sobota;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {

        Check();

    }

    private static void Check(){

        Scanner bool=new Scanner(System.in);

      //  Podana liczba jest większa od 10: (true/false)
        System.out.println("Podaj pierwsza wartość");
        float first = bool.nextFloat();
        boolean moreThan10 = first > 10;
        System.out.println("czy podana liczba " +first+ " jest większa od 10: " +moreThan10);
        boolean moreThan10andsmall100 = first > 10 && first<100;
        System.out.println("czy podana liczba " +first+ " jest większa od 10 i mniejsza od 100: " +moreThan10andsmall100);


      //  Podana liczba jest równa 0: (true/false)

      //  Podana liczba jest mniejsza 50: (true/false)

      //  Podana liczba jest większa bądź równa 20: (true/false)

      //  Podana liczba jest mniejsza bądź równa 30: (true/false)

      //  Podana liczba jest różna od 5: (true/false)

    }
}

package pl.cdv.test.sobota;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {

   // smallTable();
    numberTable();

    }

    private static void smallTable(){

        Scanner tab = new Scanner(System.in);
        System.out.println("Podaj 3 imiona odzielone enterem");
        //tab.nextLine();
        String firstName = tab.nextLine();
        String secondName = tab.nextLine();
        String thirdName = tab.nextLine();
        String[] name = new String[3];
        name[0]=firstName;
        name[1]=secondName;
        name[2]=thirdName;
        for (int i=0; i<name.length;i++) {
            System.out.print(name[i]+" ");
        }
    }

    private static void numberTable(){
        Scanner num = new Scanner(System.in);
        int[] numTab = new int[5];
        int a=0;

        for (int i=0;i<numTab.length;i++) {
            System.out.println("Podaj wartość liczny " + i + " : ");

            //int value = a + 1;
            numTab[i] = num.nextInt();

            //System.out.print(numTab[i]+" ");
        }

        int wynik=0;
        for (int i=0;i<numTab.length;i++){
            System.out.print(numTab[i]+" ");

            wynik += numTab[i];

        }
        System.out.println(wynik);

    }


    
}

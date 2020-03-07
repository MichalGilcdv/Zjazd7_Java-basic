package pl.cdv.test.sobota;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello word \n" +
                "next line" +
                "this same line");
        myFunction();
        task1();
        task2();
    }

    private static void myFunction() {
        System.out.println("My function");
        System.out.println(2 + 2 * 2);
        System.out.println(1 + 2);

    }

    private static void task1() {
        System.out.println("check");
        int age = 22;
        long value = 3000423111l;
        final float pi = 3.1415f;
        double e = 2.714545454545454545454543255454545455645454f;
        boolean isMale = true;
        int weight = 85;
        char letterA = 'a';

        byte i = 35;
        float q = 43.4f;
        char w = 'a';
        boolean f = true;
        double a = 33.;
    }

    private static void task2(){
        String weather1 = "slonecznie jest na dworze";
        String weather2 = "pada deszcz";
        String weather3 = "jest tecza";

        int len_weather = weather1.length();
        int len_weather2 = weather2.length();
        int len_weather3 = weather3.length();
        System.out.println(weather1+' '+weather2+' '+weather3);
        System.out.println(len_weather+len_weather2+len_weather3);

    }
    private static void task3(){
        Scanner scanner =new Scanner()

    }
}

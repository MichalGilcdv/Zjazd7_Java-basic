package pl.cdv.test.sobota;

import java.util.Arrays;
import java.util.Collections;

public class Methods {
    public static void main(String[] args) {
        saySomething("Hello");

        int [] values = {5,0,6,12,44,101,42,12,16,120};

        Integer[] values2 = new Integer[values.length];
        //System.arraycopy(values, 0, values2, 0, values.length);
        Arrays.setAll(values2, i -> values[i]);
        float average = calculateAverage(values);
        System.out.println("Average:" +average);


        Arrays.sort(values);
        Arrays.sort(values2, Collections.reverseOrder());
        System.out.println(Arrays.toString(values));

        System.out.println(Arrays.toString(values2));
        //Collections.reverseOrder()

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("The smallest value: " + values[0]);


    }

    public static void saySomething(String name){

        if (name.length()==0){
            return;
        }

        System.out.println("I say: " + name);
    }


    public static float calculateAverage(int[] numbers){

        int sum =0;
        for (int number:numbers){

            sum += number;
        }
        float average = sum / (float) numbers.length;
        return average;



    }



}

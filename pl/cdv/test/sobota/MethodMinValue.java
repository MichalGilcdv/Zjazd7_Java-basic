package pl.cdv.test.sobota;

import java.util.Arrays;
import java.util.Collections;

public class MethodMinValue {
    public static void main(String[] args) {

        FindMinValue(new int[]{5, 0, 6, 12, 44, 101, 42, 12, 16, 120});

    }

    public static void FindMinValue(int [] values){

        Integer[] values2 = new Integer[values.length];
        Arrays.setAll(values2, i -> values[i]);

        Arrays.sort(values);
        Arrays.sort(values2, Collections.reverseOrder());
        System.out.println(Arrays.toString(values));

        System.out.println(Arrays.toString(values2));


        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("The smallest value: " + values[0]);
    }





}

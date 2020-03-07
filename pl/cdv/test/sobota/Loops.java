package pl.cdv.test.sobota;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {12, 67, 58, 49, 44, 21, 23, 22, 44, 59, 40};
        int licz=0;
        for (int i = 0; i <numbers.length ;) {

            if (numbers[i]%2==0){
                System.out.println(numbers[i]);
                 licz+= 1;

            }
            i++;

        }
        System.out.println(licz);



    }
}

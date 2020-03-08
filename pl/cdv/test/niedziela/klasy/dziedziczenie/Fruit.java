package pl.cdv.test.niedziela.klasy.dziedziczenie;

public class Fruit {

    String fruitName;

    public Fruit(String fruit){

        fruitName =fruit;

    }

    public String getName(){

        if (fruitName !=null){

            return fruitName;
        }
        return null;

    }
}

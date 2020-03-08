package pl.cdv.test.niedziela.klasy.dziedziczenie.getterSetter;

public class Main {

    public static void main(String[] args) {

        Dog pies = new Dog("Tomi", "jamnik");

        System.out.println("Wywołany pies to: " + pies.getName() + " a jego rasa to " + pies.getBreed());
        pies.setName("Nana");
        System.out.println("Nowe imie psa to: " + pies.getName());


    }
}

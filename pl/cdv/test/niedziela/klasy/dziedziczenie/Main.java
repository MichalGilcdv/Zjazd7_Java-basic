package pl.cdv.test.niedziela.klasy.dziedziczenie;

public class Main {
    public static void main(String[] args) {

/*
        Human human = new Human("czlowiek");
        SuperHero superMan = new SuperHero("Superman", "latanie");
        System.out.println("Moc SuperHero: " +superMan.name+" to " + superMan.superPower);

 */
    Fruit apple = new Apple("jablko");
    Fruit pinnapple = new Pinneapple("ananas");

    Fruit[] fruits = {apple,pinnapple};
    for (Fruit fruit:fruits){
        System.out.println(fruit.getName());
    }





    }
}

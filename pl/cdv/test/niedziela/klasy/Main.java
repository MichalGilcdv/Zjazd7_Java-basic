package pl.cdv.test.niedziela.klasy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
/*
        User user = new User("Adam","haslo123","aa@aa.pl",35);
        User user1 = new User("Ala","ma","kota@aa.pl",21);


        System.out.println(user.password);
        System.out.println(user1.login);
        user.password ="nowe haslo";
        System.out.println(user.password);


        User[] users = new User[4];
        users [0] =new User("login11111","aaaaa","www@ww.pl",33);
        users [1] =new User("login22222","bbbb","wwwww@ww.pl",33);
        users [2] =new User("11166611","aaggaaa","weeww@ww.pl",33);

        UserService userService = new UserService(users);
        User user2 =userService.getUserByLogin("login11111");
        System.out.println("Znaleziono usera: "+user2.login);

        List<User> list1 = userService.findUserByLogin2("log");
        System.out.println("znaleziono  userów: " +list1);

*/
        Engine engine1 =new Engine("Diesel");
        Engine engine2 = new Engine("Petrol");

        Car car1 = new Car("Audi","black",engine1);
        Car car2 = new Car("Seat","red",engine2);

        System.out.println("Typ silnika pojazdu1: "+car1.engine.typeEngine);
        System.out.println("Typ silnika pojazdu2: "+car2.engine.typeEngine);


    }
}

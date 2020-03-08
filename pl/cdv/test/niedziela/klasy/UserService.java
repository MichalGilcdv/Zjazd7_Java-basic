package pl.cdv.test.niedziela.klasy;

import java.util.LinkedList;
import java.util.List;

public class UserService {


    private User [] users;

    public UserService(User[] users){
        this.users= users;
    }


    public User getUserByLogin (String login){

        for (User user:users){
            boolean inLogin = user.login.equals(login);
            if (inLogin){
                return user;
            }

        }
        return null;
    }

    public List<User> findUserByLogin2(String login){
        List<User> users = new LinkedList<>();
        for (User user:this.users) {
            boolean isFound = user.login.contains(login);

            if (isFound)
                users.add(user);
              //  return users;
        }
        return null;


    }


}

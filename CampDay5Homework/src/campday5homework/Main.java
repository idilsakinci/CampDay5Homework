package campday5homework;

import campday5homework.business.abstracts.UserService;
import campday5homework.business.concretes.UserManager;
import campday5homework.core.concretes.EmailValidatorManager;
import campday5homework.core.concretes.GoogleServiceAdapter;
import campday5homework.dataAccess.concretes.HibernateUserDao;
import campday5homework.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        
        User user1 = new User(1,"İdil","Sakıncı","idilsakincii6@gmail.com","123456");
        User user2 = new User(2,"Gizem","Deviren","gdeviren@gmail.com","654321");
        User user3 = new User(3,"Engin","Demiroğ","engindemirog@gmail.com","012345");

        UserService userService1 = new UserManager(new GoogleServiceAdapter(), 
                new HibernateUserDao(), new EmailValidatorManager());
        
        userService1.signUp(user1);

        System.out.println(" ");

        userService1.signUp(user1);

        System.out.println(" ");

        userService1.signUp(user2);

        System.out.println(" ");

        userService1.signUp(user3);

        System.out.println(" ");

        userService1.logIn("idilsakincii6@gmail.com", "123456");

    }
}

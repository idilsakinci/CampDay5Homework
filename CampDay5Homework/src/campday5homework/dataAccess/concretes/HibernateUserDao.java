package campday5homework.dataAccess.concretes;

import campday5homework.dataAccess.abstracts.UserDao;
import campday5homework.entities.concretes.User;
import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
        System.out.println("Kullanıcı kaydedildi: " + user.getFirstName() + " " + user.getLastName());
    }


    @Override
    public boolean emailCheck(User user) {

        for (User u : users
        )
            if (u.geteMail() == user.geteMail()) {
                return false;
            }
        return true;
    }


    @Override
    public boolean loginCheck(String email, String password) {
        for (User user : users) {
            if (user.geteMail() == email && user.getPassword() == password)
                return true;
        }
        return false;
    }
}
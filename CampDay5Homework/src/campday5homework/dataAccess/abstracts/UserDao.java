package campday5homework.dataAccess.abstracts;

import campday5homework.entities.concretes.User;

public interface UserDao {
    void add(User user);
    boolean emailCheck(User user);
    boolean loginCheck(String email, String password);
}

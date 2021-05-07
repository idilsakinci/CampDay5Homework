package campday5homework.business.abstracts;

import campday5homework.entities.concretes.User;

public interface UserService {
    
    void signUp(User user);
    void logIn(String email, String password);
    
}

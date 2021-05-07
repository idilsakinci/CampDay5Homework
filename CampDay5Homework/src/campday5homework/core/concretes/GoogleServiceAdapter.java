package campday5homework.core.concretes;

import campday5homework.JGoogle.GoogleService;
import campday5homework.entities.concretes.User;
import campday5homework.core.abstracts.VerificationService;


public class GoogleServiceAdapter implements VerificationService {
    
    @Override
    public boolean valid(User user) {
        GoogleService googleUser = new GoogleService();
        return googleUser.valid();
    }      
            
}

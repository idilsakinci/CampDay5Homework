package campday5homework.core.concretes;

import campday5homework.entities.concretes.User;
import java.util.regex.Pattern;
import campday5homework.core.abstracts.VerificationService;

public class Verification implements VerificationService {
    
    public boolean validEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }


    public boolean validPassword(String password) {
        if (password == null || password.length() < 6) {
            return false;
        }
        return true;
    }


    public boolean validString(String name) {

        if (name == null || name.length() < 2) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean valid(User user) {
        if(!validEmail(user.geteMail())){
            System.out.println("Geçersiz E-mail. Tekrar deneyin.");
            return false;

        }

        if(!validString(user.getFirstName())){
            System.out.println("Geçersiz isim. En az iki karakter girmelisiniz.");
            return false;

        }
        if(!validString(user.getLastName())){
            System.out.println("Geçersiz soyisim. En az iki karakter girmelisiniz.");
            return false;

        }
        if(!validPassword(user.getPassword())){
            System.out.println("Geçersiz şifre. En az altı karakter girmelisiniz.");
            return false;       
        }
        return true;
    }
}

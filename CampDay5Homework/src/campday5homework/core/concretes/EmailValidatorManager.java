package campday5homework.core.concretes;
        
import campday5homework.core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {
    @Override
    public void sendCode() {
        System.out.println("Doğrulama maili yollandı.");
    }
    
}
    


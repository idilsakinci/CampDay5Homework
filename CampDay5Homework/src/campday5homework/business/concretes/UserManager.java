package campday5homework.business.concretes;

import campday5homework.business.abstracts.UserService;
import campday5homework.core.abstracts.ValidatorService;
import campday5homework.dataAccess.abstracts.UserDao;

import campday5homework.entities.concretes.User;
import campday5homework.core.abstracts.VerificationService;

public class UserManager implements UserService {

    VerificationService verificationService;
    UserDao userDao;
    ValidatorService validatorService;

    public UserManager(VerificationService verificationService,
                       UserDao userDaoService, ValidatorService validatorService) {
        this.verificationService = verificationService;
        this.userDao = userDaoService;
        this.validatorService = validatorService;

    }


    @Override
    public void signUp(User user) {
        if (!verificationService.valid(user)) {
            System.out.println("Kullanıcı bilgileri geçerli değil.");
        } else if (!userDao.emailCheck(user)) {
            System.out.println("Sistemde kayıtlı bir E-mail kullandınız.");

        } else {
            userDao.add(user);
            validatorService.sendCode();
            System.out.println("Kayıt yapıldı.");
        }
    }

    @Override
    public void logIn(String email, String password) {
        if (userDao.loginCheck(email, password)) {
            System.out.println("Giriş yapıldı.");
        } else {
            System.out.println("Kullanıcı bilgileri doğru değil.");
        }
    }

}

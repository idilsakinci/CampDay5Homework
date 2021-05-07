package campday5homework.core.abstracts;

import campday5homework.entities.concretes.User;

public interface VerificationService {
    boolean valid(User user);
}

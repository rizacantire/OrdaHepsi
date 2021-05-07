package business.abstracts;

import entities.concretes.User;

public interface UserControlService {
    boolean checkFirstName(User user);
    boolean checkLastName(User user);
    boolean checkEMail(User user);
    boolean checkPassword(User user);
}

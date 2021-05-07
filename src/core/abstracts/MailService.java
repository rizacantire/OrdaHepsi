package core.abstracts;

import entities.concretes.User;

public interface MailService {
    boolean registry(User user);
}

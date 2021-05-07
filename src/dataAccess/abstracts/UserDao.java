package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
    void registry(User user);
    void mailVerification();
    void update(User user);
    void delete(User user);
}

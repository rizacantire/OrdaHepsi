package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void registery(User user);
    void mailVerification(String mail);
    void login(String mail,String pass,User user);
    List<User> getAll();
}

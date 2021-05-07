package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void registry(User user) {
        System.out.println("Hibernate UserDao üye eklendi.");
    }

    @Override
    public void mailVerification() {
        System.out.println("Mail adresi başarıyla doğrulandı.");
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}

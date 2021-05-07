package business.concretes;

import business.abstracts.UserControlService;
import business.abstracts.UserService;
import core.abstracts.MailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private UserControlService userControlService;
    public MailService mailService;

    public UserManager(UserDao userDao,UserControlService userControlService,MailService mailService) {
        super();
        this.userDao = userDao;
        this.userControlService = userControlService;
        this.mailService = mailService;
    }

    @Override
    public void registery(User user) {
        boolean result1 = userControlService.checkFirstName(user);
        boolean result2 = userControlService.checkLastName(user);

        if(!result1 || !result2)
        {
            System.out.println("Bilgiler geçersiz");
        }else{
            userDao.registry(user);
            mailService.registry(user);
            System.out.println("Doğrulama kodunuz : 1234");
        }
    }

    @Override
    public void mailVerification(String code) {
        if(code == "1234"){
            userDao.mailVerification();
        }
        else {
            System.out.println("Mail doğrulanamadı.");
        }
    }

    @Override
    public void login(String mail, String pass,User user) {
        if(mail == user.geteMail() && pass == user.getPassword()){
            System.out.println("Başarılı şekilde sisteme giriş sağlandı");
        }else {
            System.out.println("Bilgiler hatalı. Sisteme giriş yapılamadı");
        }
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}

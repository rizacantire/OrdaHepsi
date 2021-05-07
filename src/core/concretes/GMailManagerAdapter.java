package core.concretes;

import core.abstracts.MailService;
import entities.concretes.User;
import google.GMailManager;

public class GMailManagerAdapter implements MailService {
    @Override
    public boolean registry(User user) {
        GMailManager gMailManager = new GMailManager();
        if(gMailManager.login(user.geteMail(),user.getPassword())){
            System.out.println("Giriş başarılı");
            return true;
        }else{
            System.out.println("Hatalı giriş");
            return false;
        }

    }
}

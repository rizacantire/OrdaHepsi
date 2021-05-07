package core.concretes;

import business.abstracts.UserControlService;
import core.abstracts.MailService;
import entities.concretes.User;

public class MailManager implements MailService
{
    private UserControlService userControlService;

    public MailManager(UserControlService userControlService) {
        this.userControlService = userControlService;
    }

    @Override
    public boolean registry(User user) {
        boolean result3 = userControlService.checkEMail(user);
        boolean result4 = userControlService.checkPassword(user);

        if(!result4 || !result3)
        {

            return false;
        }else{

            System.out.println("Doğrulama Maili gönderildi. Lütfen mail adresinizi kontrol ediniz   .");
            return true;
        }
    }
}

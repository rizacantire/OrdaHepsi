package business.concretes;

import business.abstracts.UserControlService;
import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserControlManager implements UserControlService {
    @Override
    public boolean checkFirstName(User user) {
        int result = user.getFirstName().length();

        if(result < 3){
            System.out.println("Adınız 3 karakterden az olamaz");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean checkLastName(User user) {
        int result = user.getLastName().length();

        if(result < 3){
            System.out.println("Soyadınız 3 karakterden az olamaz");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean checkEMail(User user) {

        Pattern pattern = Pattern.compile("@", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.geteMail());
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;

        } else {
            System.out.println("Hatalı mail adresi.");
            return false;
        }
    }

    @Override
    public boolean checkPassword(User user) {
        int result = user.getPassword().length();

        if(result < 6){
            System.out.println("Parolanız 6 karakterden az olamaz");
            return false;
        }else{
            return true;
        }
    }
}

import business.abstracts.UserService;
import business.concretes.UserControlManager;
import business.concretes.UserManager;
import core.concretes.GMailManagerAdapter;
import core.concretes.MailManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao(),new UserControlManager(),
                new MailManager(new UserControlManager()));

        User user1 = new User(1,"Rıza","Tire","rza@rza.com","123422");
        userService.registery(user1);

        userService.mailVerification("1234");

        userService.login("rza@rza.com","123422",user1);

        UserService userService1 = new UserManager(new HibernateUserDao(),new UserControlManager(),
                new GMailManagerAdapter());
        User user2 = new User(2,"Ali","Tire","abcsd@gmail.com","12342s2");
        userService1.registery(user2);


    }
}

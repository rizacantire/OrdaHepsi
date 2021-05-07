package google;

public class GMailManager {
    private String eMail = "abcd@gmail.com";
    private String passwoord = "123456";

    public boolean login(String mail,String pass){
        if(this.eMail == mail && this.passwoord == pass){
            System.out.println("Gmail adresine başarılı şekilde giriş yaptınız");
            return true;
        }else {
            System.out.println("Gmail bilgileri hatalı.");
            return false;
        }
    }
}

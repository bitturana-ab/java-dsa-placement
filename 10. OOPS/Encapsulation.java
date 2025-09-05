
// wrapping data and function/method in single unit
class Account {

    public String name;
    protected String email;
    private String password;

    public void setPass(String password) {
        this.password = password;
    }

    public String getPass() {
        return this.password;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Account a = new Account();
        a.name = "jd";
        a.email = "ab@jd.com";
        // password is defind as private so wont be access so use setter andgetter
        // a.password = "12378rywg"; 
        a.setPass("53475frfw");
        System.out.println(a.getPass());
    }
}

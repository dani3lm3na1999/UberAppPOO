package Java;

public class User extends Account{
    public User(String name, String document, String email, String password) {
        super(name, document, email, password);
    }

    @Override
    public String toString() {
        return "__User__\n" + super.toString();
    }    
}

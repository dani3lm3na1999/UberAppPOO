package Java;

public class Driver extends Account{

    public Driver(String name, String document, String email, String password) {
        super(name, document, email, password);
    }

    @Override
    public String toString() {
        return "__Driver__\n" + super.toString();
    }    
}

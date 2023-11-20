package Java;

public class Account {
    private Integer id;
    private String name;
    private String document;
    private String email;
    private String password;

    public Account(String name, String document, String email, String password){
        this.name = name;
        this.document = document;
        this.email = email; 
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nDocument: %s\nEmail: %s\n", this.name, this.document, this.email);
    }
}
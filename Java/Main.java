package Java;
public class Main {
    public static void main(String[] args) {
        var usuario1 = new User("Francisco", "052310413", "francisco@example.com", "contraseña");
        var conductor1 = new Driver("Daniel", "051230221", "daniel@example.com", "contraseña");

        System.out.println(usuario1.toString());;
        System.out.println(conductor1.toString());;
    }
}

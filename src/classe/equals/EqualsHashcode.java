package classe.equals;

public class EqualsHashcode {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();

        u1.nome = "Herick Exterkoetter";
        u1.email = "herickherick47@gmail.com";

        Usuario u2 = new Usuario();

        u2.nome = "Herick Exterkoetter";
        u2.email = "herickherick47@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}

package arrays.Lista;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // acessa pelo indice

        System.out.println("tem " + lista.contains(new Usuario("Lia")));

        for(Usuario u: lista) {
            System.out.println(u); // chama o método toString implicitamente
        }

    }
}
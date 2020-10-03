package colections.conjuntoComportado;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {

    public static void main(String[] args) {


        //Set<String> listaAprovados = new HashSet<>(); // ordem aleatoria
        SortedSet<String> listaAprovados = new TreeSet<>(); // ordem aleatoria

        listaAprovados.add("leticya");
        listaAprovados.add("Lucas");
        listaAprovados.add("herick");
        listaAprovados.add("Leticia");

        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }


        Set<Integer> nums = new HashSet<>(); // ordem aleatoria

        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(120);

        for (int n: nums) {
            System.out.println(n);
        }

    }
}

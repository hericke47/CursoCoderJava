package arrays.foreach;

public class Foreach {
    public static void main(String[] args) {

        double [] notas = { 9.9, 8.7, 7.2, 9.4 };

        // Percorre todo o array
        for(double nota: notas) {
            System.out.print(nota + " ");
        }
    }
}

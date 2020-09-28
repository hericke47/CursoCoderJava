package arrays.desafio;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas: ");

        int qntdNotas = scanner.nextInt();

        double [] notas = new double[qntdNotas];

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double total = 0;
        for(double nota: notas) {
            total+= nota;
        }

        double media = total / notas.length;
        System.out.println("A media é: " + media);

        scanner.close();
    }
}

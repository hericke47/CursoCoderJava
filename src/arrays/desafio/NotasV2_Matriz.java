package arrays.desafio;

import java.util.Scanner;

public class NotasV2_Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        System.out.println("Digite a quantidade de notas por aluno: ");
        int qtdNotas = scanner.nextInt();

        double[][] notasTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int a = 0; a < notasTurma.length ; a++) {
            for (int n = 0; n < notasTurma[a].length ; n++) {

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasTurma[a][n] = scanner.nextDouble();
                total += notasTurma[a][n];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é " + media);

        scanner.close();
    }
}

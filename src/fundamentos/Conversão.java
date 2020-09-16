package fundamentos;

import java.util.Scanner;

public class Conversão {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro salário:");
        // caso o usuario colocar virgula ele transforma para ponto
        String valor1 = scanner.next().replace(",", ".");


        System.out.println("Informe o segundo salário:");
        String valor2 = scanner.next().replace(",", ".");

        System.out.println("Informe o terceiro salário:");
        String valor3 = scanner.next().replace(",", ".");

        // parseDouble transforma uma string em um Double
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média dos salários é: " + media);


        scanner.close();
    }
}

package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s  = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner scanner = new Scanner(System.in);

        // next ja tira os espaçoes em branco
        String s2 = scanner.next();

        //trim tira os espaçoes em branco da mensagem enviada
        System.out.println("2".equals(s2.trim()));

        scanner.close();

    }
}

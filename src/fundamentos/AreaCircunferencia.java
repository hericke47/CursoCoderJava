package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {
        // double para casas decimais

        double raio = 3.4;
        // final seria como uma constante
        final double PI = 3.14150;

        double area = PI * raio * raio;

        System.out.println("Area = " + area);
    }
}

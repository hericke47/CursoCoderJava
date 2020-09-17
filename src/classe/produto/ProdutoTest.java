package classe.produto;


public class ProdutoTest {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.desconto = 0.2;
        p1.preco = 2000;

        System.out.println(p1.nome);
    }
}

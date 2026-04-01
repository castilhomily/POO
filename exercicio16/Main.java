package exercicio16;

public class Main {
    public static void main(String[] args) {


        Produto p = new Produto("camiseta", 550);
        System.out.println(p.getPreco());
        p.setPreco(630);
        System.out.println(p.getPreco());

    }
}

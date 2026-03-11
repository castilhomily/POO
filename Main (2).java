package Static;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1 = new SenhaAtendimento("Ester");
        SenhaAtendimento s2 = new SenhaAtendimento("Mariana");
        SenhaAtendimento s3 = new SenhaAtendimento("Emily");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Próxima senha --> " + SenhaAtendimento.controle); //melhor maneira para acessar o static
    }
}

package ExercicioTeste;

import Exercicio02.SenhaAtendimento;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1 = new SenhaAtendimento("emy");
        SenhaAtendimento s2 = new SenhaAtendimento("ester");
        SenhaAtendimento s3 = new SenhaAtendimento("mari");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Proxima senha --> " + SenhaAtendimento.controle);
    }
}

package exercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        double[] alvo;

        System.out.print("Nome --> ");
        paciente.nome = sc.next();
        System.out.print("Idade --> ");
        paciente.idade = sc.nextInt();

        System.out.println("Frequência Máxima: " + paciente.frequenciaMaxima());
        alvo = paciente.fequenciaAlvo();
        System.out.println("Inicio da frequência alvo " + alvo[0]);
        System.out.println("Fim da frequência alvo " + alvo[1]);

    }
}

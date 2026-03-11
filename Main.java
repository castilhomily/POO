package exercicio03;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.totalDeAulas = 40;
        professor.valorDaAula = 220;

        System.out.println(professor.calcularSalario());

    }
}

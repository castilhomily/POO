package exercicio13;

public class Professor {
    String nome;
    int totalDeAulas;
    double valorDaAula;

    public double calcularSalario() {
        double salarioBase;
        double horaAtividade;
        double descansoSemanal;

        salarioBase = totalDeAulas * valorDaAula * 4.5;
        horaAtividade = salarioBase * 5/100;
        descansoSemanal = (salarioBase + horaAtividade) /6;

        return salarioBase + descansoSemanal + horaAtividade;
    }
}

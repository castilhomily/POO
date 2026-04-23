package exercicio22;

public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorDaHora;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHora) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDaHora;
    }
}
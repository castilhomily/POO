package exercicio22;

public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[4];

        empregado[0] = new EmpregadoComissionado(1, "Selmini", 350000, 15);
        empregado[1] = new EmpregadoHorista(2, "Nivaldo", 160, 250);
        empregado[2] = new EmpregadoComissionado(3, "Maria", 500000, 20);
        empregado[3] = new EmpregadoHorista(4, "Ana", 160, 300);

        //for tradicional
        for(int i = 0; i < empregado.length; i++) {
            System.out.println(empregado[i].matricula);
            System.out.println(empregado[i].nome);
            System.out.println();
        }

        //for genérico
        for(Empregado e : empregado) {
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }

    }
}

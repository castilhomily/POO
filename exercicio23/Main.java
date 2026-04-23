package exercicio23;

public class Main {
    public static void main(String[] args) {
        MonitorDeEnergia monitor = new MonitorDeEnergia(5);
        monitor.registrar((double)1.0F);
        monitor.registrar((double)2.0F);
        monitor.registrar((double)3.0F);
        System.out.println(monitor.calcularMedia());
        System.out.println(monitor.calcularMedia(1, 2));
    }
}

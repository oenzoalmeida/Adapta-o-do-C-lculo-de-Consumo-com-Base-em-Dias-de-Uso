
package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Televisao extends Aparelhos {
    protected Televisao(double watts, int horaspDia) {
        super(watts, horaspDia);
 }

    public static Televisao ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência da Televisão (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia da Televisão: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Televisao: ");
        int dias = sc.nextInt();
        Televisao obj = new Televisao(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Televisao: %.2f kWh\n", consumo);
        return obj;
    }
}


package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Liquidificador extends Aparelhos {

    protected Liquidificador(double watts, int horaspDia) {
        super(watts, horaspDia);
    }
    
    public static Liquidificador ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência do Liquidificador (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia do Liquidificador: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Liquidificador: ");
        int dias = sc.nextInt();
        Liquidificador obj = new Liquidificador(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Liquidificador: %.2f kWh\n", consumo);
        return obj;
    }
}

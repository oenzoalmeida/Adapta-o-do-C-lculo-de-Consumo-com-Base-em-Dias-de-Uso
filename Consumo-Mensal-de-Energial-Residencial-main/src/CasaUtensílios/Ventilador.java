
package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Ventilador extends Aparelhos {
    protected Ventilador(double watts, int horaspDia) {
        super(watts, horaspDia);
 }
 
    public static Ventilador ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência do Ventilador (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia do Ventilador: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Ventilador: ");
        int dias = sc.nextInt();
        Ventilador obj = new Ventilador(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Ventilador: %.2f kWh\n", consumo);
        return obj;
    }
}

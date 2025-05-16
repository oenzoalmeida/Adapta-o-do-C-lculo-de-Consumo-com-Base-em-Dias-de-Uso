
package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Computador extends Aparelhos {
    protected Computador(double watts, int horaspDia) {
        super(watts, horaspDia);
 }

        
    public static Computador ConsumoUsuario() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência do computador (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia do computador: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Computador: ");
        int dias = sc.nextInt();
        Computador obj = new Computador(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Computador: %.2f kWh\n", consumo);
        return obj;
    }
}

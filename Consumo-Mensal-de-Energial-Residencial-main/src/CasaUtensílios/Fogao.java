
package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Fogao extends Aparelhos {
    protected Fogao (double watts, int horaspDia) {
        super(watts, horaspDia);
}
        
    public static Fogao ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência do fogão elétrico (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia do fogão elétrico: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Fogao: ");
        int dias = sc.nextInt();
        Fogao obj = new Fogao(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Fogao: %.2f kWh\n", consumo);
        return obj;
    }
}

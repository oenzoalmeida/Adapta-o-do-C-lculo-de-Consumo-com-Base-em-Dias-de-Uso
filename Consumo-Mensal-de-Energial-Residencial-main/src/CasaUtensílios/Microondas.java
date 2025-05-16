
package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Microondas extends Aparelhos {
    protected Microondas(double watts, int horaspDia) {
        super(watts, horaspDia);      
    }
    
    public static Microondas ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência do Microondas (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia do Microondas: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Microondas: ");
        int dias = sc.nextInt();
        Microondas obj = new Microondas(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Microondas: %.2f kWh\n", consumo);
        return obj;
    }
} 


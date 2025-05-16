

package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Airfryer extends Aparelhos {
    protected Airfryer(double watts, int horaspDia) {
        super(watts, horaspDia);
 }
   
        
    public static Airfryer ConsumoUsuario() {
            Scanner sc = new Scanner(System.in);
        System.out.print("Informe a potência da Air fryer (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia da Air fryer: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou a Air fryer: ");
        int dias = sc.nextInt();
        Airfryer af = new Airfryer(watts, horas);
        double consumo = af.calcularConsumo(dias);
        System.out.printf("Consumo mensal da Air fryer: %.2f kWh\n", consumo);
        return af;
    }
}


package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class Chuveiro extends Aparelhos {
    protected Chuveiro(double watts, int horaspDia) {
        super(watts, horaspDia);
 }

        
    public static Chuveiro ConsumoUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a potência do chuveiro (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia do chuveiro: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Chuveiro: ");
        int dias = sc.nextInt();
        Chuveiro obj = new Chuveiro(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Chuveiro: %.2f kWh\n", consumo);
        return obj;
        

    }

}

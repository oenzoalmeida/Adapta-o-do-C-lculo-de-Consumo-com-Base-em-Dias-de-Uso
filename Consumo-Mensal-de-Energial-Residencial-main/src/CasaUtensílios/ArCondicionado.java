
package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


    public class ArCondicionado extends Aparelhos {

        protected ArCondicionado(double watts, int horaspDia) {
            super(watts, horaspDia);
 }

        
        public static ArCondicionado ConsumoUsuario() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe a potência do Ar-Condicionado (watts): ");
            double watts = sc.nextDouble();

            System.out.print("Informe as horas de uso por dia do Ar-Condicionado: ");
            int horas = sc.nextInt();

            System.out.print("Informe quantos dias no mês você usou o(a) ArCondicionado: ");
        int dias = sc.nextInt();
        ArCondicionado obj = new ArCondicionado(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) ArCondicionado: %.2f kWh\n", consumo);
        return obj;


    }

}


package CasaUtensílios;

import CasaAtuação.Aparelhos;
import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class FerroDePassar extends Aparelhos {
    protected FerroDePassar(double watts, int horaspDia) {
        super(watts, horaspDia);
    }

    
    public static FerroDePassar ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência do ferro de passar roupa (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia do ferro de passar roupa: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) FerroDePassar: ");
        int dias = sc.nextInt();
        FerroDePassar obj = new FerroDePassar(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) FerroDePassar: %.2f kWh\n", consumo);
        return obj;
    }
}

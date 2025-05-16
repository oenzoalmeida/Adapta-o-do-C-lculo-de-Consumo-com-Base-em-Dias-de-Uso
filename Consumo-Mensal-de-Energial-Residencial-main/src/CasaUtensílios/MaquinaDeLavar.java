
package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;


public class MaquinaDeLavar extends Aparelhos {
    protected MaquinaDeLavar(double watts, int horaspDia) {
        super(watts, horaspDia);
        
    }
    
    public static MaquinaDeLavar ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência da Máquina de Lavar Roupas (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia da Máquina de Lavar Roupas: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) MaquinaDeLavar: ");
        int dias = sc.nextInt();
        MaquinaDeLavar obj = new MaquinaDeLavar(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) MaquinaDeLavar: %.2f kWh\n", consumo);
        return obj;
    }
}


package CasaUtensílios;

import CasaAtuação.Aparelhos;
import java.util.Scanner;

    public class Geladeira extends Aparelhos {

    protected Geladeira (double watts, int horaspDia){
        super(watts, horaspDia);
    }

    public static Geladeira ConsumoUsuario() {
                Scanner sc = new Scanner (System.in);
        System.out.print("Informe a potência da geladeira (watts): ");
        double watts = sc.nextDouble();

        System.out.print("Informe as horas de uso por dia da geladeira: ");
        int horas = sc.nextInt();

        System.out.print("Informe quantos dias no mês você usou o(a) Geladeira: ");
        int dias = sc.nextInt();
        Geladeira obj = new Geladeira(watts, horas);
        double consumo = obj.calcularConsumo(dias);
        System.out.printf("Consumo mensal do(a) Geladeira: %.2f kWh\n", consumo);
        return obj;
    }
    
}


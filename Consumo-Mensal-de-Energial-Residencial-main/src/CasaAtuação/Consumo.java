package CasaAtuação;
import CasaUtensílios.Fogao;
import CasaUtensílios.Geladeira;
import CasaUtensílios.Ventilador;
import CasaUtensílios.FerroDePassar;
import CasaUtensílios.MaquinaDeLavar;
import CasaUtensílios.Liquidificador;
import CasaUtensílios.Microondas;
import CasaUtensílios.Televisao;
import CasaUtensílios.ArCondicionado;
import CasaUtensílios.Computador;
import CasaUtensílios.Chuveiro;
import CasaUtensílios.Airfryer;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--Calculadora de Gasto Energético Residencial--");
        
        //--Selecionar a bandeira tarifaria
        System.out.print("Informe a bandeira tarifária vigente no mês\n1 - VERDE\n2 - AMARELA\n3 - VERMELHA PATAMAR 1\n4 - VERMELHA PATAMAR 2\nSelecione a opção: ");
        int bandeira = scanner.nextInt();
        double valorBandeira = 0.0;
        String bandeiraTexto = "";
        
        switch (bandeira) {
            case 1:
        	valorBandeira = 0.0;
                bandeiraTexto = "VERDE";
        	break;
            case 2:
        	valorBandeira = 1.88;
                bandeiraTexto = "AMARELA";
        	break;
            case 3:
        	valorBandeira = 4.46;
                bandeiraTexto = "VERMELHA PATAMAR 1";
        	break;
            case 4:
        	valorBandeira = 7.87;
                bandeiraTexto = "VERMELHA PATAMAR 2";
        	break;
            default:
        	System.out.print("Valor inválido!");
                return;
        }
        
        //--Informando a quantidade de cada aparelho
        System.out.println("\n--Informe a quantidade de cada aparelho elétrico em sua casa--");
        System.out.print("Quantidade de geladeiras: ");
        Geladeira[] geladeiras = new Geladeira[scanner.nextInt()];
        System.out.print("Quantidade de air fryers: ");
        Airfryer[] airfryers = new Airfryer[scanner.nextInt()];
        System.out.print("Quantidade de fogões/fornos elétricos: ");
        Fogao[] fogoes = new Fogao[scanner.nextInt()];
        System.out.print("Quantidade de liquidificadores: ");
        Liquidificador[] liquidificadores = new Liquidificador[scanner.nextInt()];
        System.out.print("Quantidade de microondas: ");
        Microondas[] micros = new Microondas[scanner.nextInt()];
        System.out.print("Quantidade de ar-condicionados: ");
        ArCondicionado[] arcondicionados = new ArCondicionado[scanner.nextInt()];
        System.out.print("Quantidade de chuveiros elétricos: ");
        Chuveiro[] chuveiros = new Chuveiro[scanner.nextInt()];
        System.out.print("Quantidade de computadores: ");
        Computador[] computadores = new Computador[scanner.nextInt()];
        System.out.print("Quantidade de ferros de passar roupa: ");
        FerroDePassar[] ferrosdepassar = new FerroDePassar[scanner.nextInt()];
        System.out.print("Quantidade de máquinas de lavar roupa: ");
        MaquinaDeLavar[] maquinasdelavar = new MaquinaDeLavar[scanner.nextInt()];
        System.out.print("Quantidade de televisões: ");
        Televisao[] televisoes = new Televisao[scanner.nextInt()];
        System.out.print("Quantidade de ventiladores: ");
        Ventilador[] ventiladores = new Ventilador[scanner.nextInt()];
        
        //--Loop criando instancias de cada aparelho
        System.out.println("\n--Informe a potência de cada aparelho e seu consumo diário--");
        //1° geladeira:
        if (geladeiras.length > 0) {
            for (int i = 0; i < geladeiras.length; i++) {
                System.out.println("- Vamos verificar a geladeira n°" + (i+1));
                geladeiras[i] = Geladeira.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //2° air fryer:
        if (airfryers.length > 0) {
            for (int i = 0; i < airfryers.length; i++) {
                System.out.println("Vamos verificar a air fryer n°" + (i+1));
                airfryers[i] = Airfryer.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //3° fogao:
        if (fogoes.length > 0) {
            for (int i = 0; i < fogoes.length; i++) {
                System.out.println("Vamos verificar o fogão/forno elétrico n°" + (i+1));
                fogoes[i] = Fogao.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //4° liquidificador:
        if (liquidificadores.length > 0) {
            for (int i = 0; i < liquidificadores.length; i++) {
                System.out.println("Vamos verificar o liquidificador n°" + (i+1));
                liquidificadores[i] = Liquidificador.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //5° microondas:
        if (micros.length > 0) {
            for (int i = 0; i < micros.length; i++) {
                System.out.println("Vamos verificar o microondas n°" + (i+1));
                micros[i] = Microondas.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //6° arcondicionado:
        if (arcondicionados.length > 0) {
            for (int i = 0; i < arcondicionados.length; i++) {
                System.out.println("Vamos verificar o ar-condicionado n°" + (i+1));
                arcondicionados[i] = ArCondicionado.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //7° chuveiro:
        if (chuveiros.length > 0) {
            for (int i = 0; i < chuveiros.length; i++) {
                System.out.println("Vamos verificar o chuveiro n°" + (i+1));
                chuveiros[i] = Chuveiro.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //8° computador:
        if (computadores.length > 0) {
            for (int i = 0; i < computadores.length; i++) {
                System.out.println("Vamos verificar o computador n°" + (i+1));
                computadores[i] = Computador.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //9° ferro de passar:
        if (ferrosdepassar.length > 0) {
            for (int i = 0; i < ferrosdepassar.length; i++) {
                System.out.println("Vamos verificar o ferro de passar roupa n°" + (i+1));
                ferrosdepassar[i] = FerroDePassar.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //10° maquina de lavar:
        if (maquinasdelavar.length > 0) {
            for (int i = 0; i < maquinasdelavar.length; i++) {
                System.out.println("Vamos verificar a maquina de lavar roupa n°" + (i+1));
                maquinasdelavar[i] = MaquinaDeLavar.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //11° televisao:
        if (televisoes.length > 0) {
            for (int i = 0; i < televisoes.length; i++) {
                System.out.println("Vamos verificar a televisão n°" + (i+1));
                televisoes[i] = Televisao.ConsumoUsuario();
            }
        }
        System.out.println();
        
        //12° ventilador:
        if (ventiladores.length > 0) {
            for (int i = 0; i < ventiladores.length; i++) {
                System.out.println("Vamos verificar o ventilador n°" + (i+1));
                ventiladores[i] = Ventilador.ConsumoUsuario();
            }
        }
        System.out.println();
        scanner.close();
        //--Consumo Total de Energia da casa
        double consumoTotal = 0.0;

        for (Airfryer airfryer : airfryers) {
            if (airfryer != null) {
                consumoTotal += airfryer.calcularConsumo();
            }
        }
        
        for (ArCondicionado arcondicionado : arcondicionados) {
            if (arcondicionado != null) {
                consumoTotal += arcondicionado.calcularConsumo();
            }
        }
        
        for (Chuveiro chuveiro : chuveiros) {
            if (chuveiro != null) {
                consumoTotal += chuveiro.calcularConsumo();
            }
        }
        
        for (Computador computador : computadores) {
            if (computador != null) {
                consumoTotal += computador.calcularConsumo();
            }
        }
        
        for (FerroDePassar ferrodepassar : ferrosdepassar) {
            if (ferrodepassar != null) {
                consumoTotal += ferrodepassar.calcularConsumo();
            }
        }
        
        for (Fogao fogao : fogoes) {
            if (fogao != null) {
                consumoTotal += fogao.calcularConsumo();
            }
        }
        
        for (Geladeira geladeira : geladeiras) {
            if (geladeira != null) {
                consumoTotal += geladeira.calcularConsumo();
            }
        }
        
        for (Liquidificador liquidificador : liquidificadores) {
            if (liquidificador != null) {
                consumoTotal += liquidificador.calcularConsumo();
            }
        }
        
        for (MaquinaDeLavar maquinadelavar : maquinasdelavar) {
            if (maquinadelavar != null) {
                consumoTotal += maquinadelavar.calcularConsumo();
            }
        }
        
        for (Microondas microondas : micros) {
            if (microondas != null) {
                consumoTotal += microondas.calcularConsumo();
            }
        }
        
        for (Televisao televisao : televisoes) {
            if (televisao != null) {
                consumoTotal += televisao.calcularConsumo();
            }
        }
        
        for (Ventilador ventilador : ventiladores) {
            if (ventilador != null) {
                consumoTotal += ventilador.calcularConsumo();
            }
        }
        
        //--Verificação de Kwh para classificar a tarifa de energia
        double tarifaKwh = 0.0;
        
        if (consumoTotal < 31.0) {
            tarifaKwh = 0.17225;
        }
        else if (consumoTotal < 101.0) {
            tarifaKwh = 0.29527;
        }
        else if (consumoTotal < 221.0) {
            tarifaKwh = 0.44292;
        }
        else {
            tarifaKwh = 0.49213;
        }
        
        
        //--Verificando se houve gasto acima de 100kWh para calcular a taxa da bandeira
        double kwhConsumidos = 0;
        if (consumoTotal > 100){
            kwhConsumidos = consumoTotal / 100;
        }
        
        //--Imprimindo os dados
        System.out.println("--RESULTADOS--");
        System.out.println("Consumo total de energia da casa: " + String.format("%.2f", consumoTotal) + " kWh.");
        double custoTarifa = consumoTotal * tarifaKwh;
        System.out.println("Valor da conta de energia com base no consumo total: R$ " + String.format("%.2f", custoTarifa) + " (valor da tarifa: " + (tarifaKwh) + ")");
        double custoBandeira = kwhConsumidos * valorBandeira;
        System.out.println("Custo adicional da bandeira tarifária (" + bandeiraTexto + "): R$" + String.format("%.2f", custoBandeira));
        System.out.println("Total da fatura: R$ " + String.format("%.2f",custoTarifa + custoBandeira));
        
        System.out.println();
        System.out.println("*Todos os valores de tarifa levam como base os dados da ANEEL e CPFL do ano de 2025*");
        scanner.close();
    }
    
}
    
        

    


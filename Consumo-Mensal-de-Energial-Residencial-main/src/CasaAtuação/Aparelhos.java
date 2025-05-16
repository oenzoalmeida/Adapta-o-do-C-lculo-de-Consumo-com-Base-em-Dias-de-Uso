
package CasaAtuação;
 
public class Aparelhos {
    private double watts;
    private int horaspDia;
    private double consumo;
 
    protected Aparelhos(double watts, int horaspDia){
        this.watts = watts;
        this.horaspDia = horaspDia;
    }

    protected double getWatts() {
        return watts;
    }

    protected void setWatts(double watts) {
        this.watts = watts;
    }

    protected int getHoraspDia() {
        return horaspDia;
    }

    protected void setHoraspDia(int horaspDia) {
        this.horaspDia = horaspDia;
    }

    protected double getConsumo() {
        return consumo;
    }

    protected void setConsumo(double consumo) {
        this.consumo = consumo;
    }
     
    protected double calcularConsumo(int diasUso){
        return (watts * horaspDia * diasUso)/1000;
    }
     
}  
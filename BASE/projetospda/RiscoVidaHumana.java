 

public class RiscoVidaHumana extends Risco {
    private double fatorLocalizacao;
    private double fatorEstrutura;

    public RiscoVidaHumana(double fatorLocalizacao, double fatorEstrutura) {
        super("RA - Risco à Vida Humana");
        this.fatorLocalizacao = fatorLocalizacao;
        this.fatorEstrutura = fatorEstrutura;
    }

    @Override
    public double calcularRisco() {
        return fatorLocalizacao * fatorEstrutura;
    }
}

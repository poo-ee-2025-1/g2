 

public class RiscoServicoPublico extends Risco {
    private double fatorImportancia;
    private double fatorContinuidade;

    public RiscoServicoPublico(double fatorImportancia, double fatorContinuidade) {
        super("RB - Risco a Serviços Públicos");
        this.fatorImportancia = fatorImportancia;
        this.fatorContinuidade = fatorContinuidade;
    }

    @Override
    public double calcularRisco() {
        return fatorImportancia + fatorContinuidade;
    }
}

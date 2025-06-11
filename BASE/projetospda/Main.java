 

public class Main {
    public static void main(String[] args) {
        Risco ra = new RiscoVidaHumana(1.5, 0.8);
        Risco rb = new RiscoServicoPublico(2.0, 1.2);

        AvaliadorDeRisco avaliador = new AvaliadorDeRisco();
        avaliador.avaliarRisco(ra);
        avaliador.avaliarRisco(rb);
    }
}

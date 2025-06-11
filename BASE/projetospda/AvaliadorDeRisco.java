 

public class AvaliadorDeRisco {
    public void avaliarRisco(Risco risco) {
        System.out.println("Tipo: " + risco.getTipo());
        System.out.println("Valor do risco: " + risco.calcularRisco());
        System.out.println("-----------------------------");
    }
}

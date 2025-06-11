 

public abstract class Risco {
    protected String tipo;

    public Risco(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularRisco();
}

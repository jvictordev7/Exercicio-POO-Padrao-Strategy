public class CalculadoraDesconto {
    private Desconto desconto;

    // Define a estratégia de desconto
    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    // Aplica o desconto ao valor informado
    public double calcular(double valor) {
        if (desconto == null) {
            throw new IllegalStateException("Estratégia de desconto não definida!");
        }
        return desconto.aplicarDesconto(valor);
    }
}

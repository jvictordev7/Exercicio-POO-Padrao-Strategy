public class DescontoClienteComum implements Desconto {
    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal * 0.95; // 5% de desconto
    }
}

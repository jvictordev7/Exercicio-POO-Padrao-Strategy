public class DescontoVip implements Desconto {
    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal * 0.90; // 10% de desconto
    }
}

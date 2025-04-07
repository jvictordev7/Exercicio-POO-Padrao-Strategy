public class DescontoPromocional implements Desconto {
    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal * 0.80; // 20% de desconto
    }
}

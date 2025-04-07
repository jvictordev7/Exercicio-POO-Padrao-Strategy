public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double valorCompra = 100.0;

        // Cliente comum
        calculadora.setDesconto(new DescontoClienteComum());
        System.out.println("Cliente comum: " + calculadora.calcular(valorCompra));

        // Cliente VIP
        calculadora.setDesconto(new DescontoVip());
        System.out.println("Cliente VIP: " + calculadora.calcular(valorCompra));

        // Promoção
        calculadora.setDesconto(new DescontoPromocional());
        System.out.println("Promoção especial: " + calculadora.calcular(valorCompra));
    }
}

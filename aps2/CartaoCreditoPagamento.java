public class CartaoCreditoPagamento implements FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("----------------------------------------");
        System.out.println("Processando pagamento de R$ " + String.format("%.2f", valor) + " com Cartão de Crédito.");
        System.out.println("Comunicando com o gateway de pagamento (Cielo, Stone...)...");
        System.out.println("Pagamento via Cartão de Crédito aprovado!");
        System.out.println("----------------------------------------\n");
    }
}
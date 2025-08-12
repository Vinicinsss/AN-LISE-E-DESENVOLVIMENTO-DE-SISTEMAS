public class BoletoPagamento implements FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + String.format("%.2f", valor) + " com Boleto Bancário.");
        System.out.println("Gerando código de barras e linha digitável...");
        System.out.println("Boleto gerado! Aguardando compensação bancária.");
    }
}
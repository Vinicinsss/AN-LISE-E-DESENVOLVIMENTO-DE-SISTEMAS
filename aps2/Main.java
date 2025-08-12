public class Main {

    public static void main(String[] args) {

        PagamentoFactory factory = new PagamentoFactory();

        double valorDaCompra = 250.50;

        System.out.println("Iniciando processamento de pagamentos...\n");

        FormaPagamento pagamentoPix = factory.criarPagamento("PIX");
        pagamentoPix.processarPagamento(valorDaCompra);


        FormaPagamento pagamentoBoleto = factory.criarPagamento("BOLETO");
        pagamentoBoleto.processarPagamento(99.90);

        
        FormaPagamento pagamentoPayPal = factory.criarPagamento("PAYPAL");
        pagamentoPayPal.processarPagamento(1200.00);


        System.out.println("=== O sistema será atualizado com Cartão de Crédito... ===");
        System.out.println("NENHUMA alteração será necessária nesta classe (Main.java) para isso.");
        System.out.println("Basta criar a classe CartaoCreditoPagamento e atualizar a Fábrica.");
    }
}
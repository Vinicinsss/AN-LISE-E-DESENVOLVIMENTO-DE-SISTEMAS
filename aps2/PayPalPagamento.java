public class PayPalPagamento implements FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + String.format("%.2f", valor) + " com PayPal.");
        System.out.println("Conectando à API do PayPal, validando credenciais...");
        System.out.println("Pagamento via PayPal concluído com sucesso!");
    }
}
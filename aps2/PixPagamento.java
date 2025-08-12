public class PixPagamento implements FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + String.format("%.2f", valor) + " com Pix.");
        System.out.println("Gerando QR Code e Chave Pix Copia e Cola...");
        System.out.println("Pagamento via Pix concluído com sucesso!");
    }
}
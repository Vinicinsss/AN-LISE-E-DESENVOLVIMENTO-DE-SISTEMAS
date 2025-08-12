public class PagamentoFactory {

    public FormaPagamento criarPagamento(String tipoPagamento) {
        if (tipoPagamento == null || tipoPagamento.isEmpty()) {
            return null;
        }

        switch (tipoPagamento.toUpperCase()) {
            case "PAYPAL":
                return new PayPalPagamento();
            case "BOLETO":
                return new BoletoPagamento();
            case "PIX":
                return new PixPagamento();
            case "CARTAOCREDITO": // Nova opção adicionada
                return new CartaoCreditoPagamento();
            default:
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + tipoPagamento);
        }
    }
}
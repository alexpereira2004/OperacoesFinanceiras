package br.com.lunacom.tools.domain.pagamento;

import br.com.lunacom.tools.domain.FormaPagamento;
import br.com.lunacom.tools.domain.Transacao;
import lombok.Data;

@Data
public class PagamentoRequest {
    Transacao transacao;
    FormaPagamento formaPagamento;
}

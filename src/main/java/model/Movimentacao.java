
package model;

import java.time.LocalDate;

/**
 *
 * @author Daniel Lima
 */
public class Movimentacao {
    
    private static int id;
    private float valor;
    private LocalDate data;
    private TipoMovimentacao tipoMovimentacao;

    public Movimentacao(float valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }
    
    public void efetuarMovimentacao(String descricao, String debitoCredito){
        this.tipoMovimentacao = new TipoMovimentacao(descricao,debitoCredito);
    }

    @Override
    public String toString() {
        id++;
        return "    movimentacao (" + (id-1) + "): {\n        "
            + "valor : " + valor + ",\n        " 
            + "data : " + data + ",\n        "
            +"tipoMovimentacao : {\n        "
                + tipoMovimentacao + "\n" 
            + "        }\n    },";
    }

}


package model;

/**
 *
 * @author Daniel Lima
 */
public class TipoMovimentacao {
    
    private String descricao;
    private String debito_credito;

    public TipoMovimentacao(String descricao, String debito_credito) {
        this.descricao = descricao;
        this.debito_credito = debito_credito;
    }

    public TipoMovimentacao() {}
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDebito_credito() {
        return debito_credito;
    }

    public void setDebito_credito(String debito_credito) {
        this.debito_credito = debito_credito;
    }

    @Override
    public String toString() {
        return "    descricao : \"" + descricao + "\",\n            "
                    + "debito_credito : \"" + debito_credito +
                "\"    ";
    }
      
}

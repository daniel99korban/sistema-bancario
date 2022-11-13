
package model;

/**
 *
 * @author Daniel Lima
 */
public class ContaPoupanca extends ContaBancaria{
    private int diasVencimento;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    public int getDiasVencimento() {
        return diasVencimento;
    }

    public void setDiasVencimento(int diasVencimento) {
        this.diasVencimento = diasVencimento;
    }
    
}


package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Lima
 */
public class ContaBancaria{
    
    private String numero;
    private float saldo;
    private ContaBancaria contaInvertimento;
    private List<Movimentacao> movimentacoes;
    // poderá ser uma conta conjunta
    private List<Cartao> clientes;

    public ContaBancaria(String numero) {
        this.numero = numero;
        this.saldo = 0;
        this.movimentacoes = new ArrayList<>();
        this.clientes = new ArrayList<>();
    } 
    
    public void efetuarDeposito(float valor){
        var mvEfetuarDep = new Movimentacao(valor);
        mvEfetuarDep.efetuarMovimentacao("Efetuado deposito no valor: " + valor, "deposito");
        this.movimentacoes.add(mvEfetuarDep);
        this.saldo += valor;
    }
    
    public boolean efetuarSaque(float valor){
        if(valor <= this.saldo){
            var mvEfetuarSaque = new Movimentacao(valor);
            mvEfetuarSaque.efetuarMovimentacao("Efetuado saque no valor: " + valor, "saque");
            this.movimentacoes.add(mvEfetuarSaque);
            this.saldo -= valor;
            return true;
        }else
            return false;
    }
    
    public float emitirSaldo(){
        return this.saldo;
    }
    
    public void emitirExtrato(){
        System.out.println("EXTRATO\nmovimentacoes{");
        for(Movimentacao movimentacao : this.movimentacoes){
            System.out.println(movimentacao);
        }
        System.out.println("}");
    }
    /**
     * 
     * @param idCliente usado para verificar qual cliente fez a solicitaçao
     */
    public void solicitarCartao(int idCliente){
        for(Cartao pessoa : this.clientes){
            if(pessoa.getCliente().getId() == idCliente){
                // condições para aprovar cartão
                if(this.saldo < 0){
                    pessoa.setSituacaoCartao(SituacaoCartao.REPROVADO);
                }else if(this.saldo >= 300){
                    pessoa.setSituacaoCartao(SituacaoCartao.APROVADO);
                }
            }
        }
    }
    // métodos para o cliente
    public void addCliente(Cartao clienteDoCartao){
        clientes.add(clienteDoCartao);
    }
    
    public Cliente getCliente(int id){
        for(Cartao c : clientes){
            if(c.getCliente().getId() == id){
                return c.getCliente();
            }
        }
        System.out.println("Cliente não localizado");
        return null;
    }
    
    public Cartao getCartao(int idCliente){
        for(Cartao c : clientes){
            if(c.getCliente().getId() == idCliente){
                return c;
            }
        }
        System.out.println("Cartão não localizado");
        return null;
    }
    
}

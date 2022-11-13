

package model;

import java.util.Date;
/**
 *
 * @author Daniel Lima
 * Classe associativa para ContaBancaria e Cliente
 */
public class Cartao {
    
    private String numero;
    private Date validade;
    private String senha;
    private SituacaoCartao situacao;
    // dados do cliente 
    private Cliente cliente;
    // dados da conta
    private ContaBancaria contaBancaria;

    public Cartao(String numero, Date validade, Cliente cliente, ContaBancaria contaBancaria) {
        this.numero = numero;
        this.validade = validade;
        this.cliente = cliente;
        this.contaBancaria = contaBancaria;
        this.situacao = SituacaoCartao.AGUARDANDO;
    }

    public boolean validarSenha(String _senha){
        if(senha.equals(_senha)) return true;
        else return false;
    }
    
    public boolean verificarValidade(Date _validade){
        if(this.validade.compareTo(_validade) == 0) return true;
        else return false;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public SituacaoCartao getSituacaoCartao() {
        return situacao;
    }

    public void setSituacaoCartao(SituacaoCartao situacao) {
        this.situacao = situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    
    
    
}

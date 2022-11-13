
package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Agencia;
import model.Cartao;
import model.Cliente;
import model.ContaBancaria;

/**
 *
 * @author Daniel Lima
 */
public class Teste {

     public static void main(String[] args) throws ParseException{
        // cria-se um cliente
        var c1 = new Cliente(1, "Daniel Lima", "R.São Jose B.Piçarreira N.9", "999999");
        // informações de conta bancaria e agencia
        var cb = new ContaBancaria("1");
        var ag = new Agencia("Banco digital", 1);
        ag.addConta(cb);
        // cria-se um cartão
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        Date data = sdf.parse("12/09/2025");
        var cartao1 = new Cartao("323 2312 3231 34", data, c1, cb);
        // adicionar um cliente a essa conta bancaria atravez de uma classe associativa
        cb.addCliente(cartao1);
        cb.efetuarDeposito(405.45f);
        cb.efetuarSaque(5);
        cb.efetuarSaque(300);
        cb.efetuarDeposito(10);
//        cb.emitirExtrato();
        // cliente resolve pedir o cartão
        // obter tods as informações a partir da conta bancaria
        System.out.println("Dados do cliente: " + cb.getCliente(1));
        System.out.println("Situação do cartão antes de o cliente solicita-lo: " + cb.getCartao(1).getSituacaoCartao());
        System.out.println("O Cliente " + c1.getNome() + " solicitou o cartão");
        // satisfazer condições para que o pedido do cartão seja aprovada
        cb.efetuarDeposito(190);// + 110 qe ja tinha la
        cb.solicitarCartao(1);
        System.out.println("Situação atual do cartão: " + cb.getCartao(1).getSituacaoCartao());        
        System.out.println("Saldo atual: " + cb.emitirSaldo());
     }
}

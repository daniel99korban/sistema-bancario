
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Lima 
 */
public class Agencia {
    
    private String nome;
    private int numero;
    private List<ContaBancaria> contas;

    public Agencia(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ArrayList<>();
    }
    
    public void addConta(ContaBancaria conta){
        this.contas.add(conta);
    }
    
}

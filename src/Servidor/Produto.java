/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author rober
 */
public class Produto extends UnicastRemoteObject implements InterfaceProduto{
    
    public String descricao;
    public double preco;
    public int quntidade;
    
    public Produto() throws RemoteException{
        System.out.println("A classe esta Dispónivel remotamente  ");
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getQuntidade() {
        return quntidade;
    }

    @Override
    public void setQuntidade(int quntidade) {
        this.quntidade = quntidade;
    }
}

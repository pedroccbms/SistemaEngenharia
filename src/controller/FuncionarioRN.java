/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Anderson
 */

import Class.Funcionario;
import Class.FuncionarioDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioRN {
    private FuncionarioDao dao;
    
    public FuncionarioRN(){
        this.dao = new FuncionarioDao();
    }
    
    public void inserir (Funcionario cadastrarFuncionario){
        if(cadastrarFuncionario != null && !cadastrarFuncionario.getNomeFuncionario().equals("")){
            dao.inserir(cadastrarFuncionario);
            JOptionPane.showMessageDialog(null, "Funcionario Cadastrado");
        }
        else
            JOptionPane.showMessageDialog(null, "Todos os Campo sao necessarios");
    }
    
    public void excluir(Funcionario cadastrarFuncionario){
        if(cadastrarFuncionario != null && cadastrarFuncionario.getIdFuncionario() > 0){
            dao.excluir(cadastrarFuncionario);
            JOptionPane.showMessageDialog(null, "excluido");
        }
        else{
            JOptionPane.showMessageDialog(null, "Informe um autro valido a ser excluido");
        }
    }
    public void alterar(Funcionario cadastrarFuncionario){
        if(cadastrarFuncionario != null && !cadastrarFuncionario.getNomeFuncionario().equals(""))
            dao.alterar(cadastrarFuncionario);
        else{
            JOptionPane.showMessageDialog(null, "Nao alterado");
        }
    }
    public List<Funcionario> listar() throws SQLException{
        return dao.listar();
    }   
}


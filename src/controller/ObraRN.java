/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Class.Obra;
import Class.ObraDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class ObraRN {
    private ObraDao dao;
    
    public ObraRN(){
        this.dao = new ObraDao();
    }
    
    public void inserir (Obra cadastrarObra){
        if(cadastrarObra != null && !cadastrarObra.getNomeObra().equals("")){
            dao.inserir(cadastrarObra);
            JOptionPane.showMessageDialog(null, "Obra Cadastrada");
        }
        else
            JOptionPane.showMessageDialog(null, "Todos os Campo sao necessarios");
    }
    public void excluir(Obra cadastrarObra, int id){
        if(cadastrarObra != null && cadastrarObra.getIdObra() == id)
            dao.excluir(cadastrarObra, id);
        else{
            JOptionPane.showMessageDialog(null, "Informe um autro valido a ser excluido");
        }
    }
    public void alterar(Obra cadastrarObra){
        if(cadastrarObra != null && !cadastrarObra.getNomeObra().equals(""))
            dao.alterar(cadastrarObra);
        else{
            JOptionPane.showMessageDialog(null, "Nao alterado");
        }
    }
    public List<Obra> listar() throws SQLException{
        return dao.listar();
    }   
}

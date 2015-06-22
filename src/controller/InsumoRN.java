/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Class.Insumo;
import Class.InsumoDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Family
 */
public class InsumoRN {
    private InsumoDao dao;
    
    public InsumoRN(){
        this.dao = new InsumoDao();
    }
    
    public void inserir (Insumo cadastrarInsumo, int idObra){
        if(cadastrarInsumo != null){
            dao.inserir(cadastrarInsumo, idObra);
            JOptionPane.showMessageDialog(null, "Insumo Cadastrado");
        }
        else
            JOptionPane.showMessageDialog(null, "Todos os Campo sao necessarios");
    }
    
    public void excluir(Insumo cadastrarInsumo){
        if(cadastrarInsumo != null && cadastrarInsumo.getIdInsumo()> 0){
            dao.excluir(cadastrarInsumo);
            JOptionPane.showMessageDialog(null, "excluido");
        }
        else{
            JOptionPane.showMessageDialog(null, "Informe um autro valido a ser excluido");
        }
    }
    /*
    public void alterar(Obra cadastrarObra){
        if(cadastrarObra != null && !cadastrarObra.getNomeObra().equals(""))
            dao.alterar(cadastrarObra);
        else{
            JOptionPane.showMessageDialog(null, "Nao alterado");
        }
    }
  
    public Obra consultar(int id) throws SQLException {
        if(id > 0)
           return dao.consulta(id);
        else
            return null;
    }
    */
    public List<Insumo> listar(){
        return dao.listar();
    }   
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario.fachada;

/**
 *
 * @author Anderson
 */

import Class.Funcionario;
import controller.FuncionarioRN;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioFachada {
    private FuncionarioRN funcionarioRN;
    
    public FuncionarioFachada(){
        this.funcionarioRN = new FuncionarioRN();
    }
    
    public void inserir(Funcionario cadastrarFuncionario){
        this.funcionarioRN.inserir(cadastrarFuncionario);
    }
    public void excluir(Funcionario cadastrarFuncionario, int id){
        this.funcionarioRN.excluir(cadastrarFuncionario, id);
    }
    public void alterar(Funcionario cadastrarFuncionario){
        this.funcionarioRN.alterar(cadastrarFuncionario);
    }
    public List<Funcionario>listar() throws SQLException{
        return this.funcionarioRN.listar();
    }
}

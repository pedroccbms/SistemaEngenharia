/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obra.fachada;

import Class.Obra;
import controller.ObraRN;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class ObraFachada {
    
    private ObraRN obraRN;
    
    public ObraFachada(){
        this.obraRN = new ObraRN();
    }
    
    public void inserir(Obra cadastrarObra){
        this.obraRN.inserir(cadastrarObra);
    }
    public void excluir(Obra cadastrarObra, int id){
        this.obraRN.excluir(cadastrarObra, id);
    }
    public void alterar(Obra cadastrarObra){
        this.obraRN.alterar(cadastrarObra);
    }
    public List<Obra>listar() throws SQLException{
        return this.obraRN.listar();
    }
}

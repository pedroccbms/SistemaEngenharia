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
    public void excluir(Obra cadastrarObra){
        this.obraRN.excluir(cadastrarObra);
    }
    public void alterar(Obra cadastrarObra){
        this.obraRN.alterar(cadastrarObra);
    }
    public Obra consultar(int id) throws SQLException{
        return this.obraRN.consultar(id);
    }
    public int consultarIdPorNome(String nomeObra) throws SQLException{
        return this.obraRN.consultarIdPorNome(nomeObra);
    }
    public List<Obra>listar(){
        return this.obraRN.listar();
    }
}

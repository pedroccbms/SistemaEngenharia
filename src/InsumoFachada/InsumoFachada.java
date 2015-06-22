/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsumoFachada;

import Class.Insumo;
import controller.InsumoRN;
import java.util.List;

/**
 *
 * @author Family
 */
public class InsumoFachada {
        private InsumoRN insumoRN;
    
    public InsumoFachada(){
        this.insumoRN = new InsumoRN();
    }
    
    public void inserir(Insumo cadastrarInsumo, int idObra){
        
        this.insumoRN.inserir(cadastrarInsumo,  idObra);
    }
    /*
    public void excluir(Insumo cadastrarInsumo){
        this.insumoRN.excluir(cadastrarInsumo);
    }
    public void alterar(Insumo cadastrarInsumo){
        this.insumoRN.alterar(cadastrarInsumo);
    }
   
    public Obra consultar(int id) throws SQLException{
        return this.insumoRN.consultar(id);
    }
    */
    public List<Insumo>listar(){
        return this.insumoRN.listar();
    }
     
}

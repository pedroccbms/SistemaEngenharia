/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pedro
 */
public class ModeloTabela extends AbstractTableModel{
    
    private List<Obra> obrasCadastradas;
    
    public ModeloTabela(List<Obra> obrasCadastradas){
        this.obrasCadastradas = obrasCadastradas;
    }
    @Override
    public int getRowCount() {
        return this.obrasCadastradas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(final int column){
        switch(column){
            case 0:
                return "id_obra";
            case 1:
                return "nome_obra";
            case 2:
                return "data_inicio";
            case 3: 
                return "data_termino";
            case 4: 
                return "tipo_obra";
            default:
                return "?";                
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Obra cadastradas = obrasCadastradas.get(rowIndex);
        switch(columnIndex){
            case 0:
                return cadastradas.getIdObra();
            case 1:
                return cadastradas.getNomeObra();
            case 2:
                return cadastradas.getDataInicio();
            case 3:
                return cadastradas.getDataTermino();
            case 4:
                 return cadastradas.getTipoObra();    
            default:
                return null;
        }
    }
    
    public void deletarLinha(int linha){
        obrasCadastradas.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    public Obra getObra(int rowIndex){
        Obra obra = obrasCadastradas.get(rowIndex);
        return obra;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int collumnIndex){
        return false;
    }
    
    
}

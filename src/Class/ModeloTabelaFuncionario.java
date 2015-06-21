/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Anderson
 */
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaFuncionario extends AbstractTableModel{
    private List<Funcionario> funcionariosCadastrados;
    
    public ModeloTabelaFuncionario(List<Funcionario> funcionariosCadastrados){
        this.funcionariosCadastrados = funcionariosCadastrados;
    }
    @Override
    public int getRowCount() {
        return this.funcionariosCadastrados.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(final int column){
        switch(column){
            case 0:
                return "nome";
            case 1:
                return "cpf";
            case 3:
                return "rg";
            case 4: 
                return "data_nascimento";
            case 5: 
                return "telefone";
            default:
                return "?";                
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario cadastrados = funcionariosCadastrados.get(rowIndex);
        switch(columnIndex){
            case 0:
                return cadastrados.getIdFuncionario();
            case 1:
                return cadastrados.getNomeFuncionario();
            case 2:
                return cadastrados.getCPF();
            case 3:
                return cadastrados.getRG();
            case 4:
                return cadastrados.getDataNascimento();
            case 5:
                return cadastrados.getTelefone();    
            default:
                return null;
        }
    }
    public Funcionario getFuncionario(int rowIndex){
        Funcionario funcionario = funcionariosCadastrados.get(rowIndex);
        return funcionario;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int collumnIndex){
        return false;
    }
    
}

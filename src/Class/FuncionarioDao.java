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

import dB.*;
import forms.CadastrarFuncionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionarioDao {
     private ConectaBanco connection = null;
     private PreparedStatement pst;
     
     public void inserir(Funcionario cadastrarFuncionario){ 
        try {
            connection = new ConectaBanco();
            connection.conexao();
            pst = connection.conn.prepareStatement("Insert into funcionario (nome_funcionario, cpf, telefone, rg, data_nascimento, cargo)values(?,?,?,?,?,?)");
            this.pst.setString(1, cadastrarFuncionario.getNomeFuncionario());
            this.pst.setString(2, cadastrarFuncionario.getCPF());
            this.pst.setString(3, cadastrarFuncionario.getTelefone());
            this.pst.setString(4, cadastrarFuncionario.getRG());
            this.pst.setString(5, cadastrarFuncionario.getDataNascimento());
            this.pst.setString(6, cadastrarFuncionario.getCargo());
            this.pst.executeUpdate();
            this.pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void excluir(Funcionario cadastrarFuncionario) {
        String Sql = "DELETE FROM funcionario WHERE id_funcionario = ?";

        try {
            this.connection = new ConectaBanco();
            this.connection.conexao();
            this.pst = this.connection.conn.prepareStatement(Sql);
            this.pst.setInt(1, cadastrarFuncionario.getIdFuncionario());
            this.pst.execute();
            this.pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.connection.conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void alterar(Funcionario cadastrarFuncionario) {
        String sql = "UPDATE obra SET nome_funcionario = ?, cpf = ?, telefone = ?, "
                + " = ?, rg = ?, data_nascimento = ?, cargo = ? WHERE id_obra = ?";
        try {
            this.connection = new ConectaBanco();
            this.connection.conexao();
            this.pst = this.connection.conn.prepareStatement(sql);
             this.pst.setString(1, cadastrarFuncionario.getNomeFuncionario());
            this.pst.setString(2, cadastrarFuncionario.getCPF());
            this.pst.setString(3, cadastrarFuncionario.getTelefone());
            this.pst.setString(4, cadastrarFuncionario.getRG());
            this.pst.setString(5, cadastrarFuncionario.getDataNascimento());
            this.pst.setString(6, cadastrarFuncionario.getCargo()); 
            this.pst.setInt(7, cadastrarFuncionario.getIdFuncionario()); 
            this.pst.execute();
            this.pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.connection.conn.close();
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        }
    }

    public List<Funcionario> listar() {
        String sql = "SELECT * FROM funcionario";
        ResultSet rs = null;
        List<Funcionario> listarFuncionario = new ArrayList<Funcionario>();
        Funcionario funcionarioCadastrados = null;
        try {
            this.connection = new ConectaBanco();
            this.connection.conexao();
            PreparedStatement prepared = this.connection.conn.prepareStatement(sql);
            rs = prepared.executeQuery();
            while (rs.next()) {
                funcionarioCadastrados = new Funcionario();
                funcionarioCadastrados.setIdFuncionario(rs.getInt("id_funcionario"));
                funcionarioCadastrados.setNomeFuncionario(rs.getString("nome_funcionario"));
                funcionarioCadastrados.setCPF(rs.getString("cpf"));
                funcionarioCadastrados.setTelefone(rs.getString("Telefone"));
                funcionarioCadastrados.setRG(rs.getString("RG"));
                funcionarioCadastrados.setDataNascimento(rs.getString("data_nascimento"));
                funcionarioCadastrados.setCargo(rs.getString("cargo"));

                listarFuncionario.add(funcionarioCadastrados);
            }
//            this.connection.stm.close();
            rs.close();
            
            return listarFuncionario;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                this.connection.conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}   
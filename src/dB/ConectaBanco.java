/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maxximus
 */
public class ConectaBanco {
    
    public Statement stm;//realizar pesquisas do bd
    public ResultSet rs;//responsável por armazernar o resultado de uma pesquisa passada para stm
    private String driver = "org.postgresql.Driver"; //responsavel por identificar o serviço do bd
    //private String caminho = "jdbc:postgresql://localhost:5432/SistemaEngenharia";//responsavel por setar o local do bd
    private String caminho = "jdbc:postgresql://localhost:5432/postgres";//responsavel por setar o local do bd
    private String usuario = "postgres";
    private String senha = "1234";
    public Connection conn;//responsavel por realizar a conexao com o bd
    
    public void conexao(){//metodo para conectar no bd
        System.setProperty("jdbc.Drivers", driver);
        try {//tentativa inicial
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexao com o bd
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");//imprime a caixa de texto
        } catch (SQLException ex) {//excessao
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro:" + ex.getMessage());
        }
    }
    public void desconecta(){//metodo para desconectar a conexão
        try {
            conn.close();//fexa a conexão
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão!\n Erro:" + ex.getMessage());
        }
    }
    
}

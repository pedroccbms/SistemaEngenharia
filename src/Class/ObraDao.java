/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import dB.*;
import forms.FormularioObrasSobrado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class ObraDao {

    private ConectaBanco connection = null;
    private PreparedStatement pst;
    
    public void inserir(Obra cadastarObra) {
        try {
            connection = new ConectaBanco();
            connection.conexao();
            pst = connection.conn.prepareStatement("Insert into obra (nome_obra, data_inicio, data_termino, tipo_obra, metro_quadrado_obra, altura_obra)values(?,?,?,?,?,?)");
            this.pst.setString(1, cadastarObra.getNomeObra());
            this.pst.setString(2, cadastarObra.getDataInicio());
            this.pst.setString(3, cadastarObra.getDataTermino());
            this.pst.setInt(4, cadastarObra.getTipoObra());
            this.pst.setDouble(5, cadastarObra.getMetroQuadradoObra());
            this.pst.setDouble(6, cadastarObra.getAlturaObra());
            this.pst.executeUpdate();
            this.pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioObrasSobrado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void excluir(Obra cadastrarObra, int id) {
        String Sql = "DELETE FROM obra WHERE id_obra = ?";

        try {
            this.connection = new ConectaBanco();
            this.connection.conexao();
            this.pst = this.connection.conn.prepareStatement(Sql);
            this.pst.setInt(1, id);
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

    public void alterar(Obra cadastrarObra) {
        String SQL = "UPDATE obra SET nome_obra = ?, data_inicio = ?, data_termino = ?, "
                + "tipo_obra = ?, metro_quadrado_obra = ?, altura_obra = ? WHERE id_obra = ?";
        try {
            this.connection = new ConectaBanco();
            this.pst = this.connection.conn.prepareStatement(SQL);
            this.pst.setString(1, cadastrarObra.getNomeObra());
            this.pst.setString(2, cadastrarObra.getDataInicio());
            this.pst.setString(3, cadastrarObra.getDataTermino());
            this.pst.setInt(4, cadastrarObra.getTipoObra());
            this.pst.setDouble(5, cadastrarObra.getMetroQuadradoObra());
            this.pst.setDouble(6, cadastrarObra.getAlturaObra());
            this.pst.setInt(7, cadastrarObra.getIdObra());

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

    public List<Obra> listar() throws SQLException{
        String sql = "select * from obra";
        ResultSet rs = null;
        List<Obra> listarObra = new ArrayList<Obra>();
        Obra obrasCadastradas = null;
        try {
            this.connection = new ConectaBanco();
            this.connection.conexao();
            PreparedStatement prepared = this.connection.conn.prepareStatement(sql);
            rs = prepared.executeQuery();
            
            while (rs.next()) {
                obrasCadastradas = new Obra();
                obrasCadastradas.setIdObra(rs.getInt("id_obra"));
                obrasCadastradas.setNomeObra(rs.getString("nome_obra"));
                obrasCadastradas.setDataInicio(rs.getString("data_inicio"));
                obrasCadastradas.setDataTermino(rs.getString("data_termino"));
                obrasCadastradas.setTipoObra(rs.getInt("tipo_obra"));
                obrasCadastradas.setMetroQuadradoObra(rs.getInt("metro_quadrado_obra"));
                obrasCadastradas.setAlturaObra(rs.getInt("altura_Obra"));

                listarObra.add(obrasCadastradas);
            }
            //this.connection.stm.close();
            rs.close();
            
            return listarObra;
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

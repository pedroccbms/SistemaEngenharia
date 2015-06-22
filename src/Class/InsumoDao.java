/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import dB.ConectaBanco;
import forms.FormularioObrasCasa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Family
 */
public class InsumoDao {

    private ConectaBanco connection = null;
    private PreparedStatement pst;

    public void inserir(Insumo insumo, int idObra) {
        try {
            connection = new ConectaBanco();
            connection.conexao();
            pst = connection.conn.prepareStatement("Insert into insumo(ml_baldrame,tipo_de_tijolo,metro_linear_pilares,metro_quadrado_tijolo,metro_quadrado_lage,metro_quadrado_contrapiso,metro_quadrado_alvenaria,metro_quadrado_reboco,metro_quadrado_cobertura,quantidade_tijolo,metro_quadrado_piso,quantidade_lata_tinta,metro_cubico_concreto,metro_cubico_broca,metro_cubico_argamassa,sacos_cimento,metro_cubico_areia,metro_cubico_pedra,quantidade_telha,saco_cal,id_obra)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            //pst = connection.conn.prepareStatement(Insert into obra (nome_obra, data_inicio, data_termino, tipo_obra, metro_quadrado_obra, altura_obra)values(?,?,?,?,?,?));
            this.pst.setDouble(1, insumo.getMetragemLinearVigaBaldrame());
            this.pst.setInt(2, insumo.getTipoTijolo());
            this.pst.setDouble(3, insumo.getMetroLinearPilares());
            this.pst.setDouble(4, insumo.getMetroQuadradoTijolo());
            this.pst.setDouble(5, insumo.getMetroQuadradoLage());
            this.pst.setDouble(6, insumo.getMetroQuadradoContrapiso());
            this.pst.setDouble(7, insumo.getMetroQuadradoAlvenaria());
            this.pst.setDouble(8, insumo.getMetroQuadradoReboco());
            this.pst.setDouble(9, insumo.getMetroQuadradoCobertura());
            this.pst.setDouble(10, insumo.getQuantidadeTijolo());
            this.pst.setDouble(11, insumo.getMetroQuadradoPiso());
            this.pst.setDouble(12, insumo.getQuantidadeLataTinta());
            this.pst.setDouble(13, insumo.getMetroCubicoConcreto());
            this.pst.setDouble(14, insumo.getMetroCubicoBroca());
            this.pst.setDouble(15, insumo.getMetroCubicoArgamassa());
            this.pst.setDouble(16, insumo.getSacosCimento());
            this.pst.setDouble(17, insumo.getMetroCubicoAreia());
            this.pst.setDouble(18, insumo.getMetroCubicoPedra());
            this.pst.setDouble(19, insumo.getQuantidadeTelha());
            this.pst.setDouble(20, insumo.getSacoCal());
            this.pst.setInt(21, idObra);
            this.pst.executeUpdate();
            this.pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioObrasCasa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void excluir(Insumo cadastrarInsumo) {
        String Sql ="DELETE FROM insumo WHERE id_insumo = ?";

        try {
            this.connection = new ConectaBanco();
            this.connection.conexao();
            this.pst = this.connection.conn.prepareStatement(Sql);
            this.pst.setInt(1, cadastrarInsumo.getIdInsumo());
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

    public List<Insumo> listar(){
        String sql = "select * from insumo";
        ResultSet rs = null;
        List<Insumo> listarInsumo = new ArrayList<Insumo>();
        Insumo insumosCadastrados = null;
        try {
            this.connection = new ConectaBanco();
            this.connection.conexao();
            PreparedStatement prepared = this.connection.conn.prepareStatement(sql);
            rs = prepared.executeQuery();
            
            while (rs.next()) {
            insumosCadastrados = new Insumo();
            
            insumosCadastrados.setMetragemLinearVigaBaldrame(rs.getDouble("ml_baldrame"));
            insumosCadastrados.setTipoTijolo(rs.getInt("tipo_de_tijolo"));
            insumosCadastrados.setMetroLinearPilares(rs.getDouble("metro_linear_pilares"));
            insumosCadastrados.setMetroQuadradoTijolo(rs.getDouble("metro_quadrado_tijolo"));
            insumosCadastrados.setMetroQuadradoLage(rs.getDouble("metro_quadrado_lage"));
            insumosCadastrados.setMetroQuadradoContrapiso(rs.getDouble("metro_quadrado_contrapiso"));
            insumosCadastrados.setMetroQuadradoAlvenaria(rs.getDouble("metro_quadrado_alvenaria"));
            insumosCadastrados.setMetroQuadradoReboco(rs.getDouble("metro_quadrado_reboco"));
            insumosCadastrados.setMetroQuadradoCobertura(rs.getDouble("metro_quadrado_cobertura"));
            insumosCadastrados.setQuantidadeTijolo(rs.getDouble("quantidade_tijolo"));
            insumosCadastrados.setMetroQuadradoPiso(rs.getDouble("metro_quadrado_piso"));
            insumosCadastrados.setQuantidadeLataTinta(rs.getDouble("quantidade_lata_tinta"));
            insumosCadastrados.setMetroCubicoConcreto(rs.getDouble("metro_cubico_concreto"));
            insumosCadastrados.setMetroCubicoBroca(rs.getDouble("metro_cubico_broca"));
            insumosCadastrados.setMetroCubicoArgamassa(rs.getDouble("metro_cubico_argamassa"));
            insumosCadastrados.setSacosCimento(rs.getDouble("sacos_cimento"));
            insumosCadastrados.setMetroCubicoAreia(rs.getDouble("metro_cubico_areia"));
            insumosCadastrados.setMetroCubicoPedra(rs.getDouble("metro_cubico_pedra"));
            insumosCadastrados.setQuantidadeTelha(rs.getDouble("quantidade_telha"));
            insumosCadastrados.setSacoCal(rs.getDouble("saco_cal"));
            Obra obra = new Obra();
            obra.fachada.ObraFachada obraFN = new obra.fachada.ObraFachada();
            obra = obraFN.consultar(rs.getInt("id_obra"));
            insumosCadastrados.setObra(obra);
                
              
                listarInsumo.add(insumosCadastrados);
            }
            //this.connection.stm.close();
            rs.close();
            
            return listarInsumo;
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

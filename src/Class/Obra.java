package Class;

import dB.ConectaBanco;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maxximus
 */
public class Obra {

	private String nomeObra;
	private int idObra;
	private String dataInicio;
	private String dataTermino;
	private int tipoObra;
	private double metroQuadradoObra;
        private double alturaObra;

    /**
     *
     * @param obra
     * @param metragemLinearVigaBaldrame
     * @param tipoTijolo
     * @param metroLinearPilares
     */
    public static void Calcular(Obra obra,
			double metragemLinearVigaBaldrame, int tipoTijolo, double metroLinearPilares) {
                        
                Insumo insumo = new Insumo();
                insumo.setTipoTijolo(tipoTijolo);
                insumo.setMetroLinearPilares(metroLinearPilares);
                insumo.setMetragemLinearVigaBaldrame(metragemLinearVigaBaldrame);
                insumo.setMetroQuadradoLage(obra.getMetroQuadradoObra());
                insumo.setMetroQuadradoContrapiso(obra.getMetroQuadradoObra());
                insumo.setMetroQuadradoCobertura(obra.getMetroQuadradoObra());
                insumo.setMetroQuadradoPiso(obra.getMetroQuadradoObra());
  
		if (obra.getTipoObra() == 1) {
			// é casa térrea
			obra.setAlturaObra(3) ;
		} else if (obra.getTipoObra() == 2) {
			// é sobrado
			obra.setAlturaObra(6) ;
		}
		if (obra.getTipoObra() == 3) {
			// é salão
			obra.setAlturaObra(8);
		}
		if (insumo.getTipoTijolo() == 1) {
			// é tijolo 10 furos
			insumo.setMetroQuadradoTijolo(0.02205);
		} else if (insumo.getTipoTijolo() == 2) {
			// é tijolo 8 furos
			insumo.setMetroQuadradoTijolo(0.038025);
		}
		if (insumo.getTipoTijolo() == 3) {
			// é tijolo a vista
			insumo.setMetroQuadradoTijolo(0.02);
		}

		insumo.setMetroQuadradoAlvenaria( insumo.getMetragemLinearVigaBaldrame() * obra.getAlturaObra() );
		insumo.setMetroQuadradoReboco((insumo.getMetroQuadradoAlvenaria() * 0.03) * 2);
		insumo.setQuantidadeTijolo (insumo.getMetroQuadradoAlvenaria() / insumo.getMetroQuadradoTijolo());
		insumo.setQuantidadeLataTinta ((insumo.getMetroQuadradoReboco()+ insumo.getMetroQuadradoLage()) / 80);
		insumo.setMetroCubicoBroca ( 3.14 * (0.30 * 0.30) * obra.getAlturaObra());
		insumo.setMetroCubicoConcreto ( (insumo.getMetroCubicoBroca()+insumo.getMetragemLinearVigaBaldrame() * 3 + insumo.getMetroQuadradoContrapiso())
				* 0.02 * insumo.getMetroLinearPilares() * 0.30 + insumo.getMetroQuadradoLage() * 0.20 );
		insumo.setMetroCubicoArgamassa ( (insumo.getMetroQuadradoContrapiso() * 0.015
				+ ((insumo.getQuantidadeTijolo() * 0.2 * 0.9) * 2) + insumo.getMetroQuadradoReboco() * 0.015) );
		insumo.setSacosCimento ( insumo.getMetroCubicoArgamassa() * 4 + insumo.getMetroCubicoConcreto() * 6);
		insumo.setMetroCubicoAreia ( insumo.getMetroCubicoArgamassa() * 0.95
				+ insumo.getMetroCubicoConcreto() * 0.75);
		insumo.setMetroCubicoPedra ( insumo.getMetroCubicoConcreto() * 0.65);
		insumo.setSacoCal ( insumo.getMetroCubicoArgamassa() * 4);
		insumo.setQuantidadeTelha ( insumo.getMetroQuadradoCobertura() * 17);
		//inserindo no banco
		 ConectaBanco conecta = new ConectaBanco();
                 conecta.conexao();
		try { 
                //inserir em obra
                 PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO obra VALUES('nome_obra','data_inicio','data_termino','tipo_obra','metro_quadrado','altura_obra')");
                 pst.setString(1, obra.getNomeObra());
                 //pst.setDate(2, obra.getDataInicio());
                 //pst.setDate(3, obra.getDataTermino());
                 pst.setInt(4, obra.getTipoObra());
                 pst.setDouble(5, obra.getMetroQuadradoObra());
                 pst.setDouble(6, obra.getAlturaObra());
                 pst.executeUpdate();
                //inserir em insumo
                  pst = conecta.conn.prepareStatement("INSERT INTO obra VALUES('metragem_linear_viga_baldrame','tipo_tijolo','metro_linear_pilares',"
                          + "'metro_quadrado_tijolo','metro_quadrado_lage','metro_quadrado_contrapiso',"
				+ "'metro_quadrado_alvenaria','metro_quadrado_reboco','metro_quadrado_cobertura','quantidade_tijolo',"
				+ "'metro_quadrado_piso','quantidade_lata_tinta','metro_cubico_concreto','metro_cubico_broca','metro_cubico_argamassa',"
				+ "'sacos_cimento','metro_cubico_areia','metro_cubico_pedra','quantidade_telha','saco_cal','id_obra')");
                 pst.setDouble(1, insumo.getMetragemLinearVigaBaldrame());
                 pst.setInt(2, insumo.getTipoTijolo());
                 pst.setDouble(3, insumo.getMetroLinearPilares()); 
                 pst.setDouble(4, insumo.getMetroQuadradoTijolo());
                 pst.setDouble(5, insumo.getMetroQuadradoLage());
                 pst.setDouble(6, insumo.getMetroQuadradoContrapiso());
                 pst.setDouble(7, insumo.getMetroQuadradoAlvenaria());
                 pst.setDouble(8, insumo.getMetroQuadradoReboco());
                 pst.setDouble(9, insumo.getMetroQuadradoCobertura());
                 pst.setDouble(10, insumo.getQuantidadeTijolo());
                 pst.setDouble(11, insumo.getMetroQuadradoPiso());
                 pst.setDouble(12, insumo.getQuantidadeLataTinta());
                 pst.setDouble(13, insumo.getMetroCubicoConcreto());
                 pst.setDouble(14, insumo.getMetroCubicoBroca());
                 pst.setDouble(15, insumo.getMetroCubicoArgamassa());
                 pst.setDouble(16, insumo.getSacosCimento());
                 pst.setDouble(17, insumo.getMetroCubicoAreia());
                 pst.setDouble(18, insumo.getMetroCubicoPedra());
                 pst.setDouble(19, insumo.getQuantidadeTelha());
                 pst.setDouble(20, insumo.getSacoCal());
                 pst.setInt(21, obra.getIdObra());
                 pst.executeUpdate();
                //inserir em obraFuncionario
                // pst = conecta.conn.prepareStatement("INSERT INTO obra VALUES('id_obra','id_funcionario'");
                // pst.setInt(1,obra.getIdObra());
                 // pst.setInt(1,funcionario.get);
                 
		}catch (SQLException e) {  
	    } 

	}

    
    /**
     * @return the nomeObra
     */
    public String getNomeObra() {
        return nomeObra;
    }

    /**
     * @param nomeObra the nomeObra to set
     */
    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }
    public void setIdObra(int idObra){
        this.idObra = idObra;
    }
    /**
     * @return the idObra
     */
    public int getIdObra() {
        return idObra;
    }


    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataTermino
     */
    public String getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return the tipoObra
     */
    public int getTipoObra() {
        return tipoObra;
    }

    /**
     * @param tipoObra the tipoObra to set
     */
    public void setTipoObra(int tipoObra) {
        this.tipoObra = tipoObra;
    }

    /**
     * @return the metroQuadObra
     */
    public double getMetroQuadradoObra() {
        return metroQuadradoObra;
    }

    /**
     * @param metroQuadObra the metroQuadObra to set
     */
    public void setMetroQuadradoObra(double metroQuadObra) {
        this.metroQuadradoObra = metroQuadObra;
    }

    /**
     * @return the alturaObra
     */
    public double getAlturaObra() {
        return alturaObra;
    }

    /**
     * @param alturaObra the alturaObra to set
     */
    public void setAlturaObra(double alturaObra) {
        this.alturaObra = alturaObra;
    }
}

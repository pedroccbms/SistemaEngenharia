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
        private double tijolo;
        private double vigabaldrame;

     public double calcularAlturaObra(int tipoObra){
        if (tipoObra == 1) {
            // é casa térrea
            setAlturaObra(3);
        } else if (tipoObra == 2) {
            // é scadastrarObrado
            return 6;
        }
        else if (tipoObra == 3) {
            // é salão
            return 8;
        }
        return 0;
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

    /**
     * @return the tijolo
     */
    public double getTijolo() {
        return tijolo;
    }

    /**
     * @param tijolo the tijolo to set
     */
    public void setTijolo(double tijolo) {
        this.tijolo = tijolo;
    }

    /**
     * @return the vigabaldrame
     */
    public double getVigabaldrame() {
        return vigabaldrame;
    }

    /**
     * @param vigabaldrame the vigabaldrame to set
     */
    public void setVigabaldrame(double vigabaldrame) {
        this.vigabaldrame = vigabaldrame;
    }
    
}

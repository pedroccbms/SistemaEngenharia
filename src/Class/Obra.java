package Class;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maxximus
 */
public class Obra extends Insumo {

	private String nomeObra;
	private String codigoObra;
	private String dataInicio;
	private String dataTermino;
	private String tipoObra;
	private double metroQuadObra;

	public Obra(String nomeObra, String codigoObra, String dataInicio,
			String dataTermino, String tipoObra, double metroQuadObra,
			double metroQuadAlv, double metroQuadReb, double metroQuadvigaBal,
			double metroCobertura, double pintura, int quantPilar,
			String tipoTijolo, int quantEsq, int quantBanheiro, int quantCozinha) {
		super(metroQuadAlv, metroQuadReb, metroQuadvigaBal, metroCobertura,
				pintura, quantPilar, tipoTijolo, quantEsq, quantBanheiro,
				quantCozinha);
		this.nomeObra = nomeObra;
		this.codigoObra = codigoObra;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.tipoObra = tipoObra;
		this.metroQuadObra = metroQuadObra;
	}

	public String getCodigoObra() {
		return codigoObra;
	}

	public void setCodigoObra(String codigoObra) {
		this.codigoObra = codigoObra;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getTipoObra() {
		return tipoObra;
	}

	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}

	public double getMetroQuadObra() {
		return metroQuadObra;
	}

	public void setMetroQuadObra(double metroQuadObra) {
		this.metroQuadObra = metroQuadObra;
	}

	public void Calcular(double metroQuadradoDaObra,
			double metragemLinearDeVigaBaldrame, int tipoDaObra,
			int tipoDoTijolo, double metroLinearDePilares) {
		double metroQuadradoDotijolo = 0;
		double metroQuadradoDeLage = metroQuadradoDaObra;
		double metroQuadradoDeContrapiso = metroQuadradoDaObra;
		double alturaDaObra = 0;
		double metroQuadradoDeAlvenaria;
		double metroQuadradoDeReboco;
		double metroQuadradoDeCobertura = metroQuadradoDaObra;
		double quantidadeDeTijolo;
		double metroQuadradoDePiso = metroQuadradoDaObra;
		double quantidadeDeLataDeTinta;
		double metroCubicoDeBroca;
		double metroCubicoDeConcreto;
		double metroCubicoDeArgamassa;
		double sacosDeCimento;
		double metroCubicoDeAreia;
		double metroCubicoDePedra;
		double sacosDeCal;
		double quantidadeDeTelha;


		if (tipoDaObra == 1) {
			// é casa térrea
			alturaDaObra = 3;
		} else if (tipoDaObra == 2) {
			// é sobrado
			alturaDaObra = 6;
		}
		if (tipoDaObra == 3) {
			// é salão
			alturaDaObra = 8;
		}
		if (tipoDoTijolo == 1) {
			// é tijolo 10 furos
			metroQuadradoDotijolo = 0.02205;
		} else if (tipoDoTijolo == 2) {
			// é tijolo 8 furos
			metroQuadradoDotijolo = 0.038025;
		}
		if (tipoDoTijolo == 3) {
			// é tijolo a vista
			metroQuadradoDotijolo = 0.02;
		}

		metroQuadradoDeAlvenaria = metragemLinearDeVigaBaldrame * alturaDaObra;
		metroQuadradoDeReboco = (metroQuadradoDeAlvenaria * 0.03) * 2;
		quantidadeDeTijolo = metroQuadradoDeAlvenaria / metroQuadradoDotijolo;
		quantidadeDeLataDeTinta = (metroQuadradoDeReboco + metroQuadradoDeLage) / 80;
		metroCubicoDeBroca = 3.14 * (0.30 * 0.30) * alturaDaObra;
		metroCubicoDeConcreto = (metroCubicoDeBroca
				+ metragemLinearDeVigaBaldrame * 3 + metroQuadradoDeContrapiso
				* 0.02 * metroLinearDePilares * 0.30 + metroQuadradoDeLage * 0.20);
		metroCubicoDeArgamassa = (metroQuadradoDeContrapiso * 0.015
				+ ((quantidadeDeTijolo * 0.2 * 0.9) * 2) + metroQuadradoDeReboco * 0.015);
		sacosDeCimento = metroCubicoDeArgamassa * 4 + metroCubicoDeConcreto * 6;
		metroCubicoDeAreia = metroCubicoDeArgamassa * 0.95
				+ metroCubicoDeConcreto * 0.75;
		metroCubicoDePedra = metroCubicoDeConcreto * 0.65;
		sacosDeCal = metroCubicoDeArgamassa * 4;
		quantidadeDeTelha = metroQuadradoDeCobertura * 17;
		//inserindo no banco
		Connection connection = null; 
		try { Statement stmt = connection.createStatement(); 
		String sql = "INSERT INTO obra VALUES('metroQuadradoDaObra','metragemLinearDeVigaBaldrame','tipoDaObra',"
				+ "'tipoDoTijolo','metroLinearDePilares','metroQuadradoDotijolo','metroQuadradoDeLage','metroQuadradoDeContrapiso',"
				+ "'alturaDaObra','metroQuadradoDeAlvenaria','metroQuadradoDeReboco','metroQuadradoDeCobertura','quantidadeDeTijolo',"
				+ "'metroQuadradoDePiso','quantidadeDeLataDeTinta','metroCubicoDeBroca','metroCubicoDeConcreto','metroCubicoDeArgamassa',"
				+ "'sacosDeCimento','metroCubicoDeAreia','metroCubicoDePedra','sacosDeCal','quantidadeDeTelha')"; 
		}catch (SQLException e) {  
	    } 

	}
}

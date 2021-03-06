package Class;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maxximus
 */
public class Insumo {

    private int idInsumo;
    private int tipoTijolo;
    private double metragemLinearVigaBaldrame;
    private double metroLinearPilares;
    private double metroQuadradoTijolo;
    private double metroQuadradoLage;
    private double metroQuadradoContrapiso;
    private double metroQuadradoAlvenaria;
    private double metroQuadradoReboco;
    private double metroQuadradoCobertura;
    private double quantidadeTijolo;
    private double metroQuadradoPiso;
    private double quantidadeLataTinta;
    private double metroCubicoConcreto;
    private double metroCubicoBroca;
    private double metroCubicoArgamassa;
    private double sacosCimento;
    private double metroCubicoAreia;
    private double metroCubicoPedra;
    private double quantidadeTelha;
    private double sacoCal;
    private Obra obra;

    public Insumo() {

    }
    
    public Insumo calcular(Obra cadastrarObra, double metragemLinearVigaBaldrame,
    int tipoTijolo,
    double metroLinearPilares) {
                           Insumo insumo = new Insumo();
        insumo.setTipoTijolo(tipoTijolo);
        insumo.setMetroLinearPilares(metroLinearPilares);
        insumo.setMetragemLinearVigaBaldrame(metragemLinearVigaBaldrame);
        insumo.setMetroQuadradoLage(cadastrarObra.getMetroQuadradoObra());
        insumo.setMetroQuadradoContrapiso(cadastrarObra.getMetroQuadradoObra());
        insumo.setMetroQuadradoCobertura(cadastrarObra.getMetroQuadradoObra());
        insumo.setMetroQuadradoPiso(cadastrarObra.getMetroQuadradoObra());
        // Calcu

        if (insumo.getTipoTijolo() == 0) {
            // é tijolo 10 furos
            insumo.setMetroQuadradoTijolo(0.02205);
        } else if (insumo.getTipoTijolo() == 1) {
            // é tijolo 8 furos
            insumo.setMetroQuadradoTijolo(0.038025);
        }
        if (insumo.getTipoTijolo() == 2) {
            // é tijolo a vista
            insumo.setMetroQuadradoTijolo(0.02);
        }

        insumo.setMetroQuadradoAlvenaria(insumo.getMetragemLinearVigaBaldrame() * cadastrarObra.getAlturaObra());
        insumo.setMetroQuadradoReboco((insumo.getMetroQuadradoAlvenaria() * 0.03) * 2);
        insumo.setQuantidadeTijolo(insumo.getMetroQuadradoAlvenaria() / insumo.getMetroQuadradoTijolo());
        insumo.setQuantidadeLataTinta((insumo.getMetroQuadradoReboco() + insumo.getMetroQuadradoLage()) / 80);
        insumo.setMetroCubicoBroca(3.14 * (0.30 * 0.30) * cadastrarObra.getAlturaObra());
        insumo.setMetroCubicoConcreto((insumo.getMetroCubicoBroca() + insumo.getMetragemLinearVigaBaldrame() * 3 + insumo.getMetroQuadradoContrapiso())
                * 0.02 * insumo.getMetroLinearPilares() * 0.30 + insumo.getMetroQuadradoLage() * 0.20);
        insumo.setMetroCubicoArgamassa((insumo.getMetroQuadradoContrapiso() * 0.015
                + ((insumo.getQuantidadeTijolo() * 0.2 * 0.9) * 2) + insumo.getMetroQuadradoReboco() * 0.015));
        insumo.setSacosCimento(insumo.getMetroCubicoArgamassa() * 4 + insumo.getMetroCubicoConcreto() * 6);
        insumo.setMetroCubicoAreia(insumo.getMetroCubicoArgamassa() * 0.95
                + insumo.getMetroCubicoConcreto() * 0.75);
        insumo.setMetroCubicoPedra(insumo.getMetroCubicoConcreto() * 0.65);
        insumo.setSacoCal(insumo.getMetroCubicoArgamassa() * 4);
        insumo.setQuantidadeTelha(insumo.getMetroQuadradoCobertura() * 17);

        return insumo;       
    }
    /**
     * @return the idInsumo
     */
    public int getIdInsumo() {
        return idInsumo;
    }

    /**
     * @return the tipoTijolo
     */
    public int getTipoTijolo() {
        return tipoTijolo;
    }

    /**
     * @param tipoTijolo the tipoTijolo to set
     */
    public void setTipoTijolo(int tipoTijolo) {
        this.tipoTijolo = tipoTijolo;
    }

    /**
     * @return the metroLinearPilares
     */
    public double getMetroLinearPilares() {
        return metroLinearPilares;
    }

    /**
     * @param metroLinearPilares the metroLinearPilares to set
     */
    public void setMetroLinearPilares(double metroLinearPilares) {
        this.metroLinearPilares = metroLinearPilares;
    }

    /**
     * @return the metroQuadradoTijolo
     */
    public double getMetroQuadradoTijolo() {
        return metroQuadradoTijolo;
    }

    /**
     * @param metroQuadradoTijolo the metroQuadradoTijolo to set
     */
    public void setMetroQuadradoTijolo(double metroQuadradoTijolo) {
        this.metroQuadradoTijolo = metroQuadradoTijolo;
    }

    /**
     * @return the metroQuadradoLage
     */
    public double getMetroQuadradoLage() {
        return metroQuadradoLage;
    }

    /**
     * @param metroQuadradoLage the metroQuadradoLage to set
     */
    public void setMetroQuadradoLage(double metroQuadradoLage) {
        this.metroQuadradoLage = metroQuadradoLage;
    }

    /**
     * @return the metroQuadradoContrapiso
     */
    public double getMetroQuadradoContrapiso() {
        return metroQuadradoContrapiso;
    }

    /**
     * @param metroQuadradoContrapiso the metroQuadradoContrapiso to set
     */
    public void setMetroQuadradoContrapiso(double metroQuadradoContrapiso) {
        this.metroQuadradoContrapiso = metroQuadradoContrapiso;
    }

    /**
     * @return the metroQuadradoAlvenaria
     */
    public double getMetroQuadradoAlvenaria() {
        return metroQuadradoAlvenaria;
    }

    /**
     * @param metroQuadradoAlvenaria the metroQuadradoAlvenaria to set
     */
    public void setMetroQuadradoAlvenaria(double metroQuadradoAlvenaria) {
        this.metroQuadradoAlvenaria = metroQuadradoAlvenaria;
    }

    /**
     * @return the metroQuadradoRebeco
     */
    public double getMetroQuadradoReboco() {
        return metroQuadradoReboco;
    }

    /**
     * @param metroQuadradoRebeco the metroQuadradoRebeco to set
     */
    public void setMetroQuadradoReboco(double metroQuadradoReboco) {
        this.metroQuadradoReboco = metroQuadradoReboco;
    }

    /**
     * @return the metroQuadradoCobertura
     */
    public double getMetroQuadradoCobertura() {
        return metroQuadradoCobertura;
    }

    /**
     * @param metroQuadradoCobertura the metroQuadradoCobertura to set
     */
    public void setMetroQuadradoCobertura(double metroQuadradoCobertura) {
        this.metroQuadradoCobertura = metroQuadradoCobertura;
    }

    /**
     * @return the QuantidadeTijolo
     */
    public double getQuantidadeTijolo() {
        return quantidadeTijolo;
    }

    /**
     * @param QuantidadeTijolo the QuantidadeTijolo to set
     */
    public void setQuantidadeTijolo(double quantidadeTijolo) {
        this.quantidadeTijolo = quantidadeTijolo;
    }

    /**
     * @return the metroQuadradoPiso
     */
    public double getMetroQuadradoPiso() {
        return metroQuadradoPiso;
    }

    /**
     * @param metroQuadradoPiso the metroQuadradoPiso to set
     */
    public void setMetroQuadradoPiso(double metroQuadradoPiso) {
        this.metroQuadradoPiso = metroQuadradoPiso;
    }

    /**
     * @return the quantidadeLataTinta
     */
    public double getQuantidadeLataTinta() {
        return quantidadeLataTinta;
    }

    /**
     * @param quantidadeLataTinta the quantidadeLataTinta to set
     */
    public void setQuantidadeLataTinta(double quantidadeLataTinta) {
        this.quantidadeLataTinta = quantidadeLataTinta;
    }

    /**
     * @return the metroCubicoConcreto
     */
    public double getMetroCubicoConcreto() {
        return metroCubicoConcreto;
    }

    /**
     * @param metroCubicoConcreto the metroCubicoConcreto to set
     */
    public void setMetroCubicoConcreto(double metroCubicoConcreto) {
        this.metroCubicoConcreto = metroCubicoConcreto;
    }

    /**
     * @return the metroCubicoBroca
     */
    public double getMetroCubicoBroca() {
        return metroCubicoBroca;
    }

    /**
     * @param metroCubicoBroca the metroCubicoBroca to set
     */
    public void setMetroCubicoBroca(double metroCubicoBroca) {
        this.metroCubicoBroca = metroCubicoBroca;
    }

    /**
     * @return the metroCubicoArgamassa
     */
    public double getMetroCubicoArgamassa() {
        return metroCubicoArgamassa;
    }

    /**
     * @param metroCubicoArgamassa the metroCubicoArgamassa to set
     */
    public void setMetroCubicoArgamassa(double metroCubicoArgamassa) {
        this.metroCubicoArgamassa = metroCubicoArgamassa;
    }

    /**
     * @return the sacosCimento
     */
    public double getSacosCimento() {
        return sacosCimento;
    }

    /**
     * @param sacosCimento the sacosCimento to set
     */
    public void setSacosCimento(double sacosCimento) {
        this.sacosCimento = sacosCimento;
    }

    /**
     * @return the metroCubicoAreia
     */
    public double getMetroCubicoAreia() {
        return metroCubicoAreia;
    }

    /**
     * @param metroCubicoAreia the metroCubicoAreia to set
     */
    public void setMetroCubicoAreia(double metroCubicoAreia) {
        this.metroCubicoAreia = metroCubicoAreia;
    }

    /**
     * @return the metroCubicoPedra
     */
    public double getMetroCubicoPedra() {
        return metroCubicoPedra;
    }

    /**
     * @param metroCubicoPedra the metroCubicoPedra to set
     */
    public void setMetroCubicoPedra(double metroCubicoPedra) {
        this.metroCubicoPedra = metroCubicoPedra;
    }

    /**
     * @return the quantidadeTelha
     */
    public double getQuantidadeTelha() {
        return quantidadeTelha;
    }

    /**
     * @param quantidadeTelha the quantidadeTelha to set
     */
    public void setQuantidadeTelha(double quantidadeTelha) {
        this.quantidadeTelha = quantidadeTelha;
    }

    /**
     * @return the sacoCal
     */
    public double getSacoCal() {
        return sacoCal;
    }

    /**
     * @param sacoCal the sacoCal to set
     */
    public void setSacoCal(double sacoCal) {
        this.sacoCal = sacoCal;
    }

    /**
     * @return the obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * @param obra the obra to set
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * @return the metragemLinearVigaBaldrame
     */
    public double getMetragemLinearVigaBaldrame() {
        return metragemLinearVigaBaldrame;
    }

    /**
     * @param metragemLinearVigaBaldrame the metragemLinearVigaBaldrame to set
     */
    public void setMetragemLinearVigaBaldrame(double metragemLinearVigaBaldrame) {
        this.metragemLinearVigaBaldrame = metragemLinearVigaBaldrame;
    }

}

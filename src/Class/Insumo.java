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
    
    private double metroQuadAlv;
    private double metroQuadReb;
    private double metroQuadvigaBal;
    private double metroCobertura;
    private double pintura;
    private int quantPilar;
    private String tipoTijolo; 
    private int quantEsq;
    private int quantBanheiro;
    private int quantCozinha;

    public Insumo(double metroQuadAlv, double metroQuadReb, double metroQuadvigaBal, double metroCobertura, double pintura, int quantPilar, String tipoTijolo, int quantEsq, int quantBanheiro, int quantCozinha) {
        this.metroQuadAlv = metroQuadAlv;
        this.metroQuadReb = metroQuadReb;
        this.metroQuadvigaBal = metroQuadvigaBal;
        this.metroCobertura = metroCobertura;
        this.pintura = pintura;
        this.quantPilar = quantPilar;
        this.tipoTijolo = tipoTijolo;
        this.quantEsq = quantEsq;
        this.quantBanheiro = quantBanheiro;
        this.quantCozinha = quantCozinha;
    }
    
    public double getMetroQuadAlv() {
        return metroQuadAlv;
    }

    public void setMetroQuadAlv(double metroQuadAlv) {
        this.metroQuadAlv = metroQuadAlv;
    }

    public double getMetroQuadReb() {
        return metroQuadReb;
    }

    public void setMetroQuadReb(double metroQuadReb) {
        this.metroQuadReb = metroQuadReb;
    }

    public double getMetroQuadvigaBal() {
        return metroQuadvigaBal;
    }

    public void setMetroQuadvigaBal(double metroQuadvigaBal) {
        this.metroQuadvigaBal = metroQuadvigaBal;
    }

    public double getMetroCobertura() {
        return metroCobertura;
    }

    public void setMetroCobertura(double metroCobertura) {
        this.metroCobertura = metroCobertura;
    }

    public double getPintura() {
        return pintura;
    }

    public void setPintura(double pintura) {
        this.pintura = pintura;
    }

    public int getQuantPilar() {
        return quantPilar;
    }

    public void setQuantPilar(int quantPilar) {
        this.quantPilar = quantPilar;
    }

    public String getTipoTijolo() {
        return tipoTijolo;
    }

    public void setTipoTijolo(String tipoTijolo) {
        this.tipoTijolo = tipoTijolo;
    }

    public int getQuantEsq() {
        return quantEsq;
    }

    public void setQuantEsq(int quantEsq) {
        this.quantEsq = quantEsq;
    }

    public int getQuantBanheiro() {
        return quantBanheiro;
    }

    public void setQuantBanheiro(int quantBanheiro) {
        this.quantBanheiro = quantBanheiro;
    }

    public int getQuantCozinha() {
        return quantCozinha;
    }

    public void setQuantCozinha(int quantCozinha) {
        this.quantCozinha = quantCozinha;
    }
    
    
}

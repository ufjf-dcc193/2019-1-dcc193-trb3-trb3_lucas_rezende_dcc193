package com.toybox.trab03_dcc193.Models;

import java.util.List;

/**
 * Link
 */
public class Link {

    private Item origem;
    private Item destino;
    private List<Tag> etiquetas;
    private List<Anotation> anotacoes;

    public Link() {

    }

    /**
     * @return the anotacoes
     */
    public List<Anotation> getAnotacoes() {
        return anotacoes;
    }

    /**
     * @return the destino
     */
    public Item getDestino() {
        return destino;
    }

    /**
     * @return the etiquetas
     */
    public List<Tag> getEtiquetas() {
        return etiquetas;
    }

    /**
     * @return the origem
     */
    public Item getOrigem() {
        return origem;
    }

    /**
     * @param anotacoes the anotacoes to set
     */
    public void setAnotacoes(List<Anotation> anotacoes) {
        this.anotacoes = anotacoes;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Item destino) {
        this.destino = destino;
    }

    /**
     * @param etiquetas the etiquetas to set
     */
    public void setEtiquetas(List<Tag> etiquetas) {
        this.etiquetas = etiquetas;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(Item origem) {
        this.origem = origem;
    }
}
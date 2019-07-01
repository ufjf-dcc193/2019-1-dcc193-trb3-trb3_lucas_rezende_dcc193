package com.toybox.trab03_dcc193.Models;

import java.util.List;

/**
 * Item
 */
public class Item {

    private String titulo;
    private List<Anotation> anotaçoes;
    private List<Tag> etiquetas;
    private List<Link> vinculos;

    public Item() {

    }

    /**
     * @return the anotaçoes
     */
    public List<Anotation> getAnotaçoes() {
        return anotaçoes;
    }

    /**
     * @return the etiquetas
     */
    public List<Tag> getEtiquetas() {
        return etiquetas;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the vinculos
     */
    public List<Link> getVinculos() {
        return vinculos;
    }

    /**
     * @param anotaçoes the anotaçoes to set
     */
    public void setAnotaçoes(List<Anotation> anotaçoes) {
        this.anotaçoes = anotaçoes;
    }

    /**
     * @param etiquetas the etiquetas to set
     */
    public void setEtiquetas(List<Tag> etiquetas) {
        this.etiquetas = etiquetas;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param vinculos the vinculos to set
     */
    public void setVinculos(List<Link> vinculos) {
        this.vinculos = vinculos;
    }
}
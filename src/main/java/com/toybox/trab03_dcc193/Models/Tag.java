package com.toybox.trab03_dcc193.models;

/**
 * Tag
 */
public class Tag {

    private int id;
    private String titulo;
    private String descricao;
    private String url;

    public Tag() {

    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
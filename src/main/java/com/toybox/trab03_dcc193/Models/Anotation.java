package com.toybox.trab03_dcc193.models;

/**
 * Anotation
 */
public class Anotation {

    private int id;
    private String titulo;
    private String descricao;
    private String url;
    private User usuario;

    public Anotation() {

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
     * @return the usuario
     */
    public User getUsuario() {
        return usuario;
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
     * @param usuario the usuario to set
     */
    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
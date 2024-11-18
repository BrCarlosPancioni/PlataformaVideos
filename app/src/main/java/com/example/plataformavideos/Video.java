package com.example.plataformavideos;

public class Video {
    private String title;
    private int thumbnail;
    private Categoria categoria;

    public Video(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public Video(String title, int thumbnail, Categoria categoria) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.categoria = categoria;
    }

    public String getTitle() {
        return title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}

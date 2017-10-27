package com.example.andres.fragmentmaslistview;

import java.io.Serializable;

/**
 * Created by andres on 10/25/17.
 */

public class CancionRH implements Serializable{

    private String titulo;
    private Integer duracion;
    private Integer fotoAlbum;

    public CancionRH(String titulo, Integer duracion, Integer fotoAlbum) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.fotoAlbum = fotoAlbum;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setFotoAlbum(Integer fotoAlbum) {
        this.fotoAlbum = fotoAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getFotoAlbum() {
        return fotoAlbum;
    }

    @Override
    public String toString() {
        return "CancionRH{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", fotoAlbum=" + fotoAlbum +
                '}';
    }
}

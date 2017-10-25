package com.example.ma.interfacesdeusuario;

/**
 * Created by ma on 25/10/17.
 */

public class VersionSistemaOperativo {

private String nombreVersion;
private String numeroVersion;
private Integer fotoDescriptiva;


    public VersionSistemaOperativo(String nombreVersion, String numeroVersion, Integer fotoDescriptiva) {
        this.nombreVersion = nombreVersion;
        this.numeroVersion = numeroVersion;
        this.fotoDescriptiva = fotoDescriptiva;
    }

    public String getNombreVersion() {
        return nombreVersion;
    }

    public void setNombreVersion(String nombreVersion) {
        this.nombreVersion = nombreVersion;
    }

    public String getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(String numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    public Integer getFotoDescriptiva() {
        return fotoDescriptiva;
    }

    public void setFotoDescriptiva(Integer fotoDescriptiva) {
        this.fotoDescriptiva = fotoDescriptiva;
    }
}

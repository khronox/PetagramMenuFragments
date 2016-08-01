package com.duquehenry.petagrammenufragments.pojo;

/**
 * Created by hduque on 30/07/2016.
 */
public class Mascota {
    //Atributos
    private String  nombreMascota;
    private String  ratingMascota;
    private int     fotoMascota;

    //Constructor
    public Mascota(String nombreMascota, String ratingMascota, int fotoMascota) {
        this.nombreMascota = nombreMascota;
        this.ratingMascota = ratingMascota;
        this.fotoMascota = fotoMascota;
    }

    //Getters y Setters
    public String getNombreMascota() {
        return nombreMascota;
    }
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getRatingMascota() {
        return ratingMascota;
    }
    public void setRatingMascota(String ratingMascota) {
        this.ratingMascota = ratingMascota;
    }
    public int getFotoMascota() {
        return fotoMascota;
    }
    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }
}

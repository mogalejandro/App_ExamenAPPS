package com.miapp.alejandromota.app_examenapps.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.miapp.alejandromota.app_examenapps.model.Banners.Banners;
import com.miapp.alejandromota.app_examenapps.model.Tracks.Tracks;

import java.util.ArrayList;

public class Feed {

    @SerializedName("codigoRespuesta")
    @Expose
    private String codigoRespuesta;

    @SerializedName("mensajeRespuesta")
    @Expose
    private String mensajeRespuesta;

    @SerializedName("banners")
    @Expose
    private ArrayList<Banners> banners;

    @SerializedName("tracks")
    @Expose
    private ArrayList<Tracks> tracks;

    public ArrayList<Tracks> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Tracks> tracks) {
        this.tracks = tracks;
    }

    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public ArrayList<Banners> getBanners() {
        return banners;
    }

    public void setBanners(ArrayList<Banners> banners) {
        this.banners = banners;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "codigoRespuesta='" + codigoRespuesta + '\'' +
                ", mensajeRespuesta='" + mensajeRespuesta + '\'' +
                ", banners=" + banners +
                ", tracks=" + tracks +
                '}';
    }
}

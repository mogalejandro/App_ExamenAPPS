package com.miapp.alejandromota.app_examenapps.model.Banners;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Banners {

    @SerializedName("albumId")
    @Expose
    private String albumId;

    @SerializedName("albumName")
    @Expose
    private String albumName;

    @SerializedName("artistName")
    @Expose
    private String artistName;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("image")
    @Expose
    private String image;

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Banners{" +
                "albumId='" + albumId + '\'' +
                ", albumName='" + albumName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", id='" + id + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

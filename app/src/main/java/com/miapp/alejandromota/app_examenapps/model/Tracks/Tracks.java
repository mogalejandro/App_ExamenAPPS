package com.miapp.alejandromota.app_examenapps.model.Tracks;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Tracks {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("posterUrl")
    @Expose
    private String posterUrl;

    @SerializedName("featuredPosterUrl")
    @Expose
    private String featuredPosterUrl;

    @SerializedName("albumName")
    @Expose
    private String albumName;

    @SerializedName("artistName")
    @Expose
    private String[] artistName;

    public String[] getArtistName() {
        return artistName;
    }

    public void setArtistName(String[] artistName) {
        this.artistName = artistName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getFeaturedPosterUrl() {
        return featuredPosterUrl;
    }

    public void setFeaturedPosterUrl(String featuredPosterUrl) {
        this.featuredPosterUrl = featuredPosterUrl;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Tracks{" +
                "name='" + name + '\'' +
                ", posterUrl='" + posterUrl + '\'' +
                ", featuredPosterUrl='" + featuredPosterUrl + '\'' +
                ", albumName='" + albumName + '\'' +
                ", artistName=" + Arrays.toString(artistName) +
                '}';
    }
}

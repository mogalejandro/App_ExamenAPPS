package com.miapp.alejandromota.app_examenapps;

import com.miapp.alejandromota.app_examenapps.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface RedditAPI {

    String Bse_url="http://201.161.105.70:8007/contenedor/feedCM/mx/";

    @Headers("Content-Type: application/json")
    @GET("feedCM_mx.json")
    Call<Feed> listRepos();

}

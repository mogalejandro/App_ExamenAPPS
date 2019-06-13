package com.miapp.alejandromota.app_examenapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.miapp.alejandromota.app_examenapps.model.Banners.Banners;
import com.miapp.alejandromota.app_examenapps.model.Feed;
import com.miapp.alejandromota.app_examenapps.model.Tracks.Tracks;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {


    public static final String TAG="MainActivity";
    private static final String Bse_url="http://201.161.105.70:8007/contenedor/feedCM/mx/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Button getData=findViewById(R.id.getData);
        final ListView listView=findViewById(R.id.listView);

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Bse_url).addConverterFactory(GsonConverterFactory.create()).build();

        RedditAPI redditapi=retrofit.create(RedditAPI.class);
        Call<Feed> call = redditapi.listRepos();

        call.enqueue(new Callback<Feed>() {
            @Override
            public void onResponse(Call<Feed> call, Response<Feed> response) {
                Log.d("TAG","onResponse : el servidor respondio: " + response.toString());
                Log.d("TAG","onResponse : el servidor recivió la información: " + response.body().toString());
                Toast.makeText(MainActivity.this,"información obtenida", Toast.LENGTH_SHORT ).show();

                ArrayList<Banners> banners= response.body().getBanners();
                ArrayList<Tracks> tracks= response.body().getTracks();

                String[] item= new String[tracks.size()];
                String[] item_img= new String[tracks.size()];
                String[] item_desc= new String[tracks.size()];

                    for(int i =0; i<tracks.size();i++){
                        item[i]= tracks.get(i).getAlbumName();
                        item_img[i]=tracks.get(i).getPosterUrl();
                        item_desc[i]=tracks.get(i).getAlbumName();

                    }

                    listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,item));


                //BANNERS33
               /* ArrayList<Banners> banners= response.body().getBanners();
               for(int i=0; i<banners.size();i++){
                    Log.d(TAG,"onResponse: \n"+
                            "Album Name: " + banners.get(i).getAlbumName()+"\n" +
                            "Album id: " + banners.get(i).getAlbumId()+"\n" +
                            "Id: " + banners.get(i).getId()+"\n" +
                            "Artist Name: " + banners.get(i).getArtistName() + "\n" +
                            "Imagen: " + banners.get(i).getImage()+"\n"+
                            "------------------------------------------------------------------------------------");
                }
                Log.d(TAG,"\n\n\nY AHORA *********************************************************************************** \n");
                //TRACKS
                ArrayList<Tracks> tracks= response.body().getTracks();
                for(int i=0; i<tracks.size();i++){
                    Log.d(TAG,"onResponse: \n"+
                            "TRACK: " + tracks.get(i).getName()+"\n" +
                            "posterUrl: " + tracks.get(i).getPosterUrl()+"\n" +
                            "Artista: " + tracks.get(i).getFeaturedPosterUrl()+"\n" +
                            "albumName: " + tracks.get(i).getAlbumName() + "\n");
                    String []artista = tracks.get(i).getArtistName();
                    for(int j = 0; j< artista.length; j++){
                        Log.d(TAG,"ArtisName: " + artista[j].toString() + " - ");
                    }
                    Log.d(TAG,"\n------------------------------------------------------------------------------------\n");
                }*/
            }

            @Override
            public void onFailure(Call<Feed> call, Throwable t) {
                Log.e("TAG","onFailure : algo estuvo mal: " + t.getMessage());
                Toast.makeText(MainActivity.this,"Algo salio mal", Toast.LENGTH_SHORT ).show();
            }
        });

    }
}

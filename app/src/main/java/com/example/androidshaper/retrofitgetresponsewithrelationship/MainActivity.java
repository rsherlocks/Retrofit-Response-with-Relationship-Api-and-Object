package com.example.androidshaper.retrofitgetresponsewithrelationship;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    OurRetrofitClient ourRetrofitClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(50, TimeUnit.SECONDS)
                .connectTimeout(50, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit= new Retrofit
                .Builder()
                .baseUrl("https://cricket.sportmonks.com/api/v2.0/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

                ourRetrofitClient=retrofit.create(OurRetrofitClient.class);




        Call<ObjectQuery> call= ourRetrofitClient.getData(1,"Your api Token");

        call.enqueue(new Callback<ObjectQuery>() {
            @Override
            public void onResponse(Call<ObjectQuery> call, Response<ObjectQuery> response) {
                if (response.isSuccessful())
                {



                    TeamClass teamClass=response.body().getData();
                    int id=teamClass.getCountry_id();



                   Log.d("id", String.valueOf(teamClass.getCountry_id()) );
                    Log.d("name", String.valueOf(teamClass.getName()) );
                    Call<ArrayDesignClass> callTeam=ourRetrofitClient.getData("Your api Token",id);

                    callTeam.enqueue(new Callback<ArrayDesignClass>() {
                        @Override
                        public void onResponse(Call<ArrayDesignClass> call, Response<ArrayDesignClass> response) {
                            if (response.isSuccessful())
                            {
                                Log.d("response", "onResponse:Success");
                                List<ObjectDesignClass> list=response.body().getData();

                                int i=0;
                                for (ObjectDesignClass objectDesignClass : list)
                                {
                                    if (i<11)
                                    {
                                        Log.d("name", String.valueOf(objectDesignClass.getFullname()) );
                                        Log.d("DOB", String.valueOf(objectDesignClass.getDateofbirth()) );
                                        Log.d("Gender", String.valueOf(objectDesignClass.getGender()) );
                                        Log.d("Code", String.valueOf(objectDesignClass.getCountry_id()) );
                                        Log.d("Position", String.valueOf(objectDesignClass.getPositionOfPlayer().getName()) );


                                        i++;
                                    }


                                }


                            }
                        }

                        @Override
                        public void onFailure(Call<ArrayDesignClass> call, Throwable t) {
                            Log.d("response", "onFailure: message"+t.getMessage());

                        }
                    });



                }
                else
                {
                    Log.d("response", "onResponse: Not Success");
                }


            }


            @Override
            public void onFailure(Call<ObjectQuery> call, Throwable t) {
                Log.d("response", "onFailure: Message");

            }
        });


    }
}
package com.h5190072.h5190072_MertcanOzyurtFinal.network;
import com.h5190072.h5190072_MertcanOzyurtFinal.model.UstaModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ServiceApi {


    @GET("usta.json")
    Observable<List<UstaModel>> ustalariGetir();
}

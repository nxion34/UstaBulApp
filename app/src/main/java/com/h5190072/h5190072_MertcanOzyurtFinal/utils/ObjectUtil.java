package com.h5190072.h5190072_MertcanOzyurtFinal.utils;

import com.google.gson.Gson;
import com.h5190072.h5190072_MertcanOzyurtFinal.model.UstaModel;


public class ObjectUtil {

    public  static String ustaToJsonString(UstaModel ustaModel)
    {
        Gson gson = new Gson();
        return   gson.toJson(ustaModel);
    }

    public  static UstaModel jsonStringToUsta(String jsonString)
    {
        Gson gson = new Gson();
        return  gson.fromJson(jsonString,UstaModel.class);
    }
}

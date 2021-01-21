package com.h5190072.h5190072_MertcanOzyurtFinal.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class InternetUtil {

    public static boolean internetKontrol(Context context)

    {
        ConnectivityManager connectivityManager=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();

        if(networkInfo!=null && networkInfo.isAvailable() && networkInfo.isConnected())
        {
            return true;
        }
        else {
            return false;
        }
    }
}

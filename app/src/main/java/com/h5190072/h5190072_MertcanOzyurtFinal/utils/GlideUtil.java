package com.h5190072.h5190072_MertcanOzyurtFinal.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.h5190072.h5190072_mertcanozyurt.R;

public class GlideUtil {

    public  static  void resmiIndiripGoster(Context context, String url, ImageView img)
    {

        Glide.with(context)
                .load(url)
                .error(R.drawable.giriskapak)
                .centerCrop()
                .into(img);

        

    }
}

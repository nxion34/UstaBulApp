package com.h5190072.h5190072_MertcanOzyurtFinal.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.h5190072.h5190072_mertcanozyurt.R;


public class AlertUtil {

    public static void HataGoster(Activity activity, String title, String message,boolean isNoConnectionAlert){
        AlertDialog.Builder builder=new AlertDialog.Builder(activity);
        builder.setTitle(title);
        builder.setMessage(message);

        if(isNoConnectionAlert)
        {
            builder.setNegativeButton(R.string.cikisUyari3, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    activity.finish();
                }
            });
            builder.setPositiveButton(R.string.ayarlaraGit, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    activity.startActivity(new Intent(Settings.ACTION_SETTINGS));
                    activity.finish();
                }
            });
        }

        builder.show();
    }
}

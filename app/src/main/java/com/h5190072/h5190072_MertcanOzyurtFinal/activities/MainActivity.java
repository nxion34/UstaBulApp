package com.h5190072.h5190072_MertcanOzyurtFinal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.h5190072.h5190072_MertcanOzyurtFinal.utils.AlertUtil;
import com.h5190072.h5190072_MertcanOzyurtFinal.utils.InternetUtil;
import com.h5190072.h5190072_mertcanozyurt.R;
import com.h5190072.h5190072_MertcanOzyurtFinal.utils.Constants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splash();
    }

    private void splash()
    {
        CountDownTimer countDownTimer =new CountDownTimer(Constants.SPLASH_SCREEN_TIMER_SURE, Constants.INTERVAL) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                screenPass();

            }
        };
        countDownTimer.start();
    }

    private void screenPass(){
        if(InternetUtil.internetKontrol(getApplicationContext()))
        {
            Intent listIntent =new Intent(getApplicationContext(),UstaListActivity.class);
            startActivity(listIntent);
            finish();
        } else{
            AlertUtil.HataGoster(this,getString(R.string.internetUyariBaslik),getString(R.string.internetUyariAltBaslik),true);
        }

    }










}




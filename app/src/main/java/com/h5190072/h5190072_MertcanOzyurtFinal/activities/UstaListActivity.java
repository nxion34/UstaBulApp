package com.h5190072.h5190072_MertcanOzyurtFinal.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.h5190072.h5190072_mertcanozyurt.R;
import com.h5190072.h5190072_MertcanOzyurtFinal.model.UstaModel;
import com.h5190072.h5190072_MertcanOzyurtFinal.adaptor.UstaAdaptor;
import com.h5190072.h5190072_MertcanOzyurtFinal.network.Service;
import com.h5190072.h5190072_MertcanOzyurtFinal.utils.Constants;
import com.h5190072.h5190072_MertcanOzyurtFinal.utils.ObjectUtil;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class UstaListActivity extends AppCompatActivity {
    ProgressDialog progressDialog ;
    ImageView imgUstaLogo;
    RecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_usta_list);
            ProgressDialog progressDialog = new ProgressDialog(UstaListActivity.this);progressDialog.setMessage(getString(R.string.lutfenBekleyiniz));progressDialog.show();progressDialog.dismiss();
            init();
        }
        private  void  init()
        {
            ustalariGetir();
        }

        void  ustalariGetir()
        {

            new Service().getServiceApi().ustalariGetir().
                    subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<UstaModel>>() {

                        List<UstaModel> ustalar=new ArrayList<>();

                        @Override
                        public void onSubscribe(Disposable d) {
                            Log.e("RETROFIT","onSubscribe : ");
                        }

                        @Override
                        public void onNext(List<UstaModel> ustaList) {
                            Log.e("RETROFIT","onNext : ");
                            ustalar=ustaList;
                        }

                        @Override
                        public void onError(Throwable e) {

                            Log.e("RETROFIT","onError : " + e.getLocalizedMessage());

                        }

                        @Override
                        public void onComplete()
                        {
                            Log.e("RETROFIT","onComplete : ");
                            progressDialog.dismiss();

                            if(ustalar.size()>0) {



                                initRecycleView(ustalar);
                            }
                        }
                    });
         progressDialog  = new ProgressDialog(UstaListActivity.this);
         progressDialog.setMessage(getString(R.string.lutfenBekleyiniz));
         progressDialog.show();
        }

        private  void  initRecycleView(List<UstaModel> ustaList)
        {
            recyclerView =findViewById(R.id.rcvUstalar);
            UstaAdaptor ustaAdaptor =new UstaAdaptor(ustaList, getApplicationContext(), new UstaAdaptor.OnItemClickListener() {
                @Override
                public void onClik(int position) {

                    UstaModel tiklananUsta=ustaList.get(position);
                    opennextActivity(tiklananUsta);
                }
            });
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            recyclerView.setAdapter(ustaAdaptor);
        }

    private void opennextActivity(UstaModel tiklananUsta){
        Intent secondActivityIntent=new Intent(getApplicationContext(),UstaDetayActivity.class);
        String tiklananUstaString= ObjectUtil.ustaToJsonString(tiklananUsta);
        secondActivityIntent.putExtra(Constants.TASINAN_BASLIGI,tiklananUstaString);
        startActivity(secondActivityIntent);
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle(getString(R.string.cikisUyari))
                .setMessage(getString(R.string.cikisUyari2))
                .setNegativeButton(getString(R.string.hayirUyari), null)
                .setPositiveButton(getString(R.string.evetUyari), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        UstaListActivity.super.onBackPressed();
                    }
                }).create().show();
    }


}
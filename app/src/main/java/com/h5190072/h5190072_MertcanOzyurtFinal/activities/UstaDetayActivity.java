package com.h5190072.h5190072_MertcanOzyurtFinal.activities;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.h5190072.h5190072_mertcanozyurt.R;
import com.h5190072.h5190072_MertcanOzyurtFinal.model.UstaModel;
import com.h5190072.h5190072_MertcanOzyurtFinal.utils.Constants;
import com.h5190072.h5190072_MertcanOzyurtFinal.utils.GlideUtil;
import com.h5190072.h5190072_MertcanOzyurtFinal.utils.ObjectUtil;
public class UstaDetayActivity extends AppCompatActivity {

    ImageView imgKapak,imgUstaDetayLogo,imgTelFoto;
    TextView txtBaslik,txtDetay,txtAdres,txtTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usta_detay);

        String tasinanUstaString =getIntent().getStringExtra(Constants.TASINAN_BASLIGI);
        UstaModel ustaModel = ObjectUtil.jsonStringToUsta(tasinanUstaString);

        imgKapak=findViewById(R.id.imgUstaDetay);
        imgUstaDetayLogo=findViewById(R.id.imgUstaDetayLogo);
        imgTelFoto=findViewById(R.id.imgTelfoto);
        txtBaslik=findViewById(R.id.txtBaslik);
        txtDetay=findViewById(R.id.txtDetay);
        txtAdres=findViewById(R.id.txtAdres);
        txtTel=findViewById(R.id.txtUstaDetayTel);

        txtBaslik.setText(ustaModel.getAdiSoyadi());
        txtDetay.setText(ustaModel.getAciklama());
        txtAdres.setText(ustaModel.getAdres());
        txtTel.setText(ustaModel.getTelefonNo());

        GlideUtil.resmiIndiripGoster(getApplicationContext(),ustaModel.getKapakResimURL(),imgKapak);
        GlideUtil.resmiIndiripGoster(getApplicationContext(),ustaModel.getResimURL(),imgUstaDetayLogo);
        GlideUtil.resmiIndiripGoster(getApplicationContext(),ustaModel.getTelefonFotoURL(),imgTelFoto);

    }

}
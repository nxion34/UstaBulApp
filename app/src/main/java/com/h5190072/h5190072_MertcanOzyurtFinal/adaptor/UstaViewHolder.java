package com.h5190072.h5190072_MertcanOzyurtFinal.adaptor;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.h5190072.h5190072_mertcanozyurt.R;

public class UstaViewHolder extends RecyclerView.ViewHolder {

    ImageView imgUsta;
    TextView txtIsim;
    TextView txtEmail;
    TextView txtTelNo;

    public UstaViewHolder(@NonNull View itemView,UstaAdaptor.OnItemClickListener Listener) {
        super(itemView);

        imgUsta =itemView.findViewById(R.id.imgUstaLogo);
        txtIsim =itemView.findViewById(R.id.txtUstaAdi);
        txtEmail =itemView.findViewById(R.id.txtEmail);
        txtTelNo =itemView.findViewById(R.id.txtTel);

       itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Listener.onClik(getAdapterPosition());
           }
       });
    }
}

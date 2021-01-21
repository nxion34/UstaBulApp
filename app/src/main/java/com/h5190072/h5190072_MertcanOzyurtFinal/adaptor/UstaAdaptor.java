package com.h5190072.h5190072_MertcanOzyurtFinal.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.h5190072.h5190072_MertcanOzyurtFinal.utils.GlideUtil;
import com.h5190072.h5190072_mertcanozyurt.R;
import com.h5190072.h5190072_MertcanOzyurtFinal.model.UstaModel;

import java.util.List;

public class UstaAdaptor extends RecyclerView.Adapter<UstaViewHolder> {


    List<UstaModel> ustalar;
    Context context;
    OnItemClickListener Listener;
    public interface OnItemClickListener {


        void onClik(int position);

    }

    public UstaAdaptor(List<UstaModel> ustalar, Context context,OnItemClickListener Listener) {
        this.ustalar = ustalar;
        this.context = context;
        this.Listener=Listener;
    }

    @NonNull
    @Override
    public UstaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_usta,parent,false);
        return new UstaViewHolder(itemView,Listener);
    }

    @Override
    public void onBindViewHolder(@NonNull UstaViewHolder viewHolder, int position) {

        viewHolder.txtEmail.setText(ustalar.get(position).getEposta());
        viewHolder.txtIsim.setText(ustalar.get(position).getAdiSoyadi());
        viewHolder.txtTelNo.setText(ustalar.get(position).getTelefonNo());
        GlideUtil.resmiIndiripGoster(context,ustalar.get(position).getResimURL(),viewHolder.imgUsta);

    }

    @Override
    public int getItemCount() {
        return ustalar.size();
    }

}

package com.h5190072.h5190072_MertcanOzyurtFinal.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UstaModel {


    @SerializedName("AdiSoyadi")
    @Expose
    private String adiSoyadi;
    @SerializedName("Eposta")
    @Expose
    private String eposta;
    @SerializedName("Aciklama")
    @Expose
    private String aciklama;
    @SerializedName("ResimURL")
    @Expose
    private String resimURL;
    @SerializedName("KapakResimUrl")
    @Expose
    private String kapakResimUrl;
    @SerializedName("TelefonFotoURL")
    @Expose
    private String telefonFotoURL;
    @SerializedName("TelefonNo")
    @Expose
    private String telefonNo;
    @SerializedName("Adres")
    @Expose
    private String adres;
    @SerializedName("KapakResimURL")
    @Expose
    private String kapakResimURL;

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getResimURL() {
        return resimURL;
    }

    public void setResimURL(String resimURL) {
        this.resimURL = resimURL;
    }

    public String getKapakResimUrl() {
        return kapakResimUrl;
    }

    public void setKapakResimUrl(String kapakResimUrl) {
        this.kapakResimUrl = kapakResimUrl;
    }

    public String getTelefonFotoURL() {
        return telefonFotoURL;
    }

    public void setTelefonFotoURL(String telefonFotoURL) {
        this.telefonFotoURL = telefonFotoURL;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getKapakResimURL() {
        return kapakResimURL;
    }

    public void setKapakResimURL(String kapakResimURL) {
        this.kapakResimURL = kapakResimURL;
    }
}

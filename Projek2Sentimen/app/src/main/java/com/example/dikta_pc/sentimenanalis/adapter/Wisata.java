package com.example.dikta_pc.sentimenanalis.adapter;

public class Wisata {
    private String nama,kota,provinsi,imgUrl;
    private int mfb,mig;

    public Wisata(String nama, String kota, String provinsi, String imgUrl, int mfb, int mig) {
        this.nama = nama;
        this.kota = kota;
        this.provinsi = provinsi;
        this.imgUrl = imgUrl;
        this.mfb = mfb;
        this.mig = mig;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getMfb() {
        return mfb;
    }

    public void setMfb(int mfb) {
        this.mfb = mfb;
    }

    public int getMig() {
        return mig;
    }

    public void setMig(int mig) {
        this.mig = mig;
    }
}

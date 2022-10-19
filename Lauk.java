package com.example.daftarmenumakanan;

import java.io.Serializable;

public class Lauk implements Serializable {
    private String Judul, Harga;
    private int img;

    public Lauk(String judul, String harga, int img) {
        Judul = judul;
        Harga = harga;
        this.img = img;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

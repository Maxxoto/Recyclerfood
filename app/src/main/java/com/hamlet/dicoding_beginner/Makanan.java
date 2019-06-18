package com.hamlet.dicoding_beginner;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Makanan extends ArrayList<Parcelable> implements Parcelable {
    private String name;
    private String remarks;
    private String photo;
    private String detail;
    private String kota;
    private String bahan;
    private String harga;





    public Makanan() {

    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    //Method yang tidak terlalu penting hanya mengembalikan hashCode();
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.detail);
        dest.writeString(this.kota);
        dest.writeString(this.bahan);
        dest.writeString(this.harga);
    }

    //Constructor untuk parcel
    protected Makanan(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        detail = in.readString();
        kota = in.readString();
        bahan = in.readString();
        harga = in.readString() ;
        //TODO : MELANJUTKAN PASSING DATA PARCELABLE
    }

    //Un-parceling membuat objek
    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };


}

package com.hamlet.dicoding_beginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MainDetail extends AppCompatActivity {
    TextView tv_name,tv_remarks,tv_detail,tv_kota,tv_bahan,tv_harga;
    ImageView iv_photo;

    private ArrayList<Makanan> list ;
    String title = "Makanan Indonesia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle(title);

        //Collect Intent
        Intent intent = this.getIntent();
        Makanan makanan = intent.getParcelableExtra("Food");

        //Memasukkan Value ke pada field
        //TODO : PARCEL ERROR DATA KOSONG
        String name = makanan.getName();
        String remarks = makanan.getRemarks();
        String photo = makanan.getPhoto();
        String detail = makanan.getDetail();
        String kota = makanan.getKota();
        String bahan = makanan.getBahan();
        String harga = makanan.getHarga();
//        String name = "TEST";
//        String remarks = "TEST";
//        String photo = "TEST";
//        String detail = "TEST";
//        String kota = "TEST";
//        String bahan = "TEST";
//        String harga = "TEST";


        tv_name = findViewById(R.id.tv_item_name);
        tv_remarks = findViewById(R.id.tv_item_remarks);
        iv_photo = findViewById(R.id.img_item_photo);
        tv_detail = findViewById(R.id.tv_item_detail);
        tv_kota = findViewById(R.id.tv_item_kota);
        tv_bahan = findViewById(R.id.tv_item_bahan);
        tv_harga = findViewById(R.id.tv_item_harga);

        tv_name.setText(name);
        tv_remarks.setText(remarks);
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(125, 125))
                .into(iv_photo);

        tv_detail.setText(detail);
        tv_kota.setText(kota);
        tv_bahan.setText(bahan);
        tv_harga.setText(harga);



    }




}

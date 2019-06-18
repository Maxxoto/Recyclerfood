package com.hamlet.dicoding_beginner;

import java.util.ArrayList;

public class MakananData {
    public static String[][] data = new String[][]{
            {"Rujak","Khas Surabaya","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Rujak_Buah_%28Indonesian_Fruit_Salad%29.JPG/250px-Rujak_Buah_%28Indonesian_Fruit_Salad%29.JPG","Rujak adalah makanan tradisional yang biasanya terbuat dari campuran berbagai macam sayuran atau buah dan dibubuhi bumbu atau kuah yang dicampuri cabe.","Surabaya","Buah dan Sayur","Rp.10.000"},
            {"Ketoprak","Khas Jakarta","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Ketoprak_Boplo.JPG/250px-Ketoprak_Boplo.JPG","Ketoprak adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. ","Jakarta","Lontong dan Sayur","Rp.15.000 - 20.000"},
            {"Soto","Khas Lamongan","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Soto_Ceker_1.jpg/220px-Soto_Ceker_1.jpg","Soto Lamongan adalah soto dari lamongan yang sudah tersebar di berbagai daerah di Indonesia dan terkenal dengan kuah yang enak.","Lamongan","Daging Ayam","Rp.20.000 - 50.000"},
            {"Rawon","Khas Banyuwangi","https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Nasi_Rawon_A.JPG/220px-Nasi_Rawon_A.JPG","Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta).","Banyuwangi","Nasi dan Empal","Rp.25.000 - 40.000"},
            {"Tahu Tek","Khas Surabaya","https://i2.wp.com/resepkoki.id/wp-content/uploads/2016/11/Resep-Tahu-Tek-Surabaya.jpg?fit=2292%2C2292&ssl=1","Tahu tek adalah salah satu masakan khas kota Surabaya. Tahu tek terdiri atas tahu goreng setengah matang dan lontong yang dipotong kecil-kecil dengan alat gunting dan garpu untuk memegang tahu.","Surabaya","Lontong dan Tahu","Rp.10.000 - 15.000"},
            {"Gudeg","Khas Yogyakarta","https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Nasi_Gudeg.jpg/250px-Nasi_Gudeg.jpg","Gudheg) adalah makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan.","Yogyakarta","Nangka Muda","Rp.25.000 - 50.000"},
            {"Papeda","Khas Papua","https://upload.wiki                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             media.org/wikipedia/commons/thumb/0/01/Papeda%2C_Kuah_Kuning%2C_Ikan_Tude_Bakar_2.jpg/260px-Papeda%2C_Kuah_Kuning%2C_Ikan_Tude_Bakar_2.jpg","Papeda adalah makanan berupa bubur sagu khas Maluku dan Papua yang biasanya disajikan dengan ikan tongkol atau mubara yang dibumbui dengan kunyit.","Papua","Sagu","Rp.5.000 - 10.000"}
    };

    public static ArrayList<Makanan> getListData(){
        Makanan makanan;
        ArrayList<Makanan> list = new ArrayList<>();

        for(String[] aData : data){
            makanan = new Makanan();
            makanan.setName(aData[0]);
            makanan.setRemarks(aData[1]);
            makanan.setPhoto(aData[2]);
            makanan.setDetail(aData[3]);
            makanan.setKota(aData[4]);
            makanan.setBahan(aData[5]);
            makanan.setHarga(aData[6]);

            list.add(makanan);
        }

        return list;
    }
}

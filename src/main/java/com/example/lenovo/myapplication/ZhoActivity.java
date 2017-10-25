package com.example.lenovo.myapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Ummie on 22-Oct-17.
 */

public class ZhoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zho);


        TextView txtdetails = (TextView) findViewById(R.id.textdetail3);
        txtdetails.setText(
                "Makhraj Huruf Sifat Huruf ﻇ (Dho’)\n" +
                        "\n" +
                        "Ujung lidah dikeluarkan sedikit kemudian ditemukan dengan ujung gigi kacip atas\n" +
                        "Tahap huruf : kuat\n" +
                        "\n" +
                        "Makhraj am: al-lisani ( lidah )\n" +
                        "Makhraj khas: membawa hujung lidah keluar sedikit kemudian ditemukan dengan hujung gigi hadapan (gigi kacip) sebelah atas. pangkal lidah ditekan ke lelangit .\n" +
                        "\n" +
                        "1. Sifat huruf : jahr ( sifat kuat )\n" +
                        "Bahasa : nyata /nyaring/terang\n" +
                        "Istilah : nafas tertahan semasa menyebut hurufnya disebabkan tekanan yang kuat pada makhrajnya.\n" +
                        "\n" +
                        "2. Sifat huruf : ismat ( sifat pertengahan )\n" +
                        "Bahasa : tertegah atau tertahan lidah\n" +
                        "Istilah:tertegah daripada segera keluar ketika melafazkan huruf. \n" +
                        "suara huruf yang bersifat ismat dilaksanakan tersekat-sekat kerana hurufnya dikeluarkan jauh dari bahagian pinggir lidah atau pinggir bibir.\n" +
                        "\n" +
                        "3 .sifat huruf : isti’la’ (sifat kuat )\n" +
                        "Bahasa : tinggi atau terangkat\n" +
                        "Istilah: semasa menyebut hurufnya, sebahagian besar pangkal lidah terangkat ke lelangit.\n" +
                        "huruf yang kuat ditafkhimkan selepas ﻄ,ﺽ,ﺺ karena padanya terdapat itbaq.\n" +
                        "\n" +
                        "4. Sifat huruf : itbaq ( sifat kuat )\n" +
                        "Bahasa : menghimpit/melekapkan/melekat\n" +
                        "Istilah : melekapkan tepi lidah ke lelangit semasa menyebut hurufnya yg menyebabkan suara terhimpit antara kedua-duanya.\n" +
                        "sifat bacaan yang lebih kuat dari isti’la’\n" +
                        "huruf itbaq yang kuat selepas ﻄ,ﺽ,ﺺ\n" +
                        "\n" +
                        "5 . Sifat huruf : rakhawah ( sifat lemah )\n" +
                        "Bahasa : lembut\n" +
                        "Istilah : suara terlepas ketika menyebut hurufnya kerana tekanan yang lemah pada makhrajnya.\n" +
                        "dapat dikesan dgn adanya suara yg dilepaskan tanpa tersekat-sekat semasa menyebut hurufnya sama ada hurufnya berbaris atau sukun.");

        txtdetails.setMovementMethod(new ScrollingMovementMethod());

    }
}
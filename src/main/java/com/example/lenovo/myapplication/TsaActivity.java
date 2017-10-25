package com.example.lenovo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by lenovo on 22-Oct-17.
 */

public class TsaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tsa);


        TextView txtdetails = (TextView) findViewById(R.id.textdetail1);
        txtdetails.setText(
                "Makhraj Huruf Sifat Huruf ﺚ (Tsa’)\n" +
                        "\n" +
                        "Ujung lidah dikeluarkan sedikit kemudian ditemukan dengan ujung gigi kacip atas\n" +
                        "Tahap huruf : paling lemah\n" +
                        "\n" +
                        "Makhraj am: al-lisani ( lidah )\n" +
                        "Makhraj khas: membawa hujung lidah keluar sedikit kemudian ditemukan dengan hujung gigi hadapan (gigi kacip) sebelah atas\n" +
                        "\n" +
                        "1. Sifat huruf : ismat ( sifat pertengahan )\n" +
                        "Bahasa : tertegah atau tertahan lidah istilah: tertegah daripada segera keluar ketika melafazkan huruf.\n" +
                        "suara huruf yang bersifat ismat dilaksanakan tersekat-sekat kerana hurufnya dikeluarkan jauh dari bahagian pinggir lidah atau pinggir bibir.\n" +
                        "\n" +
                        "2. Sifat huruf : hams( sifat lemah )\n" +
                        "Bahasa : senyap atau tersembunyi\n" +
                        "Istilah : nafas/udara terlepas semasa menyebut hurufnya kerana lemahnya ia berpegang pada makhrajnya.\n" +
                        "antara huruf hamas yang paling lemah.\n" +
                        "\n" +
                        "3. Sifat huruf : rakhawah ( sifat lemah )\n" +
                        "Bahasa : lembut\n" +
                        "Istilah : suara terlepas ketika menyebut hurufnya kerana tekanan yang lemah pada makhrajnya.\n" +
                        "dapat dikesan dgn adanya suara yg dilepaskan tanpa tersekat-sekat semasa menyebut hurufnya sama ada hurufnya berbaris atau sukun.\n" +
                        "\n" +
                        "4. Sifat huruf : istifal ( sifat lemah )\n" +
                        "Bahasa : merendah/menurun\n" +
                        "Istilah : merendahkan lidah dalam keadaan mendatar ketika menyebutnya.\n" +
                        "Sebutan huruf hendaklah ditarqiqkan ( dinipiskan ) sama ada dlm keadaan berbaris atau sukun.\n" +
                        "\n" +
                        "5. Sifat huruf : infitah (sifat lemah )\n" +
                        "Bahasa : renggang dan terbuka\n" +
                        "Istilah : berjauhan lidah drpd lelangit yg menyebabkan suara dilepaskan dgn lapang dan terbuka.\n" +
                        "melahirkan suara yang ringan dan tipis");

        txtdetails.setMovementMethod(new ScrollingMovementMethod());

    }
}



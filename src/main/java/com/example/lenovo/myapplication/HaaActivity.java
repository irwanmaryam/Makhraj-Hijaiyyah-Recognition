package com.example.lenovo.myapplication;

/**
 * Created by lenovo on 26-Oct-17.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by lenovo on 22-Oct-17.
 */

public class HaaActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haa);

        TextView txtdetails = (TextView) findViewById(R.id.textdetail);
        txtdetails.setText(
                "Tahap huruf : paling lemah\n" +
                "\n" +
                "Makhraj am: al-haq ( kerongkong )\n" +
                "Makhraj khas: menekan suara ke tengah halkum / kerongkong di mana dinding halkum yg merupakan tempat laluan suara akan disempitkan.\n" +
                "\n" +
                "1. Sifat huruf : ismat ( sifat pertengahan )\n" +
                "Bahasa : tertegah atau tertahan lidah\n" +
                "Istilah: tertegah daripada segera keluar ketika melafazkan huruf.\n" +
                "suara huruf yang bersifat ismat dilaksanakan tersekat-sekat kerana hurufnya dikeluarkan jauh dari bahagian pinggir lidah atau pinggir bibir.\n" +
                "\n" +
                "2. Sifat huruf : hams ( sifat lemah )\n" +
                "Bahasa : senyap atau tersembunyi\n" +
                "Istilah : nafas/udara terlepas semasa menyebut hurufnya kerana lemahnya ia berpegang pada makhrajnya.\n" +
                "antara huruf hamas yang paling lemah.\n" +
                "\n" +
                "3. Sifat huruf : istifal ( sifat lemah )\n" +
                "Bahasa : merendah/menurun\n" +
                "Istilah : merendahkan lidah dlm keadaan mendatar ketika menyebutnya.\n" +
                "sebutan huruf hendaklah ditarqiqkan ( dinipiskan ) sama ada dalam keadaan berbaris atau sukun.\n" +
                "\n" +
                "4 . Sifat huruf : rakhawah ( sifat lemah )\n" +
                "Bahasa : lembut\n" +
                "Istilah : suara terlepas ketika menyebut hurufnya kerana tekanan yang lemah pada makhrajnya.\n" +
                "dapat dikesan dgn adanya suara yg dilepaskan tanpa tersekat-sekat semasa menyebut hurufnya sama ada hurufnya berbaris atau sukun.\n" +
                "\n" +
                "5. Sifat huruf : infitah (sifat lemah )\n" +
                "Bahasa : renggang dan terbuka\n" +
                "Istilah : berjauhan lidah drpd lelangit yg menyebabkan suara dilepaskan dgn lapang dan terbuka.\n" +
                "melahirkan suara yang ringan dan tipis ");

                txtdetails.setMovementMethod(new ScrollingMovementMethod());

    }
}
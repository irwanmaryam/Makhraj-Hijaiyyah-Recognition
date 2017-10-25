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

public class DzaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dza);

        TextView txtdetails = (TextView) findViewById(R.id.textdetail2);
        txtdetails.setText(
                "Makhraj Huruf Sifat Huruf ﺬ (Dzal)\n" +
                        "\n" +
                        "Ujung lidah dikeluarkan sedikit kemudian ditemukan dgn hujung gigi kacip atas\n" +
                        "Tahap huruf : lemah\n" +
                        "\n" +
                        "Makhraj am: al-lisani ( lidah )\n" +
                        "Makhraj khas: membawa hujung lidah keluar sedikit kemudian ditemukan dengan hujung gigi hadapan (gigi kacip) sebelah atas\n" +
                        "\n" +
                        "1. Sifat huruf : jahr ( sifat kuat )\n" +
                        "Bahasa : nyata /nyaring/terang\n" +
                        "Istilah : nafas tertahan semasa menyebut hurufnya disebabkan tekanan yang kuat pada makhrajnya.\n" +
                        "\n" +
                        "2. Sifat huruf : ismat ( sifat pertengahan )\n" +
                        "Bahasa : tertegah atau tertahan lidah\n" +
                        "Istilah: tertegah daripada segera keluar ketika melafazkan huruf.\n" +
                        "suara huruf yang bersifat ismat dilaksanakan tersekat-sekat kerana hurufnya dikeluarkan jauh dari bahagian pinggir lidah atau pinggir bibir.\n" +
                        "\n" +
                        "3. Sifat huruf : infitah (sifat lemah )\n" +
                        "Bahasa : renggang dan terbuka\n" +
                        "Istilah : berjauhan lidah drpd lelangit yg menyebabkan suara dilepaskan dgn lapang dan terbuka.\n" +
                        "melahirkan suara yang ringan dan tipis\n" +
                        "\n" +
                        "4. Sifat huruf :istifal ( sifat lemah )\n" +
                        "Bahasa : merendah/menurun\n" +
                        "Istilah : merendahkan lidah dlm keadaan mendatar ketika menyebutnya.\n" +
                        "sebutan huruf hendaklah ditarqiqkan ( dinipiskan ) sama ada dalam keadaan berbaris atau sukun.\n" +
                        "\n" +
                        "5 . Sifat huruf : rakhawah ( sifat lemah )\n" +
                        "Bahasa : lembut\n" +
                        "Istilah : suara terlepas ketika menyebut hurufnya kerana tekanan yang lemah pada makhrajnya.\n" +
                        "dapat dikesan dgn adanya suara yg dilepaskan tanpa tersekat-sekat semasa menyebut hurufnya sama ada hurufnya berbaris atau sukun.");

        txtdetails.setMovementMethod(new ScrollingMovementMethod());

    }
}




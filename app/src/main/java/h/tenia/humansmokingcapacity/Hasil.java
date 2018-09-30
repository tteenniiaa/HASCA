package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);

        final Button btngejala = (Button) findViewById(R.id.btnmenu);
        final Button btnHsl1 = (Button) findViewById(R.id.hslBtn1);
        final Button btnHsl2 = (Button) findViewById(R.id.hslBtn2);
        final Button btnHsl3 = (Button) findViewById(R.id.hslBtn3);
        final Button btnHsl4 = (Button) findViewById(R.id.hslBtn4);
        final Button btnHsl5 = (Button) findViewById(R.id.hslBtn5);
        final Button btnHsl6 = (Button) findViewById(R.id.hslBtn6);
        final Button btnHsl7 = (Button) findViewById(R.id.hslBtn7);
        final Button btnHsl8 = (Button) findViewById(R.id.hslBtn8);
        final Button btnHsl9 = (Button) findViewById(R.id.hslBtn9);
        final Button btnHsl10 = (Button) findViewById(R.id.hslBtn10);
        final Button btnHsl11 = (Button) findViewById(R.id.hslBtn11);
        final Button btnHsl12 = (Button) findViewById(R.id.hslBtn12);


        btngejala.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View argo) {
                                             //TODO Auto-generated methot stub

                                             Intent g = new Intent(getApplicationContext(), Mainmenu.class);
                                             startActivity(g);
                                         }
                                     }
        );
        btnHsl1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p1 = new Intent(getApplicationContext(), Penyakit1.class);
                                           startActivity(p1);
                                       }
                                   }
        );
        btnHsl2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p2 = new Intent(getApplicationContext(), Penyakit2.class);
                                           startActivity(p2);
                                       }
                                   }
        );
        btnHsl3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p3 = new Intent(getApplicationContext(), Penyakit3.class);
                                           startActivity(p3);
                                       }
                                   }
        );
        btnHsl4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p4 = new Intent(getApplicationContext(), Penyakit4.class);
                                           startActivity(p4);
                                       }
                                   }
        );
        btnHsl5.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p5 = new Intent(getApplicationContext(), Penyakit5.class);
                                           startActivity(p5);
                                       }
                                   }
        );
        btnHsl6.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p6 = new Intent(getApplicationContext(), Penyakit6.class);
                                           startActivity(p6);
                                       }
                                   }
        );
        btnHsl7.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p7 = new Intent(getApplicationContext(), Penyakit7.class);
                                           startActivity(p7);
                                       }
                                   }
        );
        btnHsl8.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p8 = new Intent(getApplicationContext(), Penyakit8.class);
                                           startActivity(p8);
                                       }
                                   }
        );
        btnHsl9.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p9 = new Intent(getApplicationContext(), Penyakit9.class);
                                           startActivity(p9);
                                       }
                                   }
        );
        btnHsl10.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View argo) {
                                           //TODO Auto-generated methot stub

                                           Intent p10 = new Intent(getApplicationContext(), Penyakit10.class);
                                           startActivity(p10);
                                       }
                                   }
        );
        btnHsl11.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View argo) {
                                            //TODO Auto-generated methot stub

                                            Intent p11 = new Intent(getApplicationContext(), Penyakit11.class);
                                            startActivity(p11);
                                        }
                                    }
        );
        btnHsl12.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View argo) {
                                            //TODO Auto-generated methot stub

                                            Intent p12 = new Intent(getApplicationContext(), Penyakit12.class);
                                            startActivity(p12);
                                        }
                                    }
        );
    }
}

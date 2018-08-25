package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Mainmenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        final LinearLayout btnPeriksa = (LinearLayout) findViewById(R.id.btnPeriksa);
        final LinearLayout btnHasil = (LinearLayout) findViewById(R.id.btnHasil);
        final LinearLayout btnTtg = (LinearLayout) findViewById(R.id.btnTtg);

        btnTtg.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View argo) {
                                              //TODO Auto-generated methot stub

                                              Intent i = new Intent (getApplicationContext(), Tentang.class);
                                              startActivity(i);
                                          }
                                      }
        );

        btnPeriksa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argo) {
                //TODO Auto-generated methot stub

                Intent j = new Intent (getApplicationContext(), Konsultasi.class);
                startActivity(j);
            }
        }
        );
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argo) {
                //TODO Auto-generated methot stub

                Intent k = new Intent (getApplicationContext(), Hasil.class);
                startActivity(k);
            }
        }
        );
    }
}

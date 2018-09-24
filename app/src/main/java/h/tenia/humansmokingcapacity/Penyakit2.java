package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Penyakit2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit2);
        final LinearLayout btnselanjutnya = (LinearLayout) findViewById(R.id.btnselanjutnya);
        final LinearLayout btnsebelumnya = (LinearLayout) findViewById(R.id.btnsebelumnya);

        btnselanjutnya.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View argo) {
                                                  //TODO Auto-generated methot stub

                                                  Intent next = new Intent (getApplicationContext(), Penyakit3.class);
                                                  startActivity(next);
                                                  finish();
                                              }
                                          }
        );
        btnsebelumnya.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View argo) {
                                                 //TODO Auto-generated methot stub

                                                 Intent prev = new Intent (getApplicationContext(), Penyakit1.class);
                                                 startActivity(prev);
                                                 finish();
                                             }
                                         }
        );
    }
}

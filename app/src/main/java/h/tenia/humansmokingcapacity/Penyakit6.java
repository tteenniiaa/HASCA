package h.tenia.humansmokingcapacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Penyakit6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit6);
        final View btnselanjutnya = findViewById(R.id.btnselanjutnya);
        final View btnsebelumnya = findViewById(R.id.btnsebelumnya);

        btnselanjutnya.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View argo) {
                                                  //TODO Auto-generated methot stub

                                                  Intent next = new Intent (getApplicationContext(), Penyakit7.class);
                                                  startActivity(next);
                                                  finish();
                                              }
                                          }
        );
        btnsebelumnya.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View argo) {
                                                 //TODO Auto-generated methot stub

                                                 Intent prev = new Intent (getApplicationContext(), Penyakit5.class);
                                                 startActivity(prev);
                                                 finish();
                                             }
                                         }
        );
    }
}

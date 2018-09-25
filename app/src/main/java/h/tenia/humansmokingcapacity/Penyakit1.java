package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import h.tenia.humansmokingcapacity.accountcreation.Inputgejala;

public class Penyakit1 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit1);
        final View btnselanjutnya = findViewById(R.id.btnselanjutnya);
        final View btnsebelumnya = findViewById(R.id.btnsebelumnya);

        btnselanjutnya.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View argo) {
                                                  //TODO Auto-generated methot stub

                                                  Intent next = new Intent (getApplicationContext(), Penyakit2.class);
                                                  startActivity(next);
                                                  finish();
                                              }
                                          }
        );

    }
}

package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class Inputgejala extends Activity {
    ArrayList<String> Selection = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputgejala);


        final LinearLayout btnlihanhasil = (LinearLayout) findViewById(R.id.btnlihathasil);

        btnlihanhasil.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View argo) {
                                              //TODO Auto-generated methot stub

                                              Intent m = new Intent (getApplicationContext(), Hasil.class);
                                              startActivity(m);
                                          }
                                      }

        );

    }

    public void SelectItem(View view) {


    }

    public void FinalSelection(View view) {
    }
}

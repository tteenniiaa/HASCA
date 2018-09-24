package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Hasil extends Activity {


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
    }
}

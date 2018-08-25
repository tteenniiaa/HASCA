package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Konsultasi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);

        final LinearLayout btnselanjutnya = (LinearLayout) findViewById(R.id.btnselanjutnya);
        btnselanjutnya.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View argo) {
                                          //TODO Auto-generated methot stub

                                          Intent z = new Intent (getApplicationContext(), Inputgejala.class);
                                          startActivity(z);
                                      }
                                  }
        );
    }
}

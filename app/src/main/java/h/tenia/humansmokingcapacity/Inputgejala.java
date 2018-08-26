package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class Inputgejala extends Activity {
    ArrayList<String> Selection = new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputgejala);
        final_text = (TextView) findViewById(R.id.tvhasilgejala);
        final_text.setEnabled(false);

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
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.CBGP01:
                if (checked) {
                    Selection.add("Batuk terus menerus atau semakin parahh");}
                else
                {
                    Selection.remove("Batuk terus menerus atau semakin parah");
                }
                break;
            case R.id.CBGP02:
                if (checked) {
                    Selection.add("Batuk lebih dari 2 minggu");}
                else
                {
                    Selection.remove("Batuk lebih dari 2 minggu");
                }
                break;
        }
    }
    public void FinalSelection(View view) {
        String final_gejala_selection = "";
            for(String Selections : Selection)
            {
                final_gejala_selection = final_gejala_selection + Selections + "\n";
            }
                final_text.setText(final_gejala_selection);
                final_text.setEnabled(true);
    }
}

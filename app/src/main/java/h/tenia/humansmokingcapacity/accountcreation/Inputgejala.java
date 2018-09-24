package h.tenia.humansmokingcapacity.accountcreation;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import h.tenia.humansmokingcapacity.R;

public class Inputgejala extends AppCompatActivity {
    Button mInput ;
    TextView mTvhasil ;
    String [] listgejala;
    boolean [] checkedgejala;
    ArrayList <Integer> mUserGejala = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_gejala);

        mInput = (Button) findViewById(R.id.btinputgejala);
        mTvhasil = (TextView) findViewById(R.id.tvhasil);

        listgejala = getResources().getStringArray(R.array.gejala);
        checkedgejala = new boolean[listgejala.length];

        mInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Inputgejala.this);
                mBuilder.setTitle("Silahkan pilih gejala :");
                mBuilder.setMultiChoiceItems(listgejala, checkedgejala, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if (isChecked) {
                            if (!mUserGejala.contains(position)) {
                                mUserGejala.add(position);
                            } else if (mUserGejala.contains(position)) {
                                mUserGejala.remove(position);
                            }
                        }
                    }
                });
                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String gejala = " ";
                        for (int i = 0; i < mUserGejala.size(); i++) {
                            gejala = gejala + listgejala [mUserGejala.get(i)];
                            if (i != mUserGejala.size() -1){
                                gejala = gejala + ", ";
                            }
                        }
                        mTvhasil.setText(gejala);
                    }
                });
                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                mBuilder.setNeutralButton("Clear all", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        for (i = 0; i < checkedgejala.length; i++){
                            checkedgejala[i] = false;
                            mUserGejala.clear();
                            mTvhasil.setText("");
                        }
                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }
}

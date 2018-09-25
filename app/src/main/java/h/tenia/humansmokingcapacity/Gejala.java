package h.tenia.humansmokingcapacity;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Gejala extends AppCompatActivity implements View.OnClickListener {
    Cursor model = null;
    myDatabase helper = null;
    Button cmdS1, cmdS2, cmdS3, cmdS4, cmdS5, cmdS6, cmdS7, cmdS8, cmdS9, cmdS10, cmdS11, cmdS12;

    int[] arrG = new int[12];
    int[] arrN = new int[12];

    int P1 = 0, P2 = 0, P3 = 0, P4 = 0, P5 = 0, P6 = 0, P7 = 0, P8 = 0, P9 = 0, P10 = 0, P11 = 0, P12 = 0;

    String[] arrG1 = new String[10];
    String[] arrG16 = new String[10];
    String[] arrG2 = new String[10];
    String[] arrG17 = new String[10];
    String[] arrG3 = new String[10];
    String[] arrG18 = new String[10];
    String[] arrG4 = new String[10];
    String[] arrG19 = new String[10];
    String[] arrG5 = new String[10];
    String[] arrG20 = new String[10];
    String[] arrG6 = new String[10];
    String[] arrG21 = new String[10];
    String[] arrG7 = new String[10];
    String[] arrG22 = new String[10];
    String[] arrG8 = new String[10];
    String[] arrG23 = new String[10];
    String[] arrG9 = new String[10];
    String[] arrG24 = new String[10];
    String[] arrG10 = new String[10];
    String[] arrG25 = new String[10];
    String[] arrG11 = new String[10];
    String[] arrG26 = new String[10];
    String[] arrG12 = new String[10];
    String[] arrG27 = new String[10];
    String[] arrG13 = new String[10];
    String[] arrG28 = new String[10];
    String[] arrG14 = new String[10];
    String[] arrG29 = new String[10];
    String[] arrG15 = new String[10];
    String[] arrG30 = new String[10];

    String[] arrG31 = new String[10];
    String[] arrG46 = new String[10];
    String[] arrG32 = new String[10];
    String[] arrG47 = new String[10];
    String[] arrG33 = new String[10];
    String[] arrG48 = new String[10];
    String[] arrG34 = new String[10];
    String[] arrG49 = new String[10];
    String[] arrG35 = new String[10];
    String[] arrG50 = new String[10];
    String[] arrG36 = new String[10];
    String[] arrG51 = new String[10];
    String[] arrG37 = new String[10];
    String[] arrG52 = new String[10];
    String[] arrG38 = new String[10];
    String[] arrG39 = new String[10];
    String[] arrG40 = new String[10];
    String[] arrG41 = new String[10];
    String[] arrG42 = new String[10];
    String[] arrG43 = new String[10];
    String[] arrG44 = new String[10];
    String[] arrG45 = new String[10];

    int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0, a10 = 0,
            a11 = 0, a12 = 0, a13 = 0, a14 = 0, a15 = 0, a16 = 0, a17 = 0, a18 = 0, a19 = 0, a20 = 0,
            a21 = 0, a22 = 0, a23 = 0, a24 = 0, a25 = 0, a26 = 0, a27 = 0, a28 = 0, a29 = 0, a30 = 0,
            a31 = 0, a32 = 0, a33 = 0, a34 = 0, a35 = 0, a36 = 0, a37 = 0, a38 = 0, a39 = 0, a40 = 0, a41 = 0,
            a42 = 0, a43 = 0, a44 = 0, a45 = 0, a46 = 0, a47 = 0, a48 = 0, a49 = 0, a50 = 0, a51 = 0, a52 = 0;

    TextView txtHasil;
    RadioGroup RadioGroup1;
    RadioButton RadioButton1, RadioButton2, RadioButton3, RadioButton4, RadioButton5, RadioButton6, RadioButton7,
            RadioButton8, RadioButton9, RadioButton10, RadioButton11, RadioButton12, RadioButton13, RadioButton14, RadioButton15,
            RadioButton16, RadioButton17, RadioButton18, RadioButton19, RadioButton20, RadioButton21, RadioButton22, RadioButton23,
            RadioButton24, RadioButton25, RadioButton26, RadioButton27, RadioButton28, RadioButton29, RadioButton30, RadioButton31,
            RadioButton32, RadioButton33, RadioButton34, RadioButton35, RadioButton36, RadioButton37, RadioButton38, RadioButton39,
            RadioButton40, RadioButton41, RadioButton42, RadioButton43, RadioButton44, RadioButton45, RadioButton46, RadioButton47,
            RadioButton48, RadioButton49, RadioButton50, RadioButton51, RadioButton52;
    View cmdPilih;
    CheckBox ckPilih1, ckPilih2, ckPilih3, ckPilih4, ckPilih5, ckPilih6, ckPilih7, ckPilih8, ckPilih9, ckPilih10,
            ckPilih11, ckPilih12, ckPilih13, ckPilih14, ckPilih15, ckPilih16, ckPilih17, ckPilih18, ckPilih19, ckPilih20,
            ckPilih21, ckPilih22, ckPilih23, ckPilih24, ckPilih25, ckPilih26, ckPilih27, ckPilih28, ckPilih29, ckPilih30,
            ckPilih31, ckPilih32, ckPilih33, ckPilih34, ckPilih35, ckPilih36, ckPilih37, ckPilih38, ckPilih39, ckPilih40,
            ckPilih41, ckPilih42, ckPilih43, ckPilih44, ckPilih45, ckPilih46, ckPilih47, ckPilih48, ckPilih49, ckPilih50,
            ckPilih51, ckPilih52;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gejala);

        helper = new myDatabase(this);
        arrG[0] = 8;
        arrG[1] = 4;
        arrG[2] = 6;
        arrG[3] = 4;
        arrG[4] = 8;
        arrG[5] = 4;
        arrG[6] = 4;
        arrG[7] = 5;
        arrG[8] = 9;
        arrG[9] = 10;
        arrG[10] = 6;
        arrG[11] = 7;


        for (int i = 0; i < 11; i++) {
            arrN[i] = 0;
        }
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        ckPilih1 = (CheckBox) findViewById(R.id.gejala1);
        ckPilih2 = (CheckBox) findViewById(R.id.gejala2);
        ckPilih3 = (CheckBox) findViewById(R.id.gejala3);
        ckPilih4 = (CheckBox) findViewById(R.id.gejala4);
        ckPilih5 = (CheckBox) findViewById(R.id.gejala5);
        ckPilih6 = (CheckBox) findViewById(R.id.gejala6);
        ckPilih7 = (CheckBox) findViewById(R.id.gejala7);
        ckPilih8 = (CheckBox) findViewById(R.id.gejala8);
        ckPilih9 = (CheckBox) findViewById(R.id.gejala9);
        ckPilih10 = (CheckBox) findViewById(R.id.gejala10);
        ckPilih11 = (CheckBox) findViewById(R.id.gejala11);
        ckPilih12 = (CheckBox) findViewById(R.id.gejala12);
        ckPilih13 = (CheckBox) findViewById(R.id.gejala13);
        ckPilih14 = (CheckBox) findViewById(R.id.gejala14);
        ckPilih15 = (CheckBox) findViewById(R.id.gejala15);
        ckPilih16 = (CheckBox) findViewById(R.id.gejala16);
        ckPilih17 = (CheckBox) findViewById(R.id.gejala17);
        ckPilih18 = (CheckBox) findViewById(R.id.gejala18);
        ckPilih19 = (CheckBox) findViewById(R.id.gejala19);
        ckPilih20 = (CheckBox) findViewById(R.id.gejala20);
        ckPilih21 = (CheckBox) findViewById(R.id.gejala21);
        ckPilih22 = (CheckBox) findViewById(R.id.gejala22);
        ckPilih23 = (CheckBox) findViewById(R.id.gejala23);
        ckPilih24 = (CheckBox) findViewById(R.id.gejala24);
        ckPilih25 = (CheckBox) findViewById(R.id.gejala25);
        ckPilih26 = (CheckBox) findViewById(R.id.gejala26);
        ckPilih27 = (CheckBox) findViewById(R.id.gejala27);
        ckPilih28 = (CheckBox) findViewById(R.id.gejala28);
        ckPilih29 = (CheckBox) findViewById(R.id.gejala29);
        ckPilih30 = (CheckBox) findViewById(R.id.gejala30);
        ckPilih31 = (CheckBox) findViewById(R.id.gejala31);
        ckPilih32 = (CheckBox) findViewById(R.id.gejala32);
        ckPilih33 = (CheckBox) findViewById(R.id.gejala33);
        ckPilih34 = (CheckBox) findViewById(R.id.gejala34);
        ckPilih35 = (CheckBox) findViewById(R.id.gejala35);
        ckPilih36 = (CheckBox) findViewById(R.id.gejala36);
        ckPilih37 = (CheckBox) findViewById(R.id.gejala37);
        ckPilih38 = (CheckBox) findViewById(R.id.gejala38);
        ckPilih39 = (CheckBox) findViewById(R.id.gejala39);
        ckPilih40 = (CheckBox) findViewById(R.id.gejala40);
        ckPilih41 = (CheckBox) findViewById(R.id.gejala41);
        ckPilih42 = (CheckBox) findViewById(R.id.gejala42);
        ckPilih43 = (CheckBox) findViewById(R.id.gejala43);
        ckPilih44 = (CheckBox) findViewById(R.id.gejala44);
        ckPilih45 = (CheckBox) findViewById(R.id.gejala45);
        ckPilih46 = (CheckBox) findViewById(R.id.gejala46);
        ckPilih47 = (CheckBox) findViewById(R.id.gejala47);
        ckPilih48 = (CheckBox) findViewById(R.id.gejala48);
        ckPilih49 = (CheckBox) findViewById(R.id.gejala49);
        ckPilih50 = (CheckBox) findViewById(R.id.gejala50);
        ckPilih51 = (CheckBox) findViewById(R.id.gejala51);
        ckPilih52 = (CheckBox) findViewById(R.id.gejala52);


        ckPilih1.setText("Batuk terus menerus atau semakin parah");
        ckPilih2.setText("Batuk lebih dari 2 minggu");
        ckPilih3.setText("Nyeri dada, bahu, punggung yang tidak berhubungan nyeri akibat batuk");
        ckPilih4.setText("Perubahan warna pada dahak");
        ckPilih5.setText("Meningkatnya jumlah dahak");
        ckPilih6.setText("Dahak Berdarah");
        ckPilih7.setText("Bunyi menciut-ciut saat bernafas bukan pada penderita asma");
        ckPilih8.setText("Radang yang kambuh");
        ckPilih9.setText("Sulit nafas/ sesak");
        ckPilih10.setText("Nafas pendek atau tidak normal");
        ckPilih11.setText("Suara serak");
        ckPilih12.setText("Suara kasar saat bernafas");
        ckPilih13.setText("Seringnya merasa lelah (kronis)");
        ckPilih14.setText("Sakit kepala, nyeri tulang, sakit yang menyertainya");
        ckPilih15.setText("Terjadi rasa keretakan tulang bukan karena kecelakaan");
        ckPilih16.setText("Adanya lebab maupun bengkak pada leher/wajah");
        ckPilih17.setText("Menurunnya berat badan yang tidak diketahui penyebabnya");
        ckPilih18.setText("Mulai kehilangan kestabilan saat berjalan");
        ckPilih19.setText("Seringnya lupa");
        ckPilih20.setText("Kulit Kusam");
        ckPilih21.setText("Indra Penciuman dan perasa yang menurun");
        ckPilih22.setText("Jam tidur yang berantakan");
        ckPilih23.setText("Seringnya terkena flu");
        ckPilih24.setText("Adanya bercak warna putih pada mulut");
        ckPilih25.setText("Kerongkongan terasa perih");
        ckPilih26.setText("Kesulitan Menelan");
        ckPilih27.setText("Demam Tinggi dan Menggigil");
        ckPilih28.setText("Dada sesak, nyeri, dan berat");
        ckPilih29.setText("Detak jantung cepat");
        ckPilih30.setText("Mudah Dehidrasi/ nafsu makan menurun");
        ckPilih31.setText("Denyut jantung tidak stabil (Cepat/Lamat)");
        ckPilih32.setText("Tekanan darah tidak stabil");
        ckPilih33.setText("Pembekuan aliran darah di beberapa tubuh");
        ckPilih34.setText("Sering tersengal-sengal");
        ckPilih35.setText("Keluar Lendir dari hidung terus menerus");
        ckPilih36.setText("Kesulitan untuk menganalisa informasi dengan cepat");
        ckPilih37.setText("Kulit mudah iritasi dan terluka");
        ckPilih38.setText("Mudah terkena penyakit gatal");
        ckPilih39.setText("Timbul bercak tidak rasa seperti pigmentasi");
        ckPilih40.setText("Sakit kepala yang tiba-tiba");
        ckPilih41.setText("Seringnya buang gas");
        ckPilih42.setText("Nyeri dan sering mual pada bagian sekitar perut");
        ckPilih43.setText("Ketajaman penglihatan menurun");
        ckPilih44.setText("Sering mengantuk");
        ckPilih45.setText("Gigi berwarna kuning, sering ngilu atau sensitif");
        ckPilih46.setText("Ukuran Payudara yang semakin mengecil");
        ckPilih47.setText("eluar cairan bening atau darah dari puting payudara");
        ckPilih48.setText("Puting payudara masuk kedalam");
        ckPilih49.setText("Pembengkakan kemerahan pada payurdara");
        ckPilih50.setText("Terjadi keputihan yang berlebihan dan berbau");
        ckPilih51.setText("Nyeri ketika buang air kecil");
        ckPilih52.setText("Sering bunag air kecil / sulit buang air kecil");


        cmdPilih = findViewById(R.id.btnPenyakit);
        cmdPilih.setOnClickListener(this); //new myproses()

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPenyakit:
                if (ckPilih1.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                }
                if (ckPilih2.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                }
                if (ckPilih3.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih4.isChecked()) {
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                }
                if (ckPilih5.isChecked()) {
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                }
                if (ckPilih6.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                }
                if (ckPilih7.isChecked()) {
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                }
                if (ckPilih8.isChecked()) {
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                }
                if (ckPilih9.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih10.isChecked()) {
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih11.isChecked()) {
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih12.isChecked()) {
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                }
                if (ckPilih13.isChecked()) {
                    P7 = 7;
                    arrN[6] = arrN[6] + 1;
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih14.isChecked()) {
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih15.isChecked()) {
                    P11 = 11;
                    arrN[10] = arrN[10] + 1;
                }
                if (ckPilih16.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih17.isChecked()) {
                    P6 = 6;
                    arrN[5] = arrN[5] + 1;
                }
                if (ckPilih18.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                    P3 = 3;
                    arrN[2] = arrN[2] + 1;
                    P7 = 7;
                    arrN[6] = arrN[6] + 1;
                }
                if (ckPilih19.isChecked()) {
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih20.isChecked()) {
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih21.isChecked()) {
                    P8 = 8;
                    arrN[7] = arrN[7] + 1;
                }
                if (ckPilih22.isChecked()) {
                    P7 = 7;
                    arrN[6] = arrN[6] + 1;
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih23.isChecked()) {
                    P1 = 1;
                    arrN[0] = arrN[0] + 1;
                }
                if (ckPilih24.isChecked()) {
                    P8 = 8;
                    arrN[7] = arrN[7] + 1;
                }
                if (ckPilih25.isChecked()) {
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                }
                if (ckPilih26.isChecked()) {
                    P6 = 6;
                    arrN[5] = arrN[5] + 1;
                }
                if (ckPilih27.isChecked()) {
                    P5 = 5;
                    arrN[4] = arrN[4] + 1;
                }
                if (ckPilih28.isChecked()) {
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih29.isChecked()) {
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                }
                if (ckPilih30.isChecked()) {
                    P2 = 2;
                    arrN[1] = arrN[1] + 1;
                    P8 = 8;
                    arrN[7] = arrN[7] + 1;
                    P11 = 11;
                    arrN[10] = arrN[10] + 1;
                }
                if (ckPilih31.isChecked()) {
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                    P11 = 11;
                    arrN[10] = arrN[10] + 1;
                }
                if (ckPilih32.isChecked()) {
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih33.isChecked()) {
                    P3 = 3;
                    arrN[2] = arrN[2] + 1;
                }
                if (ckPilih34.isChecked()) {
                    P9 = 9;
                    arrN[8] = arrN[8] + 1;
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih35.isChecked()) {
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih36.isChecked()) {
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                    P12 = 12;
                    arrN[11] = arrN[11] + 1;
                }
                if (ckPilih37.isChecked()) {
                    P11 = 11;
                    arrN[10] = arrN[10] + 1;
                }
                if (ckPilih38.isChecked()) {
                    P11 = 11;
                    arrN[10] = arrN[10] + 1;
                }
                if (ckPilih39.isChecked()) {
                    P8 = 8;
                    arrN[7] = arrN[7] + 1;
                }
                if (ckPilih40.isChecked()) {
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih41.isChecked()) {
                    P6 = 6;
                    arrN[5] = arrN[5] + 1;
                }
                if (ckPilih42.isChecked()) {
                    P2 = 2;
                    arrN[1] = arrN[1] + 1;
                    P4 = 4;
                    arrN[3] = arrN[3] + 1;
                    P6 = 6;
                    arrN[5] = arrN[5] + 1;
                }
                if (ckPilih43.isChecked()) {
                    P10 = 10;
                    arrN[9] = arrN[9] + 1;
                }
                if (ckPilih44.isChecked()) {
                    P7 = 7;
                    arrN[6] = arrN[6] + 1;
                }
                if (ckPilih45.isChecked()) {
                    P8 = 8;
                    arrN[7] = arrN[7] + 1;
                }
                if (ckPilih46.isChecked()) {
                    P3 = 3;
                    arrN[2] = arrN[2] + 1;
                }
                if (ckPilih47.isChecked()) {
                    P3 = 3;
                    arrN[2] = arrN[2] + 1;
                }
                if (ckPilih48.isChecked()) {
                    P3 = 3;
                    arrN[2] = arrN[2] + 1;
                }
                if (ckPilih49.isChecked()) {
                    P3 = 3;
                    arrN[2] = arrN[2] + 1;
                }
                if (ckPilih50.isChecked()) {
                    P4 = 4;
                    arrN[3] = arrN[3] + 1;
                }
                if (ckPilih51.isChecked()) {
                    P2 = 2;
                    arrN[1] = arrN[1] + 1;
                    P4 = 4;
                    arrN[3] = arrN[3] + 1;
                    P11 = 11;
                    arrN[10] = arrN[10] + 1;
                }
                if (ckPilih52.isChecked()) {
                    P2 = 2;
                    arrN[1] = arrN[1] + 1;
                }

                //startActivity (new Intent ("r.tenia.cobaya1.HASIL"));
                setContentView(R.layout.hasil);

                String ket = "(" + arrN[0] + "/" + arrG[0] + ")";
                cmdS1 = (Button) findViewById(R.id.hslBtn1);
                cmdS1.setText("Kanker Paru-Paru " + ket);
                cmdS1.setOnClickListener(new penyakit1());

                ket = "(" + arrN[1] + "/" + arrG[1] + ")";
                cmdS2 = (Button) findViewById(R.id.hslBtn2);
                cmdS2.setText("Kanker Kandung Kemih " + ket);
                cmdS2.setOnClickListener(new penyakit2());

                ket = "(" + arrN[2] + "/" + arrG[2] + ")";
                cmdS3 = (Button) findViewById(R.id.hslBtn3);
                cmdS3.setText("Kanker Payudara " + ket);
                cmdS3.setOnClickListener(new penyakit3());

                ket = "(" + arrN[3] + "/" + arrG[3] + ")";
                cmdS4 = (Button) findViewById(R.id.hslBtn4);
                cmdS4.setText("Kanker Serviks " + ket);
                cmdS4.setOnClickListener(new penyakit4());

                ket = "(" + arrN[4] + "/" + arrG[4] + ")";
                cmdS5 = (Button) findViewById(R.id.hslBtn5);
                cmdS5.setText("Kanker Kerongkongan " + ket);
                cmdS5.setOnClickListener(new penyakit5());

                ket = "(" + arrN[5] + "/" + arrG[5] + ")";
                cmdS6 = (Button) findViewById(R.id.hslBtn6);
                cmdS6.setText("Kanker Pencernaan " + ket);
                cmdS6.setOnClickListener(new penyakit6());

                ket = "(" + arrN[6] + "/" + arrG[6] + ")";
                cmdS7 = (Button) findViewById(R.id.hslBtn7);
                cmdS7.setText("Kanker Ginjal " + ket);
                cmdS7.setOnClickListener(new penyakit7());

                ket = "(" + arrN[7] + "/" + arrG[7] + ")";
                cmdS8 = (Button) findViewById(R.id.hslBtn8);
                cmdS8.setText("Kanker Mulut " + ket);
                cmdS8.setOnClickListener(new penyakit8());

                ket = "(" + arrN[8] + "/" + arrG[8] + ")";
                cmdS9 = (Button) findViewById(R.id.hslBtn9);
                cmdS9.setText("Serangan Jantung " + ket);
                cmdS9.setOnClickListener(new penyakit9());

                ket = "(" + arrN[9] + "/" + arrG[9] + ")";
                cmdS10 = (Button) findViewById(R.id.hslBtn10);
                cmdS10.setText("Hipertensi " + ket);
                cmdS10.setOnClickListener(new penyakit10());

                ket = "(" + arrN[10] + "/" + arrG[10] + ")";
                cmdS11 = (Button) findViewById(R.id.hslBtn11);
                cmdS11.setText("Impotensi " + ket);
                cmdS11.setOnClickListener(new penyakit11());

                ket = "(" + arrN[11] + "/" + arrG[11] + ")";
                cmdS12 = (Button) findViewById(R.id.hslBtn12);
                cmdS12.setText("Penyakit Paru Obstruksi " + ket);
                cmdS12.setOnClickListener(new penyakit12());
        }

    }

    class penyakit1 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Paru-Paru (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Tumor ganas yang berkembang di sistem pernapasan bagian bawah, termasuk sel-sel" +
                    "di dinding bronkus dan bronkiolus. Sekitar 90% pasien pria penderita kanker adalah" +
                    "seorang perokok, selain itu juga paparan terhadap asap rokok secara berkepanjangan" +
                    "juga bisa meningkatkan risiko berkembangnya kanker paru-paru. ");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("Kanker Paru-paru merupakan penyakit Golongan I (Tingkat tinggi), maka solusi " +
                    "untuk human smoking capacity pada gejala penyakit ini adalah :\n" +
                    "Umur  > 18 Tahun = 2 rokok perhari\n" +
                    "Umur 19-28 Tahun = 3 rokok perhari\n" +
                    "Umur 29-37 Tahun = 4 rokok perhari\n" +
                    "Umur 38-46 Tahun = 5 rokok perhari\n");
        }
    }

    class penyakit2 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[1]));
            double val2 = Double.parseDouble(String.valueOf(arrG[1]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Kandung Kemih (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Kandung kemih adalah organ berongga di perut bagian bawah yang menyimpan urine. Bila" +
                    "proses pertumbuhan sel di dalam lapisan kandung kemih menjadi tidak beres, maka kanker" +
                    "kandung kemih bisa terjadi. Kemungkinan perokok terkena kanker ini jauh lebih tinggi" +
                    "dibandingkan non-perokok.");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("Kanker Kandung Kemih merupakan penyakit Golongan I (Tingkat tinggi), maka solusi " +
                    "untuk human smoking capacity pada gejala penyakit ini adalah :\n" +
                    "Umur  > 18 Tahun = 2 rokok perhari\n" +
                    "Umur 19-28 Tahun = 3 rokok perhari\n" +
                    "Umur 29-37 Tahun = 4 rokok perhari\n" +
                    "Umur 38-46 Tahun = 5 rokok perhari\n");
        }
    }

    class penyakit3 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[2]));
            double val2 = Double.parseDouble(String.valueOf(arrG[2]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Payudara (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Kanker payudara merupakan kanker ganas yang berkembang di dalam payudara. Jika sel-sel" +
                    "di dalam kelenjar susu membelah diri dan berkembang secara tidak terkendali, maka dapat" +
                    "menyebabkan kanker jinak maupun ganas. Penyebabnya belum diketahui, tapi hal tersebut bisa" +
                    "saja diakibatkan dari riwayat keluarga, radiasi sinar X ke payudara, merokok, alkohol,dll.");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("Kanker Payudara merupakan penyakit Golongan II (Tingkat sedang), maka solusi untuk human " +
                    "smoking capacity pada gejala penyakit ini adalah :\n" +
                    "Umur  < 18 Tahun = 3 rokok perhari\n" +
                    "Umur 19-28 Tahun = 4 rokok perhari\n" +
                    "Umur 28-38 Tahun = 5 rokok perhari\n" +
                    "Umur 39-49 Tahun = 7 rokok perhari\n");
        }
    }

    class penyakit4 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[3]));
            double val2 = Double.parseDouble(String.valueOf(arrG[3]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Serviks (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Penyakit kanker serviks disebabkan oleh virus papilome manusia (HPV atau keluarga virus" +
                    "yang menginfeksi kulit dan selaput mukosa yang melapisi tubuh) bisa menyebabkan perubahan" +
                    "tidak normal pada sel-sel serviks.");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("Kanker Serviks merupakan penyakit Golongan III (Tingkat Rendah), maka solusi untuk human " +
                    "smoking capacity pada gejala penyakit ini adalah :\n" +
                    "Umur  < 18 Tahun = 4 rokok perhari\n" +
                    "Umur 19-28 Tahun = 5 rokok perhari\n" +
                    "Umur 28-38 Tahun = 7 rokok perhari\n" +
                    "Umur 39-49 Tahun = 9 rokok perhari\n");
        }
    }

    class penyakit5 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[4]));
            double val2 = Double.parseDouble(String.valueOf(arrG[4]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Kerongkongan (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Kanker kerongkongan adalah kanker yang terdapat pada tenggorokan atau pita suara." +
                    "Tenggorokan adalah saluran yang dimulai dari belakang hidung dan berakhir di leher.");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("Kanker Kerongkongan merupakan penyakit Golongan II (Tingkat sedang), maka solusi untuk human " +
                    "smoking capacity pada gejala penyakit ini adalah :\n" +
                    "Umur  < 18 Tahun = 3 rokok perhari\n" +
                    "Umur 19-28 Tahun = 4 rokok perhari\n" +
                    "Umur 28-38 Tahun = 5 rokok perhari\n" +
                    "Umur 39-49 Tahun = 7 rokok perhari\n");
        }

    }

    class penyakit6 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[5]));
            double val2 = Double.parseDouble(String.valueOf(arrG[5]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Pencernaan (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Infeksi telinga");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("Kanker Kerongkongan merupakan penyakit Golongan II (Tingkat sedang), maka solusi untuk human " +
                    "smoking capacity pada gejala penyakit ini adalah :\n" +
                    "Umur  < 18 Tahun = 3 rokok perhari\n" +
                    "Umur 19-28 Tahun = 4 rokok perhari\n" +
                    "Umur 28-38 Tahun = 5 rokok perhari\n" +
                    "Umur 39-49 Tahun = 7 rokok perhari\n");
        }
    }

    class penyakit7 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[6]));
            double val2 = Double.parseDouble(String.valueOf(arrG[6]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Ginjal (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Infeksi telinga");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("lalala fortune ookieee");
        }
    }

    class penyakit8 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[7]));
            double val2 = Double.parseDouble(String.valueOf(arrG[7]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Kanker Mulut (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Infeksi telinga");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("lalala fortune ookieee");
        }
    }

    class penyakit9 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[8]));
            double val2 = Double.parseDouble(String.valueOf(arrG[8]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Serangan Jantung (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Infeksi telinga");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("lalala fortune ookieee");
        }
    }

    class penyakit10 implements Button.OnClickListener {
        public void onClick(View v) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[9]));
            double val2 = Double.parseDouble(String.valueOf(arrG[9]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Hipertensi (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Infeksi telinga");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("lalala fortune ookieee");
        }
    }


    class penyakit11 implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[10]));
            double val2 = Double.parseDouble(String.valueOf(arrG[10]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Impotensi (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Infeksi telinga");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("lalala fortune ookieee");
        }
    }

    class penyakit12 implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            setContentView(R.layout.result);
            TextView t1 = (TextView) findViewById(R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[11]));
            double val2 = Double.parseDouble(String.valueOf(arrG[11]));
            double pb = (val1 / val2) * 100;
            String pbs = Double.toString(pb);
            t1.setText("Penyakit Paru Obstruksi (" + pbs + "%)");
            TextView t2 = (TextView) findViewById(R.id.txtGejala);
            t2.setText("Infeksi telinga");
            TextView t3 = (TextView) findViewById(R.id.txtKeterangan);
            t3.setText("lalala fortune ookieee");
        }
    }

    public void kembali(View v) {
        finish();

    }
}

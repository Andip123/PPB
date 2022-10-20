package com.example.apkkalkulatorbidangdatr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edtPanjang, edtLebar;
    TextView txtNil1, txtNil2, txtKeli, txtLus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtNil1 = findViewById(R.id.txtNil1);
        txtNil2 = findViewById(R.id.txtNil2);
        txtKeli = findViewById(R.id.txtKeli);
        txtLus = findViewById(R.id.txtLus);
    }

    public void htgPersegi(View v) {
        String nilai1 = edtPanjang.getText().toString();
        String nilai2 = edtLebar.getText().toString();

        if(nilai1.isEmpty()){
            edtPanjang.setError("Data tidak boleh kosong");
            edtPanjang.requestFocus();
        }else if(nilai2.isEmpty()){
            edtLebar.setError("Data tidak boleh kosong");
            edtLebar.requestFocus();
        }else{
            Double panjang = Double.parseDouble(nilai1);
            Double lebar = Double.parseDouble(nilai2);

            Double luas = panjang * lebar;
            Double keliling = (2*panjang) + (2*lebar);

            txtNil1.setText("Panjang : " +nilai1);
            txtNil2.setText("Lebar : " +nilai2);
            txtKeli.setText("Luas = " +String.valueOf(luas));
            txtLus.setText("Keliling = " +String.valueOf(keliling));
        }
    }
    public void htgSegitiga(View v) {
        String nilai1 = edtPanjang.getText().toString();
        String nilai2 = edtLebar.getText().toString();

        if(nilai1.isEmpty()){
            edtPanjang.setError("Data tidak boleh kosong");
            edtPanjang.requestFocus();
        }else if(nilai2.isEmpty()){
            edtLebar.setError("Data tidak boleh kosong");
            edtLebar.requestFocus();
        }else{
            Double alas = Double.parseDouble(nilai1);
            Double tinggi = Double.parseDouble(nilai2);
            Double sisi = Math.sqrt(((alas*alas)+(tinggi*tinggi)));


            Double luas = 0.5 * alas * tinggi;
            Double keliling = 3 * sisi;

            txtNil1.setText("Alas : " +nilai1);
            txtNil2.setText("Tinggi : " +nilai2);
            txtKeli.setText("Luas = " +String.valueOf(luas));
            txtLus.setText("Keliling = " +String.valueOf(keliling));
        }
    }
    public void htgLingkaran(View v) {
        String nilai1 = edtPanjang.getText().toString();

        if(nilai1.isEmpty()){
            edtPanjang.setError("Data tidak boleh kosong");
            edtPanjang.requestFocus();
        }else{
            Double diameter = Double.parseDouble(nilai1);

            Double luas = Math.PI * Math.pow(diameter/2, 2);
            Double keliling = 2 * Math.PI * (diameter/2);

            edtLebar.setText("");
            txtNil1.setText("Diameter : " +nilai1);
            txtNil2.setText("");
            txtKeli.setText("Luas = " +String.valueOf(luas));
            txtLus.setText("Keliling = " +String.valueOf(keliling));
        }
    }
}
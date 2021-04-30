package com.rizki.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
// 30 April 2021 Pindah halaman ke Almost 10118025 Rizki Restu Illahi IF1
public class RegisterActivity extends AppCompatActivity {
    TextView palish, palish2, palish3;
    private Spinner isi, isi2, isi3;
    private String[] list = {"Blood Type", "A", "B", "AB", "O"};
    private String[] list2 = {"Reshus", "1", "2", "3"};
    private String[] list3 = {"Job", "Job1", "Job2", "Job3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        palish = (TextView) findViewById(R.id.spinner_textView);
        palish2 = (TextView) findViewById(R.id.spinner_textView2);
        palish3 = (TextView) findViewById(R.id.spinner_textView3);

        isi = (Spinner) findViewById(R.id.regis_spinner);
        isi2 = (Spinner) findViewById(R.id.regis_spinner2);
        isi3 = (Spinner) findViewById(R.id.regis_spinner3);
        isi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                palish.setText(list[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                palish.setText("");
            }

        });
        isi2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                palish2.setText(list2[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                palish2.setText("");
            }

        });
        isi3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                palish3.setText(list3[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                palish3.setText("");
            }

        });


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        isi.setAdapter(adapter);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list2);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        isi2.setAdapter(adapter2);
        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list3);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        isi3.setAdapter(adapter3);
    }

    public void moveAlmost(View view) {
        Intent intent = new Intent(RegisterActivity.this, AlmostActivity.class);
        startActivity(intent);
    }
}
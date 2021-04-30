package com.rizki.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// 30 April 2021 Pindah halaman ke home 10118025 Rizki Restu Illahi IF1
public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void moveHome(View view) {
        Intent intent= new Intent(VerifyActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
package com.rizki.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// 30 April 2021 Pindah halaman ke verify 10118025 Rizki Restu Illahi IF1
public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void moveVerify(View view) {
        Intent intent = new Intent(AlmostActivity.this, VerifyActivity.class);
        startActivity(intent);

    }
}
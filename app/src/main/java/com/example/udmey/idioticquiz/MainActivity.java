package com.example.udmey.idioticquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

    }
    public void aptitude(View view) {
        Intent intent=new Intent(getApplicationContext(),activity_aptitude.class);
        startActivity(intent);
    }

    public void reasoning(View view) {
        Intent intent=new Intent(getApplicationContext(),reasoning.class);
        startActivity(intent);
    }

    public void technical(View view) {
        Intent intent=new Intent(getApplicationContext(),activity_technical.class);
        startActivity(intent);
    }

    public void hr(View view) {
        Intent intent=new Intent(getApplicationContext(),activity_hr.class);
        startActivity(intent);
    }

    public void mis(View view) {
        Intent intent=new Intent(getApplicationContext(),activity_gen.class);
        startActivity(intent);
    }
}

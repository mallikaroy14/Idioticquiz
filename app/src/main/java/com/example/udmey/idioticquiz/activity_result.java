package com.example.udmey.idioticquiz;

import android.content.Intent;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class activity_result extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result);






        TextView textView = (TextView) findViewById(R.id.score);
        // TextView textView1 = (TextView) findViewById(R.id.score1);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        textView.setText("Your Score:" +score);




       // Button exit =(Button) findViewById(R.id.exitbn);
    }

   /* @Override
    protected  void onDestroy(){
        Process.killProcess(Process.myPid());
        super.onDestroy();

    }
*/
   // Go back to first Page
    public void next(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
  // for exit from whole application
    public void exit(View view){
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory(Intent.CATEGORY_HOME);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }


}

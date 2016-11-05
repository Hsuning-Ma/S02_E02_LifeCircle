package com.zimeng.s02_e02_lifecircle;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private Button button;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    button = (Button)findViewById(R.id.button);
    button.setOnClickListener(new ButtonListener());
    System.out.println("MainActivity: onCreate");
  }

  class ButtonListener implements View.OnClickListener{
    @Override
    public void onClick(View v) {
      Intent intent = new Intent();
      intent.setClass(MainActivity.this, SecondActivity.class);
      startActivity(intent);
    }
  }
  protected void  onStart() {
    super.onStart();
    System.out.println("MainActivity: onStart");

  }

  @Override
  protected void onPause() {
    super.onPause();
    System.out.println("MainActivity: onPause");
  }

  @Override
  protected void onResume() {
    super.onResume();
    System.out.println("MainActivity: onResume");
  }

  @Override
  protected void onStop() {
    super.onStop();
    System.out.println("MainActivity: onStop");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    System.out.println("MainActivity: onDestroy");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    System.out.println("MainActivity: onRestart");
  }
}
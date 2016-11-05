package com.zimeng.s02_e02_lifecircle;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by zimeng on 16-10-31.
 */

public class SecondActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);
  }

  @Override
  protected void  onStart() {
    super.onStart();
    System.out.println("SecondActivity: onCreate");
  }

  @Override
  protected void onPause() {
    super.onPause();
    System.out.println("SecondActivity: onPause");
  }

  @Override
  protected void onResume() {
    super.onResume();
    System.out.println("SecondActivity: onResume");
  }

  @Override
  protected void onStop() {
    super.onStop();
    System.out.println("SecondActivity: onStop");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    System.out.println("SecondActivity: onDestroy");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    System.out.println("SecondActivity: onRestart");
  }
}

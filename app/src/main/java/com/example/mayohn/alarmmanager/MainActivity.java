package com.example.mayohn.alarmmanager;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button start_circle;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_circle = findViewById(R.id.start_circle);
        cancel = findViewById(R.id.cancel);
        start_circle.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_circle:
                AlarmTimer.setRepeatingAlarmTimer(MainActivity.this,
                        System.currentTimeMillis(), 3 * 1000,
                        GlobalValues.TIMER_ACTION_REPEATING,
                        AlarmManager.RTC);
                break;
            case R.id.cancel:
                break;
        }
    }
}

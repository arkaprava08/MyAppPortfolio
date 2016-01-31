package com.arkaprava.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
    }

    @OnClick({
            R.id.app1,
            R.id.app2,
            R.id.app3,
            R.id.app4,
            R.id.app5
    })
    public void openApp(Button clicked) {
        String formattedToastString = String.format(getString(R.string.launch_app_toast), clicked.getText());
        Toast.makeText(this, formattedToastString, Toast.LENGTH_SHORT).show();
    }
}

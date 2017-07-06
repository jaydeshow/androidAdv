package com.chtti.fragement1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton button = (ToggleButton) findViewById(R.id.toggleButton);
        button.setOnCheckedChangeListener(this);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        if(isChecked){
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        window.setAttributes(params);
    }

    @Override
    public void onClick(View v) {
        Window window = getWindow();
        View decorView = window.getDecorView();
        switch (v.getId()){
            case R.id.button: //visible
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
                break;
            case R.id.button2: //low
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE);
                break;
            case R.id.button3: //hidden
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
                break;
        }
    }
}

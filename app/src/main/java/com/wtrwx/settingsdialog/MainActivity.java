package com.wtrwx.settingsdialog;

import android.app.Activity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.widget.Toast;

public class MainActivity extends Activity { 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SettingsDialog dialog = new SettingsDialog();
        dialog.show(getFragmentManager(), "SettingsDialog");

        // get value form sp
        SharedPreferences sp = getSharedPreferences("com.wtrwx.settingsdialog_preferences", MODE_PRIVATE);
        if (sp.getBoolean("setting_test1", false)) {
            Toast.makeText(getApplication(), "test1 is true", Toast.LENGTH_SHORT).show();
        }

    }

} 
package com.example.custom_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dialog = (Button) findViewById(R.id.dialogBtn);

        dialog.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        CustomDialog dialog = new CustomDialog(this);
        dialog.callDialog();
    }
}
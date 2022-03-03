package com.santidev.dialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFirstDialog dialog = new MyFirstDialog();
                dialog.show(getFragmentManager(), "1");

                //De momento mostraremos un dialogo en pantalla con identificador 1
            }
        });

    }

}
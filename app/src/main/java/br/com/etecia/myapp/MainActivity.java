package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    // DECLARANDO VARIAVEL GLOBAL QUE IRA REPRESENTAR O XML NO JAVA
    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // APRESENTANDO O XML PARA O JAVA
        idToolBar = findViewById(R.id.idToolBar);

        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "cliquei no menu hamburguer", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
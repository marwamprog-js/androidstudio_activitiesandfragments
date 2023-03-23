package com.cursoandroid.activitiesefragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cursoandroid.activitiesefragments.R;
import com.cursoandroid.activitiesefragments.fragment.ContatosFragment;
import com.cursoandroid.activitiesefragments.fragment.ConversasFragment;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbrir;
    private Button buttonFechar;

    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbrir = findViewById(R.id.buttonAbrir);
        buttonFechar = findViewById(R.id.buttonFechar);

        buttonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Botão precionado", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Confirmar", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                    //buttonAbrir.setText("Botão abrir alterado!");
                            }
                        })
                        .setActionTextColor( getResources().getColor(R.color.purple_200) )
                        .show();


            }
        });

        /*
        buttonFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
         */

    }

}
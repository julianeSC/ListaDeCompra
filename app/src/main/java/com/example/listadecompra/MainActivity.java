package com.example.listadecompra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private TextView textView;
    private CheckBox feijao;
    private CheckBox leite;
    private CheckBox macarrao;
    private CheckBox farofa;
    private CheckBox refrigerante;
    private CheckBox batatafrita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.idcalcular);
        textView = (TextView) findViewById(R.id.id_tvresult);
        feijao = (CheckBox) findViewById(R.id.id_cbfeijao);
        leite = (CheckBox) findViewById(R.id.id_cbleite);
        macarrao = (CheckBox) findViewById(R.id.id_cbmacar);
        farofa = (CheckBox) findViewById(R.id.id_cbfaro);
        refrigerante = (CheckBox) findViewById(R.id.id_cbrefri);
        batatafrita = (CheckBox) findViewById(R.id.id_cbbatata);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                calcula();
            }
        });

    }

    public void calcula() {

        Double resultado = 0.00;


        Double precoF = 2.69;
        Double precoL = 2.7;
        Double precoM = 16.70;
        Double precoFR = 3.38;
        Double precoR = 3.0;
        Double precoB = 5.0;


        if (feijao.isChecked()) {
            resultado +=precoF;
        }
        if (leite.isChecked()) {
            resultado += precoL;
        }
        if (macarrao.isChecked()) {
            resultado += precoM;
        }
        if (farofa.isChecked()) {
            resultado += precoFR;
        }
        if (refrigerante.isChecked()) {
            resultado += precoR;
        }
        if (batatafrita.isChecked()) {
            resultado += precoB;
        }



        if (resultado != null) {
            textView.setText(resultado.toString());
        }


    }
}
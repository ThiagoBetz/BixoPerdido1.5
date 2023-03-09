package com.bixo.perdido.bixoperdido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirtela_cadastrobixo(View v){
        Intent int_telacadastrobixo = new Intent(this, cadastro_bixo.class);
        startActivity(int_telacadastrobixo);
    }
}
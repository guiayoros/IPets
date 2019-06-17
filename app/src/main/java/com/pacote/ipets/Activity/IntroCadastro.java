package com.pacote.ipets.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pacote.ipets.R;

public class IntroCadastro extends AppCompatActivity {

    private EditText campoEmail, campoSenha;
    private Button botaoAcessar, botaoSeCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_intro);

        //Summir a Toobar
        getSupportActionBar().hide();

        //Configuraçoes Iniciais
        campoEmail = findViewById(R.id.editEmailIntro);
        campoSenha = findViewById(R.id.editSenhaIntro);
        botaoAcessar = findViewById(R.id.btnAcessar);
        botaoSeCadastrar = findViewById(R.id.btnSeCadastrar);

        botaoAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                abrirClientePrincial();
            }
        });

        botaoSeCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                irCadastro();
            }
        });

    }

    public void abrirClientePrincial() {

        startActivity(new Intent(this, ClientePrincipal.class));
    }

    public void irCadastro() {
        startActivity(new Intent(this, TelaCadastro.class));
    }

    public void recuperarSenha(View v){
        startActivity(new Intent(this, RecuperarSenha.class));
    }
}

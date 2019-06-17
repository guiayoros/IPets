package com.pacote.ipets.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pacote.ipets.Model.Usuario;
import com.pacote.ipets.R;

public class TelaCadastro extends AppCompatActivity {

    private EditText nome, endereco , numero , complemento , telefone;
    private Button proximo;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        //Sumir a ActionBar
        getSupportActionBar().hide();

        //Configurar toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbar.setTitle("");
        mTitle.setText("Cadastrar-se");
        if (null != toolbar) {
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirIntroCadastro();
                }
            });

        }

        nome = findViewById(R.id.editNomeCadastro);
        endereco = findViewById(R.id.editEndereçoCadastro);
        numero = findViewById(R.id.editNumeroCadastro);
        complemento = findViewById(R.id.editComplementoCadastro);
        telefone = findViewById(R.id.editCelularCadastro);
        proximo = findViewById(R.id.buttonProximo);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Validar se os campos foram preenchidos

                proximaPagina();

            }
        });
    }

    private void abrirIntroCadastro(){
        startActivity(new Intent(TelaCadastro.this, IntroCadastro.class));
    }

    public void proximaPagina(){
        Intent intent = new Intent(TelaCadastro.this, TelaCadastro2.class);
        intent.putExtra("usuario", usuario);
        startActivity(intent);

    }
}

package com.pacote.ipets.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.pacote.ipets.Fragment.AlterarSenhaFragment;
import com.pacote.ipets.Fragment.ConfigFragment;
import com.pacote.ipets.Fragment.MeuPetFragment;
import com.pacote.ipets.Fragment.MeusDadosFragment;
import com.pacote.ipets.Fragment.PedidosFragment;
import com.pacote.ipets.Fragment.ServicosFragment;
import com.pacote.ipets.R;

public class MeuPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_perfil);

        //Sumir a ActionBar
        getSupportActionBar().hide();

        configuraBottomNavigation();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbar.setTitle("");
        mTitle.setText("Meu Perfil");

        if (null != toolbar) {
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirClientePrincipal();
                }
            });

        }
    }

    private void abrirClientePrincipal(){
        startActivity(new Intent(MeuPerfil.this, ClientePrincipal.class));
    }

    public void configuraBottomNavigation() {
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bttmNavigationDados);
        bottomNavigationViewEx.enableAnimation(true);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(true);

        //Habilitar Navegaçao
        habilitarNavegaçao(bottomNavigationViewEx);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.viewPage, new MeusDadosFragment()).commit();
    }

    private void habilitarNavegaçao(BottomNavigationViewEx viewEx) {

        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.ic_dadosCliente:
                        fragmentTransaction.replace(R.id.viewPage, new MeusDadosFragment()).commit();

                        return true;
                    case R.id.ic_senhaCliente:
                        fragmentTransaction.replace(R.id.viewPage, new AlterarSenhaFragment()).commit();
                        return true;

                }
                return false;
            }
        });


    }
}

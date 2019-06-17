package com.pacote.ipets.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.pacote.ipets.Fragment.ConfigFragment;
import com.pacote.ipets.Fragment.MeuPetFragment;
import com.pacote.ipets.Fragment.PedidosFragment;
import com.pacote.ipets.Fragment.ServicosFragment;
import com.pacote.ipets.R;

public class ClientePrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_principal);

        //Sumir a ActionBar
        getSupportActionBar().hide();

        configuraBottomNavigation();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbar.setTitle("");
        mTitle.setText("IPet");
    }

    public void configuraBottomNavigation() {
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bottomNavigation);
        bottomNavigationViewEx.enableAnimation(true);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(true);

        //Habilitar Navegaçao
        habilitarNavegaçao(bottomNavigationViewEx);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.viewPage, new MeuPetFragment()).commit();

    }

    private void habilitarNavegaçao(BottomNavigationViewEx viewEx) {

        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.ic_meuPet:
                        fragmentTransaction.replace(R.id.viewPage, new MeuPetFragment()).commit();

                        return true;
                    case R.id.ic_serviços:
                        fragmentTransaction.replace(R.id.viewPage, new ServicosFragment()).commit();
                        return true;

                    case R.id.ic_pedidos:
                        fragmentTransaction.replace(R.id.viewPage, new PedidosFragment()).commit();
                        return true;

                    case R.id.ic_config:
                        fragmentTransaction.replace(R.id.viewPage, new ConfigFragment()).commit();
                        return true;
                }
                return false;
            }
        });


    }

    public void meuPerfil(View v){
        startActivity(new Intent(ClientePrincipal.this, MeuPerfil.class));
    }

    public void notificacoes(View v){
        startActivity(new Intent(ClientePrincipal.this, Notificacoes.class));
    }

    public void perguntasFrequentes(View v){

    }

    public void faleConosco(View v){

    }

    public void termosUso(View v){

    }

    public void sair(View v){
        startActivity(new Intent(ClientePrincipal.this, IntroCadastro.class));
    }
}

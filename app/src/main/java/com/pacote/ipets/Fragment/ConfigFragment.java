package com.pacote.ipets.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pacote.ipets.Activity.Notificacoes;
import com.pacote.ipets.Activity.RecuperarSenha;
import com.pacote.ipets.R;

public class ConfigFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_config_fragment, container, false);

        return view;
    }

    public void notificacoes(View view){
        switch (view.getId()){
        }
    }

    public void meuPerfil(View view){
        switch (view.getId()){
        }
    }

    public void perguntasFrequentes(View view){
        switch (view.getId()){
        }
    }

    public void faleConosco(View view){
        switch (view.getId()){
        }
    }

    public void termosUso(View view){
        switch (view.getId()){
        }
    }

    public void sair(View view){
        switch (view.getId()){
        }
    }


}

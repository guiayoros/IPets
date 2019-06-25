package com.pacote.ipets.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pacote.ipets.Model.Animal;
import com.pacote.ipets.R;

import java.util.List;

public class AdapterAnimal extends RecyclerView.Adapter<AdapterAnimal.MyViewHolder> {
    private List<Animal> animals;
    private Context context;

    public AdapterAnimal(Context cc, List<Animal> animal) {
        this.animals = animal;
        this.context = cc;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_animais, parent, false);
        return new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        Animal animal = animals.get(position);
        holder.nome.setText(animal.getNome());
        holder.raca.setText(animal.getRaca());
        holder.porteAnimal.setText(animal.getPorte());


    }


    @Override
    public int getItemCount() {

        return animals.size();

    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nome;
        TextView raca;
        TextView porteAnimal;



        public MyViewHolder(View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.nomeAnimal);
            raca = itemView.findViewById(R.id.raca);
            porteAnimal = itemView.findViewById(R.id.animalPorte);
        }
    }
}

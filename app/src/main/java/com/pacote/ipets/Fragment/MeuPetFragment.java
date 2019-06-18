package com.pacote.ipets.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pacote.ipets.Adapter.AdapterAnimal;
import com.pacote.ipets.Interface.GetDataService;
import com.pacote.ipets.Model.Animal;
import com.pacote.ipets.Network.RetrofitAnimal;
import com.pacote.ipets.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MeuPetFragment extends Fragment {

    private RecyclerView listaAnimal;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_meu_pet_fragment, container, false);

        listaAnimal = view.findViewById(R.id.recyclerMeuPet);





        GetDataService service = RetrofitAnimal.getRetrofitInstance().create(GetDataService.class);
        Call<List<Animal>> call = service.getAllanimals();
        call.enqueue(new Callback<List<Animal>>() {
            @Override
            public void onResponse(Call<List<Animal>> call, Response<List<Animal>> response) {
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<Animal>> call, Throwable t) {
                Toast.makeText(getActivity(), "ME CHUPAAAAAA", Toast.LENGTH_SHORT).show();


            }


});




        return view;
    }


    private void generateDataList(List<Animal> animalList){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        listaAnimal.setLayoutManager(layoutManager);
        listaAnimal.setHasFixedSize(true);
        AdapterAnimal adapterAnimal = new AdapterAnimal(getActivity(),animalList);
        listaAnimal.setAdapter(adapterAnimal);
    }
}

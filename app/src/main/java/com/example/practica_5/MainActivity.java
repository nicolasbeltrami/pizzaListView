package com.example.practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    String[][]pizzas = {
            {"Pizza 1", "$ 10.990", "Ingredientes: Queso, Carne, Piña"},
            {"Pizza 2", "$ 10.990", "Ingredientes: Queso, Verduras, Carne"},
            {"Pizza 3", "$ 10.990", "Ingredientes: Queso, Piña, Piña"},
            {"Pizza 4", "$ 10.990", "Ingredientes: Piña, Piña, Piña"},
            {"Pizza 5", "$ 10.990", "Ingredientes: Queso, Verduras, Piña"},
    };

    int[] pizzasImg = {R.drawable.pizza1, R.drawable.pizza2, R.drawable.pizza3, R.drawable.pizza4, R.drawable.pizza5 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.list_view);

        lista.setAdapter(new Adaptador(this, pizzas, pizzasImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent visorDetalles = new Intent(view.getContext(), DetallesPizza.class);
                visorDetalles.putExtra("IMG",pizzasImg[i]);
                visorDetalles.putExtra("NOM", pizzas[i][0]);
                visorDetalles.putExtra("ING", pizzas[i][2]);
                startActivity(visorDetalles);
            }
        });
    }
}

package com.example.practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesPizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_pizza);

        TextView nombre = findViewById(R.id.textNombrePizza);
        TextView ingredientes = findViewById(R.id.textIngredientes);
        ImageView imgPizza = findViewById(R.id.imagePizzaDet);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b != null) {
            imgPizza.setImageResource(b.getInt("IMG"));
            nombre.setText(b.getString("NOM"));
            ingredientes.setText(b.getString("ING"));
        }
    }
}

package com.example.practica_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context context;
    String[][] pizzas;
    int [] pizzasImg;

    public Adaptador(Context context, String[][] pizzas, int[] pizzasImg) {
        this.context = context;
        this.pizzas = pizzas;
        this.pizzasImg = pizzasImg;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);
        TextView nombre = vista.findViewById(R.id.textNombre);
        TextView precio = vista.findViewById(R.id.textPrecio);
        ImageView imagen = vista.findViewById(R.id.imagenPizza);

        nombre.setText(pizzas[i][0]);
        precio.setText(pizzas[i][1]);
        imagen.setImageResource(pizzasImg[i]);



        return vista;
    }

    @Override
    public int getCount() {
        return pizzasImg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}

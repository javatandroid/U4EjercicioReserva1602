package com.example.u4ejercicioreserva1602;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaReservaActivity extends AppCompatActivity {

    ListView lvReserva;

    ArrayList<Reserva> lista_reserva = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_reserva);

        cargarDatos();

        lvReserva=(ListView)findViewById(R.id.lvReservas);

        AdaptadorReserva adaptadorReserva = new AdaptadorReserva(this, lista_reserva);
        lvReserva.setAdapter(adaptadorReserva);

        lvReserva.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Reserva r =((Reserva)parent.getItemAtPosition(position));
                Intent i=new Intent (getApplicationContext(),InfoReservaActivity.class);
                startActivity(i);

            }
        });

    }

    private void cargarDatos(){

        lista_reserva.add(new Reserva("Javi", 5, "Lunes", "21:00", "Mesa fuera"));
        lista_reserva.add(new Reserva("Paco", 10, "Miércoles", "22:00", ""));
        lista_reserva.add(new Reserva("Pepe", 2, "Jueves", "12:00", "Libre de humos"));
        lista_reserva.add(new Reserva("Luis", 4, "Sábado", "15:00", "Comida vegetariana"));
        lista_reserva.add(new Reserva("Juan", 5, "Domingo", "13:00", ""));
    }
}

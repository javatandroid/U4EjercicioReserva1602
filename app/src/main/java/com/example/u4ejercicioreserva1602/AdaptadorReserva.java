package com.example.u4ejercicioreserva1602;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 19/02/2018.
 */

public class AdaptadorReserva extends ArrayAdapter<Reserva> {

    ArrayList<Reserva> reservas;
    Context c;

    public AdaptadorReserva(Context c, ArrayList<Reserva> reservas){
        super(c,R.layout.item_reserva, reservas);
        this.c = c;
        this.reservas = reservas;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_reserva,null);

        //TextView Nombre
        TextView tvnombre=(TextView)item.findViewById(R.id.tvListaReservaNombre);
        tvnombre.setText(reservas.get(position).getNombre());

        //TextView Personas
        TextView tvpersonas=(TextView)item.findViewById(R.id.tvListaReservaPersonas);
        tvpersonas.setText(""+reservas.get(position).getPersonas());

        //TextView Dia
        TextView tvdia=(TextView)item.findViewById(R.id.tvListaReservaDia);
        tvdia.setText(reservas.get(position).getDia());

        //TextView Hora
        TextView tvhora=(TextView)item.findViewById(R.id.tvListaReservaHora);
        tvhora.setText(""+reservas.get(position).getHora());

        //TextView Observaciones
        TextView tvobservaciones=(TextView)item.findViewById(R.id.tvListaReservaObservaciones);
        tvobservaciones.setText(""+reservas.get(position).getObservaciones());

        return item;
    }
}

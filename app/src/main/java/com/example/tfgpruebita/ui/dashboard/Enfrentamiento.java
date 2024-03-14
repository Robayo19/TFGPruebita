package com.example.tfgpruebita.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tfgpruebita.MainActivity;
import com.example.tfgpruebita.databinding.FragmentDashboardBinding;
import com.example.tfgpruebita.databinding.FragmentFriendsBinding;
import com.example.tfgpruebita.modelo.Equipo;
import com.example.tfgpruebita.modelo.Jugador;

import java.util.ArrayList;

public class Enfrentamiento extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentDashboardBinding binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button button = binding.simular;
        TextView jugador1TextView = binding.JugadorElegido1;
        TextView jugador2TextView = binding.JugadorElegido2;
        TextView jugador3TextView = binding.JugadorElegido3;
        TextView jugador4TextView = binding.JugadorElegido4;
        TextView jugador5TextView = binding.JugadorElegido5;
        TextView jugador6TextView = binding.JugadorElegido6;
        TextView jugador7TextView = binding.JugadorElegido7;
        TextView jugador8TextView = binding.JugadorElegido8;
        TextView jugador9TextView = binding.JugadorElegido9;
        TextView jugador10TextView = binding.JugadorElegido10;
        TextView jugador11TextView = binding.JugadorElegido11;

        //TextViews Definido
        TextView jugador1Definido = binding.JugadorDefinido1;
        TextView jugador2Definido = binding.JugadorDefinido2;
        TextView jugador3Definido = binding.JugadorDefinido3;
        TextView jugador4Definido = binding.JugadorDefinido4;
        TextView jugador5Definido = binding.JugadorDefinido5;
        TextView jugador6Definido = binding.JugadorDefinido6;
        TextView jugador7Definido = binding.JugadorDefinido7;
        TextView jugador8Definido = binding.JugadorDefinido8;
        TextView jugador9Definido = binding.JugadorDefinido9;
        TextView jugador10Definido = binding.JugadorDefinido10;
        TextView jugador11Definido = binding.JugadorDefinido11;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < MainActivity.lista.size(); i++) {
                    String jugador = MainActivity.lista.get(i);
                    switch (i) {
                        case 0:
                            jugador1TextView.setText(jugador);
                            break;
                        case 1:
                            jugador2TextView.setText(jugador);
                            break;
                        case 2:
                            jugador3TextView.setText(jugador);
                            break;
                        case 3:
                            jugador4TextView.setText(jugador);
                            break;
                        case 4:
                            jugador5TextView.setText(jugador);
                            break;
                        case 5:
                            jugador6TextView.setText(jugador);
                            break;
                        case 6:
                            jugador7TextView.setText(jugador);
                            break;
                        case 7:
                            jugador8TextView.setText(jugador);
                            break;
                        case 8:
                            jugador9TextView.setText(jugador);
                            break;
                        case 9:
                            jugador10TextView.setText(jugador);
                            break;
                        case 10:
                            jugador11TextView.setText(jugador);
                            break;
                        default:
                            break;
                    }
                }
                String equipoDeseado = "Deportes Tolima";

                ArrayList<Jugador> jugadoresEquipo = new ArrayList<>();
                for (Jugador jugador : MainActivity.listaJugadores) {
                    if (jugador.getEquipo().equals(equipoDeseado)) {
                        jugadoresEquipo.add(jugador);
                    }
                }

                for (int i = 0; i < jugadoresEquipo.size(); i++) {
                    Jugador jugador = jugadoresEquipo.get(i);
                    switch (i) {
                        case 0:
                            jugador1Definido.setText(jugador.getNombre());
                            break;
                        case 1:
                            jugador2Definido.setText(jugador.getNombre());
                            break;
                        case 2:
                            jugador3Definido.setText(jugador.getNombre());
                            break;
                        case 3:
                            jugador4Definido.setText(jugador.getNombre());
                            break;
                        case 4:
                            jugador5Definido.setText(jugador.getNombre());
                            break;
                        case 5:
                            jugador6Definido.setText(jugador.getNombre());
                            break;
                        case 6:
                            jugador7Definido.setText(jugador.getNombre());
                            break;
                        case 7:
                            jugador8Definido.setText(jugador.getNombre());
                            break;
                        case 8:
                            jugador9Definido.setText(jugador.getNombre());
                            break;
                        case 9:
                            jugador10Definido.setText(jugador.getNombre());
                            break;
                        case 10:
                            jugador11Definido.setText(jugador.getNombre());
                            break;
                        default:
                            break;
                    }
                    TextView marcadorElegido = binding.MarcadorElegido;
                    TextView marcadorEquipo = binding.MarcadorEquipo;

                    int marcadorAleatorio = (int) (Math.random() * 10);
                    switch (i) {
                        case 0:
                            marcadorElegido.setText(String.valueOf(marcadorAleatorio));
                            break;
                        case 1:
                            marcadorEquipo.setText(String.valueOf(marcadorAleatorio));
                            break;
                        default:
                            break;
                    }
                }


            }
        });

        return root;
}

}
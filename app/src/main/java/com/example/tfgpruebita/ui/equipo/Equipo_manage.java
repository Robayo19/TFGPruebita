package com.example.tfgpruebita.ui.equipo;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tfgpruebita.R;
import com.example.tfgpruebita.databinding.FragmentEquipoManageBinding;

import java.util.HashMap;
import java.util.Map;

public class Equipo_manage extends Fragment {

    private static final String FORMACION_433 = "4-3-3";
    private static final String FORMACION_442 = "4-4-2";
    private static final String FORMACION_343 = "3-4-3";

    private Map<Integer, int[]> posicionesOriginales;

    ImageView delantero2;
    ImageView delantero1;
    ImageView delantero3;
    ImageView medio1;
    ImageView medio2;
    ImageView medio3;
    ImageView medio5;
    ImageView medio4;
    ImageView defensa2;
    ImageView defensa1;
    ImageView defensa4;
    ImageView defensa3;
    ImageView defensa5;
    TextView txtdelantero2;
    TextView txtdelantero1;
    TextView txtdelantero3;
    TextView txtmedio1;
    TextView txtmedio2;
    TextView txtmedio3;
    TextView txtmedio5;
    TextView txtmedio4;
    TextView txtdefensa2;
    TextView txtdefensa3;
    TextView txtdefensa4;
    TextView txtdefensa1;
    TextView txtdefensa5;


    public Equipo_manage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentEquipoManageBinding binding = FragmentEquipoManageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        delantero2 = binding.delantero2;
        delantero1 = binding.delantero1;
        delantero3 = binding.delantero3;
        medio1 = binding.medio1;
        medio2 = binding.medio2;
        medio3 = binding.medio3;
        medio5 = binding.medio5;
        medio4 = binding.medio4;
        defensa2 = binding.defensa2;
        defensa1 = binding.defensa1;
        defensa4 = binding.defensa4;
        defensa3 = binding.defensa3;
        defensa5 = binding.defensa5;
        txtdelantero2 = binding.txtdelantero2;
        txtdelantero1 = binding.txtdelantero1;
        txtdelantero3 = binding.txtdelantero3;
        txtmedio1 = binding.txtmedio1;
        txtmedio2 = binding.txtmedio2;
        txtmedio3 = binding.txtmedio3;
        txtmedio5 = binding.txtmedio5;
        txtmedio4 = binding.txtmedio4;
        txtdefensa2 = binding.txtdefensa2;
        txtdefensa3 = binding.txtdefensa3;
        txtdefensa4 = binding.txtdefensa4;
        txtdefensa1 = binding.txtdefensa1;
        txtdefensa5= binding.txtdefensa5;

        Button button = binding.button;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    listaFormaciones(v);
            }
        });

        return root;
    }


    private void listaFormaciones(View view) {
        Log.d("lista", "lista");
        PopupMenu popupMenu = new PopupMenu(requireContext(), view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.formacion_menu, popupMenu.getMenu());
        Log.d("lista1", "lista1");

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String formacion = item.getTitle().toString();
                switch (formacion) {
                    case FORMACION_433:
                        Toast.makeText(requireContext(), "FORMACION ELEGIDA!", Toast.LENGTH_SHORT).show();
                        ajustarMargenesFormacion433();
                        return true;
                    case FORMACION_442:
                        Toast.makeText(requireContext(), "FORMACION ELEGIDA!", Toast.LENGTH_SHORT).show();
                        ajustarMargenesFormacion442();
                        return true;
                    case FORMACION_343:
                        Toast.makeText(requireContext(), "FORMACION ELEGIDA!", Toast.LENGTH_SHORT).show();
                        ajustarMargenesFormacion343();
                        return true;
                    default:
                        return false;
                }
            }
        });

        popupMenu.show();
    }

    private void ajustarMargenesFormacion433() {
        delantero2.setVisibility(View.VISIBLE);
        delantero1.setVisibility(View.VISIBLE);
        delantero3.setVisibility(View.VISIBLE);
        medio1.setVisibility(View.VISIBLE);
        medio2.setVisibility(View.VISIBLE);
        medio3.setVisibility(View.VISIBLE);
        medio5.setVisibility(View.INVISIBLE);
        medio4.setVisibility(View.INVISIBLE);
        defensa2.setVisibility(View.VISIBLE);
        defensa3.setVisibility(View.VISIBLE);
        defensa1.setVisibility(View.VISIBLE);
        defensa4.setVisibility(View.VISIBLE);
        defensa5.setVisibility(View.INVISIBLE);
        txtdelantero2.setVisibility(View.VISIBLE);
        txtdelantero1.setVisibility(View.VISIBLE);
        txtdelantero3.setVisibility(View.VISIBLE);
        txtmedio1.setVisibility(View.VISIBLE);
        txtmedio2.setVisibility(View.VISIBLE);
        txtmedio3.setVisibility(View.VISIBLE);
        txtmedio5.setVisibility(View.INVISIBLE);
        txtmedio4.setVisibility(View.INVISIBLE);
        txtdefensa2.setVisibility(View.VISIBLE);
        txtdefensa3.setVisibility(View.VISIBLE);
        txtdefensa1.setVisibility(View.VISIBLE);
        txtdefensa4.setVisibility(View.VISIBLE);
        txtdefensa5.setVisibility(View.INVISIBLE);
    }

    private void ajustarMargenesFormacion442() {
        delantero1.setVisibility(View.VISIBLE);
        delantero3.setVisibility(View.VISIBLE);
        delantero2.setVisibility(View.INVISIBLE);
        medio1.setVisibility(View.INVISIBLE);
        medio2.setVisibility(View.VISIBLE);
        medio3.setVisibility(View.VISIBLE);
        medio5.setVisibility(View.VISIBLE);
        medio4.setVisibility(View.VISIBLE);
        defensa2.setVisibility(View.VISIBLE);
        defensa3.setVisibility(View.VISIBLE);
        defensa1.setVisibility(View.VISIBLE);
        defensa4.setVisibility(View.VISIBLE);
        defensa5.setVisibility(View.INVISIBLE);
        txtdelantero2.setVisibility(View.INVISIBLE);
        txtdelantero1.setVisibility(View.VISIBLE);
        txtdelantero3.setVisibility(View.VISIBLE);
        txtmedio1.setVisibility(View.INVISIBLE);
        txtmedio2.setVisibility(View.VISIBLE);
        txtmedio3.setVisibility(View.VISIBLE);
        txtmedio5.setVisibility(View.VISIBLE);
        txtmedio4.setVisibility(View.VISIBLE);
        txtdefensa2.setVisibility(View.VISIBLE);
        txtdefensa3.setVisibility(View.VISIBLE);
        txtdefensa1.setVisibility(View.VISIBLE);
        txtdefensa4.setVisibility(View.VISIBLE);
        txtdefensa5.setVisibility(View.INVISIBLE);
    }

    private void ajustarMargenesFormacion343() {
        delantero2.setVisibility(View.VISIBLE);
        delantero1.setVisibility(View.VISIBLE);
        delantero3.setVisibility(View.VISIBLE);
        medio1.setVisibility(View.INVISIBLE);
        medio2.setVisibility(View.VISIBLE);
        medio3.setVisibility(View.VISIBLE);
        medio5.setVisibility(View.VISIBLE);
        medio4.setVisibility(View.VISIBLE);
        defensa2.setVisibility(View.INVISIBLE);
        defensa3.setVisibility(View.INVISIBLE);
        defensa1.setVisibility(View.VISIBLE);
        defensa4.setVisibility(View.VISIBLE);
        defensa5.setVisibility(View.VISIBLE);
        txtdelantero2.setVisibility(View.VISIBLE);
        txtdelantero1.setVisibility(View.VISIBLE);
        txtdelantero3.setVisibility(View.VISIBLE);
        txtmedio1.setVisibility(View.INVISIBLE);
        txtmedio2.setVisibility(View.VISIBLE);
        txtmedio3.setVisibility(View.VISIBLE);
        txtmedio5.setVisibility(View.VISIBLE);
        txtmedio4.setVisibility(View.VISIBLE);
        txtdefensa2.setVisibility(View.INVISIBLE);
        txtdefensa3.setVisibility(View.INVISIBLE);
        txtdefensa1.setVisibility(View.VISIBLE);
        txtdefensa4.setVisibility(View.VISIBLE);
        txtdefensa5.setVisibility(View.VISIBLE);
    }

}
package com.example.tfgpruebita.adapter;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tfgpruebita.R;
import com.example.tfgpruebita.adapter.JugadorAdapter;
import com.example.tfgpruebita.modelo.Jugador;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    private List<Jugador> jugadorList;
    private JugadorAdapter jugadorAdapter;
    private RecyclerView recyclerViewPlayers;
    private EditText editTextSearch;

    private FirebaseFirestore db;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = FirebaseFirestore.getInstance();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerViewPlayers = root.findViewById(R.id.recyclerViewPlayers);
        editTextSearch = root.findViewById(R.id.editTextSearch);

        jugadorList = new ArrayList<>();

        obtenerJugadoresDesdeFirestore();

        jugadorAdapter = new JugadorAdapter(requireContext(), jugadorList);
        recyclerViewPlayers.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerViewPlayers.setAdapter(jugadorAdapter);

        return root;
    }

    private void obtenerJugadoresDesdeFirestore() {
        db.collection("jugadores")
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            Jugador jugador = document.toObject(Jugador.class);
                            jugadorList.add(jugador);
                            Log.d("NotificationsFragment", "Jugador obtenido: " + jugador.getNombre());
                        }
                        jugadorAdapter.notifyDataSetChanged();
                    } else {
                        Toast.makeText(requireContext(), "Error al obtener jugadores", Toast.LENGTH_SHORT).show();
                        Log.e("NotificationsFragment", "Error al obtener jugadores", task.getException());
                    }
                });
    }
}

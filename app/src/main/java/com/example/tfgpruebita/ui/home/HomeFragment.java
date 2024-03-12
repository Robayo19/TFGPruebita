package com.example.tfgpruebita.ui.home;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tfgpruebita.R;
import com.example.tfgpruebita.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        seleccionEquipo();

        return root;
    }

    private void seleccionEquipo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle("Selecciona tu equipo favorito");
        String[] equipos = {"Nacional", "Tolima", "Cali", "Once Caldas", "Junior", "Bucaramanga", "Santa Fe", "Equidad", "Pereira"};

        builder.setSingleChoiceItems(equipos, -1, (dialog, which) -> {
            String equipoSeleccionado = equipos[which];
            actualizarImageUserSegunEquipo(equipoSeleccionado);

            dialog.dismiss();
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void actualizarImageUserSegunEquipo(String equipoSeleccionado) {
        switch (equipoSeleccionado) {
            case "Nacional":
                binding.imageUser.setImageResource(R.drawable.nacional);
                break;
            case "Tolima":
                binding.imageUser.setImageResource(R.drawable.tolima);
                break;
            case "Cali":
                binding.imageUser.setImageResource(R.drawable.deporcali);
                break;
            case "Once Caldas":
                binding.imageUser.setImageResource(R.drawable.caldas);
                break;
            case "Junior":
                binding.imageUser.setImageResource(R.drawable.juniorfc);
                break;
            case "Bucaramanga":
                binding.imageUser.setImageResource(R.drawable.bucaramanga);
                break;
            case "Santa Fe":
                binding.imageUser.setImageResource(R.drawable.isantafe);
                break;
            case "Equidad":
                binding.imageUser.setImageResource(R.drawable.laequidad);
                break;
            case "Pereira":
                binding.imageUser.setImageResource(R.drawable.pereira);
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

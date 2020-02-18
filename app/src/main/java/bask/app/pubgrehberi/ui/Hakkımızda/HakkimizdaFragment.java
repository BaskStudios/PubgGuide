package bask.app.pubgrehberi.ui.Hakkımızda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import bask.app.pubgrehberi.R;

public class HakkimizdaFragment extends Fragment {

    private HakkimizdeViewModel hakkimizdeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        hakkimizdeViewModel =
                ViewModelProviders.of(this).get(HakkimizdeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_hakkimizda, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        hakkimizdeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
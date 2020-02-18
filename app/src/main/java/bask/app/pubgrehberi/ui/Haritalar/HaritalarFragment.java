package bask.app.pubgrehberi.ui.Haritalar;

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

public class HaritalarFragment extends Fragment {

    private HaritalarViewModel haritalarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        haritalarViewModel =
                ViewModelProviders.of(this).get(HaritalarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_haritalar, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        haritalarViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
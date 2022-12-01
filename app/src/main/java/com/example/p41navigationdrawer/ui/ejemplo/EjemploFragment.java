package com.example.p41navigationdrawer.ui.ejemplo;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.p41navigationdrawer.R;
import com.example.p41navigationdrawer.databinding.FragmentEjemploBinding;
import com.example.p41navigationdrawer.databinding.FragmentGalleryBinding;
import com.example.p41navigationdrawer.ui.gallery.GalleryViewModel;

public class EjemploFragment extends Fragment {

    private FragmentEjemploBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EjemploViewModel ejemploViewModel =
                new ViewModelProvider(this).get(EjemploViewModel.class);

        binding = FragmentEjemploBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEjemplo;
        ejemploViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
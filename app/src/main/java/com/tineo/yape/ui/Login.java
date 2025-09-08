package com.tineo.yape.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tineo.yape.R;
import com.tineo.yape.databinding.FragmentLoginBinding;

import java.util.Random;

public class Login extends Fragment {
    FragmentLoginBinding binding;
    View view;
    Context context;
    NavController navController;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController(view);

        // Contador solo para el botón 1
        final int[] contadorBtnOne = {0};
        Button btnOne = view.findViewById(R.id.btnOne);

        if (btnOne != null) {
            btnOne.setOnClickListener(v -> {
                contadorBtnOne[0]++;

                if (contadorBtnOne[0] == 4) {
                    navController.navigate(R.id.navigation_home);
                }
            });
        }
    }
}
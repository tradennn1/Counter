package com.tradennn1.counter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tradennn1.counter.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    private  Integer number = 0;
    private String result ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =FragmentFirstBinding.inflate(inflater);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        method();
    }

    private void method() {
        binding.btnClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number++;
                result = number.toString();
                binding.textview.setText(result);
            }
        });
        binding.btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number--;
                result = number.toString();
                binding.textview.setText(result);
            }
        });
    }
}
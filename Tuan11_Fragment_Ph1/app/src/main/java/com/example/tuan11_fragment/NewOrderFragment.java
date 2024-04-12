package com.example.tuan11_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tuan11_fragment.databinding.FragmentNeworderBinding;

public class NewOrderFragment extends Fragment {
    FragmentNeworderBinding binding;

    public  NewOrderFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        binding=FragmentNeworderBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}

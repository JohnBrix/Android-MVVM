package com.console.viewmodelyt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.console.viewmodelyt.databinding.ActivityMainBinding;
import com.console.viewmodelyt.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel mainActivityViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    /*    setContentView(R.layout.activity_main);*/
        //ito na sya si setContent naka view model ka kasi para mastore data
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //ito magpapasa ng value
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        //ito ang magseset sa xml to java para mag data binding
        binding.setMainActivityViewModel(mainActivityViewModel);

        binding.setLifecycleOwner(this);
        //context to
        mainActivityViewModel.init();


    }
}
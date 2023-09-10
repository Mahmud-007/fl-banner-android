package com.example.fconnecttest;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.fconnecttest.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new AnchorFragment());

        String Anchor = String.valueOf(R.id.Anchor);
        String In_Content = String.valueOf(R.id.In_Content);
        String Native = String.valueOf(R.id.Native);

        binding.navigationView.setOnItemSelectedListener(item -> {
//            switch (item.getItemId()){
//                case Anchor:
//                    replaceFragment(new AnchorFragment());
//                   break;
//                case R.id.In_Content:
//                    replaceFragment(new InContentFragment());
//                    break;
//                case R.id.Native:
//                    replaceFragment(new NativeFragment());
//                    break;
//                default:
//                    throw new IllegalStateException("Unexpected value: " + item.getItemId());
//            }
            if(item.getItemId()==R.id.Anchor){
                replaceFragment(new AnchorFragment());
            } else if (item.getItemId()==R.id.In_Content) {
                replaceFragment(new InContentFragment());
            }else if (item.getItemId()==R.id.Native) {
                replaceFragment(new NativeFragment());
            }
            return true;
        });



    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();

    }
}
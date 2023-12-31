package com.example.fconnecttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NativeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NativeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NativeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NativeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NativeFragment newInstance(String param1, String param2) {
        NativeFragment fragment = new NativeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_native, container, false);
        WebView myWebView2 = view.findViewById(R.id.native_webview);
        myWebView2.getSettings().setJavaScriptEnabled(true);
        myWebView2.clearCache(true);
        myWebView2.getSettings().setDomStorageEnabled(true);
        myWebView2.loadUrl("https://embed.footylight.com/eyecon-test/index.html");

        WebView fconnectView = view.findViewById(R.id.fconnect_webview);
        fconnectView.getSettings().setJavaScriptEnabled(true);
        fconnectView.clearCache(true);
        fconnectView.getSettings().setDomStorageEnabled(true);
        fconnectView.loadUrl("https://fconnect.io/");
        return view;
    }
}
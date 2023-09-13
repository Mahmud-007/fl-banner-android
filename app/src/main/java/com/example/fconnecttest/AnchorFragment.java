package com.example.fconnecttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AnchorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AnchorFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AnchorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AnchorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AnchorFragment newInstance(String param1, String param2) {
        AnchorFragment fragment = new AnchorFragment();
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
        View view = inflater.inflate(R.layout.fragment_anchor, container, false);
        WebView myWebView1 = view.findViewById(R.id.webview1);
        myWebView1.getSettings().setJavaScriptEnabled(true);
        myWebView1.clearCache(true);
        myWebView1.getSettings().setDomStorageEnabled(true);
        myWebView1.loadUrl("https://www.bbc.com/news/world-us-canada-66779228");

        WebView myWebView2 = view.findViewById(R.id.webview2);
        myWebView2.getSettings().setJavaScriptEnabled(true);
        myWebView2.clearCache(true);
        myWebView2.getSettings().setDomStorageEnabled(true);
        myWebView2.loadUrl("https://embed.footylight.com/fconnect-widget_v2/fl-av-player.html");
        myWebView2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event)
            {
                return (event.getAction() == MotionEvent.ACTION_MOVE);
            }
        });
        return view;
    }
}
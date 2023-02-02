package com.example.kraft_hotel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ZNumber_fragment extends Fragment {
    String URL;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.znumber_fragment,container,false);
        WebView webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        URL = getArguments().getString("ZN");
        webView.loadUrl(URL);
        return view;
    }
}

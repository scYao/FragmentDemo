package com.example.yao.fragmentdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yao.fragmentdemo.R;

public class ShopFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shop_fragment, null);

        Bundle bundle = getArguments();
        if (bundle != null){
            String info = bundle.getString("info");
        }
        return view;
    }
}

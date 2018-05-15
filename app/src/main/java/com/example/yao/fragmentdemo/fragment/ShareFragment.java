package com.example.yao.fragmentdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yao.fragmentdemo.R;

public class ShareFragment extends Fragment {
    private MyListener listener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listener = (MyListener) getActivity();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.share_fragment, null);

        String s= "ss";
        listener.sendMessage(s);
        return view;
    }

    public interface MyListener{
        public abstract void sendMessage(String s);
    }
}

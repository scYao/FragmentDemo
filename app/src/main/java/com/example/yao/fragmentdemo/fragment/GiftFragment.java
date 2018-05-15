package com.example.yao.fragmentdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yao.fragmentdemo.R;

public class GiftFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gift_fragment, null);
        return view;
    }

    //fragment和fragment传值

    public void sendFragment() {
        //方法1
        OrderFragment orderFragment = getFragmentManager().findFragmentById(R.id.);
        String ss = "ss";
        orderFragment.setText(ss);

        //方法2
        TextView textView = getFragmentManager().findFragmentById().getView().findViewById();
        textView.setText("");

        //方法3
        TextView textView1 = getActivity().findViewById();
        textView1.setText();

    }
}

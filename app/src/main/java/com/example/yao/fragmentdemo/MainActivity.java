package com.example.yao.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import com.example.yao.fragmentdemo.fragment.GiftFragment;
import com.example.yao.fragmentdemo.fragment.OrderFragment;
import com.example.yao.fragmentdemo.fragment.ShareFragment;
import com.example.yao.fragmentdemo.fragment.ShopFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private RadioButton rb1,rb2, rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.content_layout, new ShopFragment());
        fragmentTransaction.commit();
    }

    private void initView() {
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        rb4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.rb1:
                fragmentTransaction.replace(R.id.content_layout, new ShopFragment());
                break;

            case R.id.rb2:
                fragmentTransaction.replace(R.id.content_layout, new ShareFragment());
                break;

            case R.id.rb3:
                fragmentTransaction.replace(R.id.content_layout,new GiftFragment());
                break;

            case R.id.rb4:
                fragmentTransaction.replace(R.id.content_layout,new OrderFragment());
                break;
        }

        fragmentTransaction.commit();

    }
}

package com.example.samsung.whatsapp;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager vp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setElevation(0);



        setContentView(R.layout.activity_main);
        //Configure Layout
        tabLayout = (TabLayout) findViewById(R.id.tab_offline);
        vp = (ViewPager) findViewById(R.id.viewPager);

        vp.setAdapter(new FragController(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(vp);
        tabLayout.getTabAt(0).setIcon(R.drawable.camera);
        //tabLayout.getTabAt(1).setIcon(R.drawable.mobile);
        vp.setCurrentItem(1);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
package com.example.samsung.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

/**
 * Created by samsung on 26/11/2017.
 */

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Claudimaicon");
        getSupportActionBar().setSubtitle("hoje as 13:00");

        ImageView imgCam = (ImageView) findViewById(R.id.imgCamera);
        imgCam.setImageResource(R.drawable.ic_action_cam);

        ImageView imgAttachment = (ImageView) findViewById(R.id.imgAttach);
        imgAttachment.setImageResource(R.drawable.ic_action_attachment);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabSend);
        fab.setImageResource(R.drawable.ic_action_send);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_coversa, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }

}

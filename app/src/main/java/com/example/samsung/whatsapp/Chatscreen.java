package com.example.samsung.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Chatscreen extends Fragment {
    public Chatscreen( ){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.chats, container, false);
        ListView lst = (ListView) root.findViewById(R.id.lvtView);

        List<Chats> samples = new ArrayList<>(10);
        samples.add(new Chats(R.drawable.avatar4, "Dispositivos Móveis", "+55 37 8847-6465: Vai ter aula a...", "20:04", null, R.drawable.one));
        samples.add(new Chats(R.drawable.avatar8, "Claudimaicon", "Você vai vim na cidade?", "19:46", null, R.drawable.one));
        samples.add(new Chats(R.drawable.avatar3, "Lanche Big Big", "Boa noite, está funcionando hoje?", "18:32", null, R.drawable.one));
        samples.add(new Chats(R.drawable.avatar1, "Eng Comp IFMG", "+55 37 9865-6139: Nem dupla...", "10:00", null, R.drawable.one));
        samples.add(new Chats(R.drawable.avatar, "Jogos", "", "", null));
        samples.add(new Chats(R.drawable.avatar6, "Logística SETC", "Douglas: Então", "ONTEM", null));
        samples.add(new Chats(R.drawable.avatar7, "Trabalho Resistência", "Anderson: Está chegando ai pra...", "ONTEM", null));
        samples.add(new Chats(R.drawable.avatar5, "Para Sempre", "+55 8807-5464: pra que dia...", "21/11/17", null));
        samples.add(new Chats(R.drawable.avatar2, "Organização SETC", "+55 37 9105-7526: ah sim", "20/11/17", null));
        samples.add(new Chats(R.drawable.avatar, "+55 37 9845-1342", "+55 37 9845-1342: oie S2", "18/11/17", null));

        ChatAdapter adapter = new ChatAdapter(samples, root.getContext());
        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(getActivity().getBaseContext(), MessageActivity.class);
                //myIntent.putExtra("test", "hello");
                startActivity(myIntent);
            }
        });

        return root;
    }
}

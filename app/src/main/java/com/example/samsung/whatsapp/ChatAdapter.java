package com.example.samsung.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ChatAdapter extends BaseAdapter{
    private final List<Chats> list;
    private final Context context;

    public ChatAdapter(List<Chats> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public List<Chats> getList() {
        return list;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        View v = LayoutInflater.from(context).inflate(R.layout.chat_item, parent, false);

        final Chats sample = list.get(position);

        ImageView icon = (ImageView)v.findViewById(R.id.imgSample);
        icon.setImageResource(sample.getImageID());

        TextView title = (TextView)v.findViewById(R.id.txtTitleItem);
        title.setText(sample.getTitulo());

        TextView description = (TextView)v.findViewById(R.id.txtDescriptionItem);
        description.setText(sample.getDescription());

        TextView hora = (TextView)v.findViewById(R.id.txtHora);
        hora.setText(sample.getHora());

        ImageView imgConversa = (ImageView)v.findViewById(R.id.imgConversa);
        imgConversa.setImageResource(sample.getImageConversa());
        /*Button btnGo = (Button)v.findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sample.getCls() != null){
                    Intent intent = new Intent(context, sample.getCls());
                    context.startActivity(intent);
                }
                else{
                    Toast.makeText(context, "Sorry, we need to write this code", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

        return v;
    }
}

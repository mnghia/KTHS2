package com.example.kt6_nghia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Adapterquocgia extends ArrayAdapter<Quocgia> {
    Context context;
    int res;
    ArrayList<Quocgia> listquocgia;
    public Adapterquocgia(@NonNull Context context, int resource, @NonNull ArrayList<Quocgia> objects) {
        super(context, resource, objects);
         this.context=context;
         this.res=resource;
         this.listquocgia = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView= LayoutInflater.from(context).inflate(res,parent,false);
        ImageView logo =convertView.findViewById(R.id.logo);
        TextView ten=convertView.findViewById(R.id.ten);
        TextView danso=convertView.findViewById(R.id.danso);
        Quocgia qg=listquocgia.get(position);
        int laco= qg.getLogo();
        logo.setImageResource(laco);
        String tenco=qg.getTen();
        ten.setText(tenco);
        String sodan=qg.getDanso();
        danso.setText(sodan);
         return convertView;
    }
}

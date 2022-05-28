package com.example.kt6_nghia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listlaco;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listlaco=findViewById(R.id.list_quocgia);
        ArrayList<Quocgia> quocgias=new ArrayList<>();
         Quocgia nuoc1 = new Quocgia(R.drawable.img,"Vietnam","98000000");
         quocgias.add(nuoc1);
        Quocgia nuoc2 = new Quocgia(R.drawable.img_1,"United States","320000000");
        quocgias.add(nuoc2);
        Quocgia nuoc3 = new Quocgia(R.drawable.img_2,"Russia","140000000");
        quocgias.add(nuoc3);
        Adapterquocgia adapterquocgia= new Adapterquocgia(MainActivity.this,R.layout.item_quocgia,quocgias);
       listlaco.setAdapter(adapterquocgia);
        listlaco.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               String nuoc;
               nuoc=quocgias.get(i).getTen();
                Toast.makeText(MainActivity.this,nuoc,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
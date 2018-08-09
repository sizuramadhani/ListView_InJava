package com.mada.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    String nama[] = {
      "Alpukat","Apel","Ceri","Durian","Jambu Air","Manggis","Strawberry"
    };
    int gambar [] = {
      R.drawable.alpukat, R.drawable.apel, R.drawable.ceri,R.drawable.jambuair, R.drawable.durian, R.drawable.manggis, R.drawable.strawberry
    };
    String isi[] = new String[]{

            String.valueOf(R.string.alpukat), String.valueOf(R.string.apel), String.valueOf(R.string.ceri), String.valueOf(R.string.durian),
            String.valueOf(R.string.jambuair), String.valueOf(R.string.manggis), String.valueOf(R.string.strawberry)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);


        //adapter listview
        adapter adapterListView = new adapter(this,gambar,nama,isi);
listView.setAdapter(adapterListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent a = new Intent(getApplicationContext(),detail.class);
        a.putExtra("nama",nama[i]);
        a.putExtra("isi",isi[i]);
        int c = gambar[i];
        a.putExtra("gambar",c);

        startActivity(a);
        }
        });
        }
        }

package com.mada.listview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;

/**
 * Created by Sizura on 07/11/2017.
 */

public class adapter extends ArrayAdapter {
    private final Activity context;
    private final int gambar[];
    private final String nama [];
    private final String isi [];

    public adapter( Activity context, int[] gambar, String[] nama, String[] isi) {
        super(context, R.layout.listitem,nama);
        this.context = context;
        this.gambar = gambar;
        this.nama = nama;
        this.isi = isi;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.listitem,null,true);
        TextView txt = (TextView)v.findViewById(R.id.textview);
        ImageView img = (ImageView) v.findViewById(R.id.imageview);

        txt.setText(nama[position]);
        img.setImageResource(gambar[position]);

        return v;

    }
}

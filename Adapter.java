package com.example.daftarmenumakanan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<Lauk> lauks;
    private Context context;

    public Adapter(ArrayList<Lauk> lauks, Context context) {
        this.lauks = lauks;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_lauk,parent,false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {
        Lauk lauk = lauks.get(position);
        holder.judul.setText(lauk.getJudul());
        holder.harga.setText(lauk.getHarga());
        holder.img.setImageResource(lauk.getImg());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,DetailLauk.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Lauk",lauks);
                i.putExtra("lauk",bundle);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lauks.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView judul, harga;
        public ImageView img;
        public Button btnDetail;
        public Holder(@NonNull View itemView) {
            super(itemView);


            judul = itemView.findViewById(R.id.judul);
            harga = itemView.findViewById(R.id.harga);
            img = itemView.findViewById(R.id.imglauk);
            btnDetail = itemView.findViewById(R.id.details);
        }
    }
}

package com.example.rosalia.primerparcialtp.Categoria;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rosalia.primerparcialtp.R;

/**
 * Created by Jona on 09/10/2016.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView txtCategoria;
    TextView txtDescripcion;
    private MyOnItemClick listener;
    private int position;

    public MyViewHolder(View itemView, MyOnItemClick listener)
    {
        super(itemView);
        txtCategoria=(TextView)itemView.findViewById(R.id.txtCategoria);
        txtDescripcion=(TextView)itemView.findViewById(R.id.txtDescripcion);
        itemView.setOnClickListener(this);
        this.listener= listener;
    }

    @Override
    public void onClick(View view) {
        listener.onItemClick(position);
    }
    public void setPosition(int position){
        this.position=position;
    }
}



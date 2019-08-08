package com.codeoptimizer.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {

    Context context;
    ArrayList<Contacts> arrayList;

    public AdapterClass(Context context,ArrayList<Contacts>arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contactdesign,parent,false);
        return new MyViewHolder(ItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Contacts contacts = arrayList.get(position);
        holder.image.setImageResource(contacts.getImage());
        holder.name.setText(contacts.getName());
        holder.phone.setText(contacts.getPhoneNumber());

    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView name;
        TextView phone;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.contactImage);
            name = (TextView)itemView.findViewById(R.id.txtName);
            phone =(TextView)itemView.findViewById(R.id.txtPhoneNumber);


        }
    }
}

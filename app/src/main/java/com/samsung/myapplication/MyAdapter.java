package com.samsung.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<String> data;

    MyAdapter(ArrayList<String> data) {
        this.data = data;
    }

    //Создается ViewHolder для каждого предмета в списке (только 1 раз)
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cat, parent, false);
        System.out.println("onCreateViewHolder");
        return new MyViewHolder(view);
    }

    //Соединяем данные с ViewHolder
    //Кладем данные во View
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        String s = data.get(position);
        System.out.println("onBindViewHolder");
        holder.bind(s);
    }

    //Сколько предметов в списке
    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView catNameTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            catNameTextView = itemView.findViewById(R.id.textView);
        }

        public void bind(String s) {
            catNameTextView.setText(s);
        }
    }
}

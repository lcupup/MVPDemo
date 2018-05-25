package com.xiaoa.mvpdemo.Main.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xiaoa.mvpdemo.R;

import java.util.List;

/**
 * Created by chao on 18/5/25.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.mViewHolder> {

    Context context;
    List<String> data;

    public MyAdapter( Context context,List<String> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new mViewHolder(LayoutInflater.from(context).inflate(R.layout.item_main, null));
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int position) {
        holder.textView.setText(data.get(position));

    }

    @Override
    public int getItemCount() {
        if (data != null) {
            return data.size();
        }

        return 0;
    }

    class mViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public mViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.desc);


        }
    }
}

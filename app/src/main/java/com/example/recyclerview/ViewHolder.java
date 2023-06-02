package com.example.recyclerview;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    protected TextView tv_name;
    protected TextView tv_singer;
    protected TextView tv_time;

    public ViewHolder(Context context, View itemView) {
        super(itemView);
        tv_name = itemView.findViewById(R.id.tv_name);
        tv_singer = itemView.findViewById(R.id.tv_singer);
        tv_time = itemView.findViewById(R.id.tv_time);
    }
    public void setItem(com.example.recyclerview.MusicInfo item){
        tv_name.setText(item.getName());
        tv_singer.setText(item.getSinger());
        tv_time.setText(item.getTime());
    }
}

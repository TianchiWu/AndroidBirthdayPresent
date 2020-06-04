package com.example.birthdaypresent2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGridViewAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private int[] images;
    private String[] text;
    public MyGridViewAdapter(Context context, int[] images, String[] text){
        this.images = images;
        this.text = text;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = layoutInflater.inflate(R.layout.layout_grid_item,null);
        ImageView iv =  v.findViewById(R.id.iv_gridview);
        TextView tv =  v.findViewById(R.id.tv_title);
        iv.setImageResource(images[position]);
        tv.setText(text[position]);
        return v;
    }
}

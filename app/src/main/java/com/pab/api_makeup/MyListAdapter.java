package com.pab.api_makeup;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mTitle;
    private final String[] mTanggal;
    private final String[] mTag;
    private final int[] mImg;

    public MyListAdapter(Activity context, String[] mTitle, String[] mTanggal, String[] mTag, int[] mImg) {
        super(context, R.layout.listitem, mTitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.mTitle = mTitle;
        this.mTanggal = mTanggal;
        this.mTag = mTag;
        this.mImg = mImg;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listitem, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.judul);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.gambar);
        TextView tanggal = (TextView) rowView.findViewById(R.id.tanggal);
        TextView tag = (TextView) rowView.findViewById(R.id.tag);

        titleText.setText(mTitle[position]);
        imageView.setImageResource(mImg[position]);
        tanggal.setText(mTanggal[position]);
        tag.setText(mTag[position]);

        return rowView;
    };
}
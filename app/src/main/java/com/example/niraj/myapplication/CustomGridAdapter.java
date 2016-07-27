package com.example.niraj.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Niraj on 7/27/2016.
 */
public class CustomGridAdapter extends BaseAdapter{
        private Context mContext;
        private final String[] names;
        private final Integer[] imageid;

        public CustomGridAdapter(Context c, String[] names, Integer[] imageid ) {
            mContext = c;
            this.imageid = imageid;
            this.names = names;
        }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.my_grid, null);
            ImageView imageView = (ImageView)grid.findViewById(R.id.imageView);

            imageView.setImageResource(imageid[position]);
        } else {
            grid = (View)convertView;
        }
        return grid;
    }
}

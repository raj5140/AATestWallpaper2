package com.example.rajiv_lapy.aatestwallpaper2;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Product> {
    ArrayList<Product> prod;
    Context context;
    int resource;

    public CustomListAdapter(Context context, int resource, ArrayList<Product> prod) {
        super(context, resource, prod);

        this.prod = prod;
        this.context = context;
        this.resource = resource;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.grid_item, null, true);
        }

        Product pro = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        Picasso.with(context).load(pro.getImage()).into(imageView);


//        TextView txtName=(TextView)convertView.findViewById(R.id.txtTitle);
//        txtName.setText(pro.getName());
//
//        TextView txtPrice=(TextView)convertView.findViewById(R.id.txtPrice);
//        txtPrice.setText(pro.getPrice());

        return convertView;

    }
}

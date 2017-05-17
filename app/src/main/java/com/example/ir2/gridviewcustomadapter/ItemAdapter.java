package com.example.ir2.gridviewcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ir2 on 5/17/2017.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
    int resource;

    // Constructor for ItemAdapter
    // Set resource from MainActivity to this resource
    public ItemAdapter(Context applicationContext, int grid_layout, ArrayList<Item> itemlist) {
        super(applicationContext, grid_layout, itemlist);
        this.resource = grid_layout;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout itemView;

        // ConvertView - The old view to reuse, if possible.
        // Note: You should check that this view is non-null and of an appropriate type before using.
        // If it is not possible to convert this view to display the correct data,
        // this method can create a new view.

        // Check convertView is null or not null
        if (convertView == null) {
            // Get Layout-INFLATER for create view
            itemView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
            vi.inflate(resource, itemView, true);

        }
        else {

            itemView = (LinearLayout) convertView;
        }
            // findViewById
            TextView tv_head = (TextView) itemView.findViewById(R.id.tv_head);
            ImageView iv_body = (ImageView) itemView.findViewById(R.id.iv_body);
            TextView tv_end = (TextView) itemView.findViewById(R.id.tv_end);

            // Get item position from Item class
            final Item item = getItem(position);

            // Set value
            tv_head.setText(item.head);
            iv_body.setImageResource(item.body);
            tv_end.setText(item.end);

        // Return view for display
        return itemView;

        }


}

package com.mobileapps.jera.listtworows;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by jera on 5/14/16.
 */
public class CustomAdapter extends ArrayAdapter {

    public static final int TYPE_ODD = 0;
    public static final int TYPE_EVEN = 1;


    private ListViewItem[] objects;

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        return objects[position].getType();
    }

    public CustomAdapter(Context context, int resource, ListViewItem[] objects) {
        super(context, resource, objects);
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;
        ListViewItem listViewItem = objects[position];
        int listViewItemType = getItemViewType(position);


        if (convertView == null) {

            if (listViewItemType == TYPE_EVEN) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.even, null);
            } else if (listViewItemType == TYPE_ODD) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.odd, null);
            }

            TextView textView = (TextView) convertView.findViewById(R.id.text);
            viewHolder = new ViewHolder(textView);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.getText().setText(listViewItem.getText());

        return convertView;
    }

}
package com.example.myday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DaysAdapter extends BaseAdapter {

    ArrayList<Days> daysArrayList;
    Context context;

    public DaysAdapter(ArrayList<Days> daysArrayList, Context context) {
        this.daysArrayList = daysArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return daysArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return daysArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list, parent, false);
        TextView textView = rowView.findViewById(R.id.one_row);
        textView.setText(daysArrayList.get(position).getDayName());
        return rowView;
    }
}

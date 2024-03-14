package com.example.bottomnav;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter {


    private String contactList[];
    private int people[];

    Context context;

    public customAdapter(String[] contactList, int[] people, Context context){
        this.contactList = contactList;
        this.people = people;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contactList.length;
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
        LayoutInflater layoutInflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_list_view, null);

        ImageView image = (ImageView) view.findViewById(R.id.icon_flag);
        TextView text_flag = (TextView) view.findViewById(R.id.text_data);

        image.setImageResource(people[position]);
        text_flag.setText(contactList[position]);

        return view;
    }
}

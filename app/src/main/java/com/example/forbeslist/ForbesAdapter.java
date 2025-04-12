package com.example.forbeslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.forbeslist.data.Person;

public class ForbesAdapter extends ArrayAdapter<Person> {
    public ForbesAdapter(Context context, Person[] arr) {
        super(context, R.layout.list_item, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
        }

        ((TextView) convertView.findViewById(R.id.nameTextView)).setText(person.name);
        ((TextView) convertView.findViewById(R.id.netWorthTextView)).setText(person.netWorth);
        ((ImageView) convertView.findViewById(R.id.flagImageView)).setImageResource(person.flagResId);

        return convertView;
    }
}
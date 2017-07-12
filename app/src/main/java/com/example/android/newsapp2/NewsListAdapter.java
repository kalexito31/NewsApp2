package com.example.android.newsapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kevin on 7/11/2017.
 */

public class NewsListAdapter extends ArrayAdapter<News> {

    public NewsListAdapter(Context context, List<News> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, null);
            viewHolder = new ViewHolder(convertView);
            viewHolder.titleTextView = (TextView) convertView.findViewById(R.id.news_title);
            viewHolder.sectionTextView = (TextView) convertView.findViewById(R.id.news_section);
            viewHolder.dateTextView = (TextView) convertView.findViewById(R.id.news_date);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        News currentNews = getItem(position);

        // Update the TextViews with the attributes for the current news
        viewHolder.titleTextView.setText(currentNews.getTitle());
        viewHolder.sectionTextView.setText(currentNews.getSection());

        //Format date and remove time
        String date = currentNews.getDate();
        date = date.substring(0, date.indexOf('T'));
        viewHolder.dateTextView.setText(date);

        return convertView;
    }

    //ViewHolder to hold all needed views for the ArrayAdapter
    class ViewHolder{
        TextView titleTextView;
        TextView sectionTextView;
        TextView dateTextView;

        ViewHolder (View view){
            titleTextView = (TextView) view.findViewById(R.id.news_title);
            sectionTextView = (TextView) view.findViewById(R.id.news_section);
            dateTextView = (TextView) view.findViewById(R.id.news_date);
        }
    }
}

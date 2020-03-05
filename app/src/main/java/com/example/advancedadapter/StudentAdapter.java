package com.example.advancedadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Student> mDataSource;

    public StudentAdapter(Context context, ArrayList<Student> students) {
        mContext = context;
        mInflator = (LayoutInflater) mContext.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
        mDataSource = students;
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflator.inflate(R.layout.list_view_row, parent, false);

        TextView lastName = rowView.findViewById(R.id.last_name);
        TextView firstName = rowView.findViewById(R.id.first_name);
        TextView major = rowView.findViewById(R.id.major);

        Student student = (Student) getItem(position);
        lastName.setText(student.getLastName());
        firstName.setText(student.getFirstName());
        major.setText(student.getMajor());

        return rowView;
    }
}

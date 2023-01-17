package com.example.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CountryAdapter extends BaseAdapter {
        Context context;
        ArrayList<CountryModal> mylist;

    public CountryAdapter (Context context, ArrayList<CountryModal> mylist)
        {
                this.context = context;
                this.mylist = mylist;
        }

        @Override
        public int getCount() {
            return mylist.size();
        }

        @Override
        public Object getItem(int i) {
            return mylist.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 1;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.customview,viewGroup, false);
            TextView name, code;
            ImageView flagImage;

            name =  view.findViewById(R.id.name);
            code = view.findViewById(R.id.code);
            flagImage = view.findViewById(R.id.flag);

            String cName;
            int cCode, cFlag;

            cName = mylist.get(i).getCountry();
            cCode = mylist.get(i).getCode();
            cFlag = mylist.get(i).getCflag();

            name.setText(cName);
            code.setText(String.valueOf(cCode));

            Glide.with(context).load(cFlag).override(50, 50).into(flagImage);

            return view;
        }
    }

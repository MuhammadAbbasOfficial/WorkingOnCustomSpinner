package com.example.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CountryModal> mylist;
    Spinner spinCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylist = new ArrayList();
        /*mylist.add("Pakistan");
        mylist.add("Afghanistan");
        mylist.add("India");
        mylist.add("France");
        mylist.add("China");
        mylist.add("Japan");*/
        mylist.add(new CountryModal("Pakistan",92,R.drawable.pak));
        mylist.add(new CountryModal("India",91,R.drawable.india));
        mylist.add(new CountryModal("Pakistan",86,R.drawable.china));
        mylist.add(new CountryModal("France",33,R.drawable.france));
        mylist.add(new CountryModal("Japan",81,R.drawable.japan));
        spinCountry = findViewById(R.id.myrec);

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,mylist);
        /*ArrayAdapter adapter = new ArrayAdapter(this, mylist);*/
        CountryAdapter adapter = new CountryAdapter(this, mylist);

        spinCountry.setAdapter(adapter);

    }
}

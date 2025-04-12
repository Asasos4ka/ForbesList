package com.example.forbeslist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.forbeslist.data.MyMonth;

public class MonthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        MyMonthAdapter adapter = new MyMonthAdapter(this, makeMonth());
        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(adapter);
    }

    MyMonth[] makeMonth() {
        MyMonth[] arr = new MyMonth[12];

        String[] monthArr = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        double[] tempArr = {-12.7, -11.3, -4.5, 7.7, 19.3, 23.9, 23.5, 22.8, 16.0, 5.2, -0.3, -9.3};

        int[] dayArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < arr.length; i++) {
            MyMonth month = new MyMonth();
            month.month = monthArr[i];
            month.temp = tempArr[i];
            month.days = dayArr[i];
            arr[i] = month;
        }
        return arr;
    }
}

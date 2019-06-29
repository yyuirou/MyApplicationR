package com.example.myapplicationr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class SampleActivity2 extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2);


        // idがdecisionButtonのボタンを取得
        Button buttonbutton = (Button) findViewById(R.id.decisionButton);
        buttonbutton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                // カレンダーであるDatePickerを取得
                DatePicker datePicker = (DatePicker) findViewById(R.id.date);
                // 選択した日付を文字列に変換（月は0～11で取得するので、+1をする）
                String dateStr = datePicker.getYear() + "年" + (datePicker.getMonth() + 1) + "月" + datePicker.getDayOfMonth() + "日";

                // TextViewに日付を表示する
                TextView textView = (TextView) findViewById(R.id.dateText);
                textView.setText(dateStr);
            }
        });
    }

}

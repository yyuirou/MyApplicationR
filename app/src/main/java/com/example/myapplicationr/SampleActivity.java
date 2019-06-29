package com.example.myapplicationr;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.TextView;

public class SampleActivity extends AppCompatActivity implements View.OnClickListener{  //クリックリスナーを実装

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_sample);
      //  setContentView(R.layout.activity_sample2);


        findViewById(R.id.button10).setOnClickListener(this);  //リスナーをボタンに登録

    }

    //ボタンが押された時の処理
    public void onClick(View view){
        //ここに遷移するための処理を追加する
        Intent intent = new Intent(this, SampleActivity2.class);
        startActivity(intent);
    }
}




    /*// ボタンイベント
    public void SetButtonOnClick(View v) {

        switch (v.getId()) {
            case R.id.button9:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            case R.id.button10:
                intent = new Intent(this, SampleActivity2.class);
                startActivity(intent);


        }

    }*/







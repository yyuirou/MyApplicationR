package com.example.myapplicationr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);  //リスナーをボタンに登録
        findViewById(R.id.button2).setOnClickListener(this);  //リスナーをボタンに登録
        findViewById(R.id.button3).setOnClickListener(this);  //リスナーをボタンに登録
        findViewById(R.id.button4).setOnClickListener(this);  //リスナーをボタンに登録
        findViewById(R.id.button5).setOnClickListener(this);  //リスナーをボタンに登録
        findViewById(R.id.button6).setOnClickListener(this);  //リスナーをボタンに登録
        findViewById(R.id.button7).setOnClickListener(this);  //リスナーをボタンに登録
        findViewById(R.id.button8).setOnClickListener(this);  //リスナーをボタンに登録

        //時刻表示するコードを追加
        Calendar cal = Calendar.getInstance();       //カレンダーを取得

        int iYear = cal.get(Calendar.YEAR);         //年を取得
        int iMonth = cal.get(Calendar.MONTH);       //月を取得
        int iDate = cal.get(Calendar.DATE);         //日を取得
        int iHour = cal.get(Calendar.HOUR);         //時を取得
        int iMinute = cal.get(Calendar.MINUTE);    //分を取得
        int iSecond = cal.get(Calendar.SECOND);    //分を取得

        String strDay = iYear + "年" + iMonth + "月" + iDate + "日";     //日付を表示形式で設定
        String strTime = iHour + "時" + iMinute + "分" + iSecond + "秒"; //時刻を表示形式で設

        TextView tv = (TextView) findViewById(R.id.textView3);
        tv.setText("現在の日時：" + strDay + strTime);
//ここまで


    }



    //ボタンが押された時の処理
    public void onClick(View view){
        //ここに遷移するための処理を追加する
        Intent intent = new Intent(this, SampleActivity.class);
        startActivity(intent);

    }




}

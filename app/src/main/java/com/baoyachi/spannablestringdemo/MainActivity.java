package com.baoyachi.spannablestringdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showForegroundColorSpan();
        showBackgroundColorSpan();
    }

    /**
     * 设置文本前景色
     */
    private void showForegroundColorSpan()
    {
        TextView tvForegroundColorSpan = (TextView) findViewById(R.id.tv_foreground_color_span);
        SpannableString spannableString = new SpannableString("这是测试第一行文字的前景色");
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#FF8892"));
        spannableString.setSpan(colorSpan, 4, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvForegroundColorSpan.setText(spannableString);
    }

    /**
     * 设置文本背景色
     */
    private void showBackgroundColorSpan()
    {
        TextView tvBackgroundColorSpan = (TextView) findViewById(R.id.tv_background_color_span);
        SpannableString spannableString = new SpannableString("这是测试第二行文字的背景色");
        BackgroundColorSpan colorSpan = new BackgroundColorSpan(Color.parseColor("#FF8892"));
        spannableString.setSpan(colorSpan, 4, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvBackgroundColorSpan.setText(spannableString);
    }
}


package com.example.birthdaypresent2019.Feature;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.birthdaypresent2019.PictureActivity.ChildActivity;
import com.example.birthdaypresent2019.R;

public class VideoActivity extends AppCompatActivity {
    private TextView tv1;//中划线
    private ImageView pic1,pic2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_video);

        tv1=findViewById(R.id.video_explain);
        tv1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        pic1=findViewById(R.id.child);
        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VideoActivity.this,"害，小时候的我是多么卡哇伊，而如今...",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(VideoActivity.this, ChildActivity.class);
                startActivity(intent);
            }
        });

        pic2=findViewById(R.id.xixixi);
        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VideoActivity.this,"略略略",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

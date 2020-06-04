package com.example.birthdaypresent2019.Feature;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.birthdaypresent2019.R;

public class LoveWords extends AppCompatActivity {

    private MediaPlayer mp1,mp2,mp3;
    private Button speak1,speak2,speak3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_speak);

        mp1=MediaPlayer.create(this,R.raw.lovetalk_1);
        speak1=findViewById(R.id.speak1);
        speak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });

        mp2=MediaPlayer.create(this,R.raw.lovetalk_2);
        speak2=findViewById(R.id.speak2);
        speak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });

        mp3=MediaPlayer.create(this,R.raw.lovetalk_3);
        speak3=findViewById(R.id.speak3);
        speak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp1 != null) {
            mp1.stop();
            mp1.release();
        }

        else if(mp2!=null){
            mp2.stop();
            mp2.release();
        }
        else if(mp3!=null){
            mp3.stop();
            mp3.release();
        }
    }

}

package com.example.birthdaypresent2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.birthdaypresent2019.Feature.LoveWords;
import com.example.birthdaypresent2019.Feature.StoryActivity;
import com.example.birthdaypresent2019.Feature.VideoActivity;

/*
MainActivity的布局是GridView,
有三个子程序排布
 */
public class MainActivity extends AppCompatActivity {
    //picture-int[]  text-String[]
    private int[] images={R.drawable.heart,R.drawable.cartoon_panda,R.drawable.cartoon_rabit};
    private String[] text={"土味情话集","闪瞎你狗眼","天天讲故事"};
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gv);
        gridView.setAdapter(new MyGridViewAdapter(this,images,text));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=null;
                switch (position){
                    //土味情话
                    case 0:
                        Toast.makeText(MainActivity.this,"超级尬",Toast.LENGTH_SHORT).show();
                        intent=new Intent(MainActivity.this, LoveWords.class);
                        startActivity(intent);
                        break;
                    //收录视频
                    case 1:
                        Toast.makeText(MainActivity.this,"前方高能",Toast.LENGTH_SHORT).show();
                        intent=new Intent(MainActivity.this, VideoActivity.class);
                        startActivity(intent);
                        break;
                     // 讲故事
                    case 2:
                        Toast.makeText(MainActivity.this,"好故事，在这里（划掉",Toast.LENGTH_SHORT).show();
                        intent=new Intent(MainActivity.this, StoryActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

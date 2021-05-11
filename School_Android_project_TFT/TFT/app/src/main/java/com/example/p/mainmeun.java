package com.example.p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class mainmeun extends AppCompatActivity {

    private Context mContext;
    private ViewFlipper vflp_help;
    private int[] resId = {R.drawable.pengu, R.drawable.riven,
            R.drawable.ahri, R.drawable.projectvayne};

    private final static int MIN_MOVE = 200;   //最小距离
    private MyGestureListener mgListener;
    private GestureDetector mDetector;
    private Button button_URL, button_URL2, button_URL3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmeun);
        getSupportActionBar().setTitle("Menu");

        vflp_help = (ViewFlipper) findViewById(R.id.vflp_help);
        vflp_help.startFlipping();

        button_URL = findViewById(R.id.btnURL);
        button_URL2 = findViewById(R.id.btnURL2);
        button_URL3 = findViewById(R.id.btnURL3);

        button_URL.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=MGhJvoKCX5g&ab_channel=Redox-TeamfightTacticsTFT");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        button_URL2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ol4XYVqt-GQ&ab_channel=TeamfightTacticsbyGiantSlayer");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        button_URL3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Elqn_p1VlsA&ab_channel=Redox-TeamfightTacticsTFT");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });


        mContext = mainmeun.this;
        //实例化SimpleOnGestureListener与GestureDetector对象
        mgListener = new MyGestureListener();
        mDetector = new GestureDetector(this, mgListener);
        vflp_help = (ViewFlipper) findViewById(R.id.vflp_help);
        //动态导入添加子View
        for(int i = 0;i < resId.length;i++){
            vflp_help.addView(getImageView(resId[i]));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_settings was selected
            case R.id.home:
                Intent i = new Intent(mainmeun.this, mainmeun.class);
                startActivity(i);
                break;
            case R.id.champions:
                i = new Intent(mainmeun.this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.team_comps:
                i = new Intent(mainmeun.this, TeamComps.class);
                startActivity(i);
                break;
            case R.id.items:
                i = new Intent(mainmeun.this, Items.class);
                startActivity(i);
                break;
            case R.id.chLevel:
                i = new Intent(mainmeun.this, ChampionsLevel.class);
                startActivity(i);
                break;
            case R.id.login:
                i = new Intent(mainmeun.this, Login.class);
                startActivity(i);
                break;
            case R.id.game:
                i = new Intent(mainmeun.this, Game.class);
                startActivity(i);
                break;
            case R.id.patchnotes:
                i = new Intent(mainmeun.this, patchnotes.class);
                startActivity(i);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //重写onTouchEvent触发MyGestureListener里的方法
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mDetector.onTouchEvent(event);
    }


    //自定义一个GestureListener,这个是View类下的，别写错哦！！！
    private class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float v, float v1) {
            if(e1.getX() - e2.getX() > MIN_MOVE){
                vflp_help.setInAnimation(mContext, R.anim.right_in);
                vflp_help.setOutAnimation(mContext, R.anim.right_out);
                vflp_help.showNext();
            }else if(e2.getX() - e1.getX() > MIN_MOVE){
                vflp_help.showPrevious();
            }
            return true;
        }
    }

    private ImageView getImageView(int resId){
        ImageView img = new ImageView(this);
        img.setBackgroundResource(resId);
        return img;
    }


}
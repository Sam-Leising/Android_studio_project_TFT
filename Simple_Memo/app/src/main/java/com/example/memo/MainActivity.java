package com.example.memo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton add_button;

    MemoDatabase MDB;
    ArrayList<String> memo_id,memo_title, memo_content;
    MemoAdapter memoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            //點擊圖標跳轉去layout of activity_add_memo
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddMemoActivity.class); //
                startActivity(intent);
            }
        });
        MDB = new MemoDatabase(MainActivity.this);
        memo_id = new ArrayList<>();
        memo_title = new ArrayList<>();
        memo_content = new ArrayList<>();

        memoAdapter = new MemoAdapter(MainActivity.this,this,memo_id,memo_title,memo_content);
        recyclerView.setAdapter(memoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        displayData();//運行下面的displayData方法
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==1){
            recreate();
        }
    }

    //顯示數據依照row_item.xml格式
    void displayData(){
        Cursor cursor = MDB.readData();

        //如果數據庫中沒有data，將會顯示No data
        if (cursor.getCount()==0){
            Toast.makeText(this,"No data",Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()){
                memo_id.add(cursor.getString(0));
                memo_title.add(cursor.getString(1));
                memo_content.add(cursor.getString(2)); //while 循環依順序顯示
            }
        }
    }
}
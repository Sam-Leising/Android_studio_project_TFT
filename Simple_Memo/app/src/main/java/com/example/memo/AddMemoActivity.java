package com.example.memo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddMemoActivity extends AppCompatActivity {
    EditText title_input, content_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_memo);

        //定義
        title_input = findViewById(R.id.title_input);
        content_input = findViewById(R.id.content_input);
        add_button = findViewById(R.id.add_button);

        //創建一個點擊功能
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MemoDatabase MDB = new MemoDatabase(AddMemoActivity.this);

                //鏈接 MemoDatabase 中的方法 addMemo，將兩個input中的數據轉成string並去除空白在放入本地數據庫中
                MDB.addMemo(title_input.getText().toString().trim(),
                        content_input.getText().toString().trim());
            }
        });
    }
}
package com.example.memo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MemoUpdateActivity extends AppCompatActivity {
    EditText title_input, content_input;
    Button update_button, delete_button;

    String id,title,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_update);

        title_input = findViewById(R.id.title_input2);
        content_input = findViewById(R.id.content_input2);
        update_button = findViewById(R.id.update_button);
        getAndSetIntentData();
        delete_button = findViewById(R.id.delete_button);

        //activity_memo_update中的update button 點擊方法
        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MemoDatabase MDB = new MemoDatabase(MemoUpdateActivity.this);
                title = title_input.getText().toString().trim();        //轉換格式，除空白
                content = content_input.getText().toString().trim();    //轉換格式，除空白
                MDB.updateData(id,title,content); //將數據送去MemoDatabase.java中的方法updateData中執行更新
            }
        });
        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmDialog();//執行下方confirmDialog()方法
            }
        });
    }

    //獲取數據庫中對應id的數據
    void getAndSetIntentData(){
        if(getIntent().hasExtra("id") && getIntent().hasExtra("title") && getIntent().hasExtra("content")) {
            id = getIntent().getStringExtra("id");
            title = getIntent().getStringExtra("title");
            content = getIntent().getStringExtra("content");

            title_input.setText(title);
            content_input.setText(content);
        }else{
            Toast.makeText(this,"No data.",Toast.LENGTH_SHORT).show();
        }
    }


    void confirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete "+title+" ?");                             //窗口標題
        builder.setMessage("Are you sure want to delete "+title+" ?");      //窗口内容
        //點擊Yes，執行MemoDatabase.java 中deleteRow方法
        builder.setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MemoDatabase MDB= new MemoDatabase(MemoUpdateActivity.this);
                MDB.deleteRow(id);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show(); //顯示彈窗信息
    }
}
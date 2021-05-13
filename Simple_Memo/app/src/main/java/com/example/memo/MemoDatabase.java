package com.example.memo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MemoDatabase extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME = "MemoData.db";
    private static final int DATABASE_VERSION =1;

    private static final String TABLE_NAME = "Memo";
    private static final String COLUMN_ID ="memo_id";
    private static final String COLUMN_TITLE ="memo_title";
    private static final String COLUMN_CONTENT = "memo_content";

    public MemoDatabase(@Nullable Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //SQL create 語句
        //create table table_name(column_name  char  null);
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                +COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +COLUMN_TITLE + " TEXT, "
                +COLUMN_CONTENT + " TEXT);";

        db.execSQL(query); //執行上述語句
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);  //如果數據庫中有同名table，將刪除
        onCreate(db);                                      //在創建table
    }

    //創建一個新的Memo
    void  addMemo(String title, String content){
        SQLiteDatabase db = this.getWritableDatabase(); //以讀寫方式打開數據庫
        ContentValues cv = new ContentValues();         //對應列的值擺入cv中

        cv.put(COLUMN_TITLE,title);  //title數據對應COLUMN_TITLE的列
        cv.put(COLUMN_CONTENT,content); //content的數據對應COLUMN_CONTENT的列
        long result = db.insert(TABLE_NAME, null, cv);
        Toast.makeText(context,"Added Memo Successfully",Toast.LENGTH_SHORT).show();//創建成功顯示氣泡提示框
    }

    Cursor readData(){
        //SQL查詢語句 SELECT　＊　From  table
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase(); //以讀寫方式打開數據庫
        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query,null);
        }
        return cursor;
    }

    //更新原有的數據
    void updateData(String row_id, String title, String content){
        SQLiteDatabase db = this.getWritableDatabase(); //以讀寫方式打開數據庫
        ContentValues cv = new ContentValues();         //對應列的值擺入cv中

        cv.put(COLUMN_TITLE,title);
        cv.put(COLUMN_CONTENT,content);

        long result = db.update(TABLE_NAME, cv, "memo_id=?", new String[]{row_id});
        Toast.makeText(context,"Update Successfully",Toast.LENGTH_SHORT).show();//創建成功顯示氣泡提示框

    }

    //刪除數據行
    void deleteRow(String row_id){
        SQLiteDatabase db = this.getWritableDatabase(); //以讀寫方式打開數據庫
        long result = db.delete(TABLE_NAME,"memo_id=?", new String[]{row_id});
        Toast.makeText(context,"delete Successfully",Toast.LENGTH_SHORT).show();//創建成功顯示氣泡提示框

    }
}

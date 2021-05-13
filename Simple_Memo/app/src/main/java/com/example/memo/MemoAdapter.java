package com.example.memo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MemoAdapter extends RecyclerView.Adapter<MemoAdapter.MyViewHolder> {
    private Context context;
    private ArrayList memo_id, memo_title,memo_content;
    Activity activity;

    public MemoAdapter(Activity activity, Context context, ArrayList memo_id, ArrayList memo_title, ArrayList memo_content) {
        this.activity = activity;
        this.context = context;
        this.memo_id = memo_id;
        this.memo_title = memo_title;
        this.memo_content = memo_content;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView memo_id_txt,memo_title_txt, memo_content_txt;
        LinearLayout mainLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            memo_id_txt = itemView.findViewById(R.id.memo_id_txt);
            memo_title_txt = itemView.findViewById(R.id.memo_title_txt);
            memo_content_txt = itemView.findViewById(R.id.memo_content_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }



    @NonNull
    @Override
    public MemoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =  inflater.inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    //綁定數據
    public void onBindViewHolder(@NonNull MemoAdapter.MyViewHolder holder, int position) {
        holder.memo_id_txt.setText(String.valueOf(memo_id.get(position)));
        holder.memo_title_txt.setText(String.valueOf(memo_title.get(position)));
        holder.memo_content_txt.setText(String.valueOf(memo_content.get(position)));

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MemoUpdateActivity.class);
                intent.putExtra("id",String.valueOf(memo_id.get(position)));
                intent.putExtra("title",String.valueOf(memo_title.get(position)));
                intent.putExtra("content",String.valueOf(memo_content.get(position)));
                activity.startActivityForResult(intent,1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return memo_id.size();
    }


}

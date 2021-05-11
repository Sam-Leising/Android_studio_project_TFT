package com.example.p.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p.Champions_detail;
import com.example.p.model.Champions_UserData;
import com.example.p.R;
import com.example.p.model.Champions_UserData;

import java.util.ArrayList;
import java.util.List;

public class Champions_RecyclerviewAdapter extends RecyclerView.Adapter<com.example.p.adapter.Champions_RecyclerviewAdapter.RecyclerviewHolder>{
    Context context;
    List<Champions_UserData> userDataList;
    List<Champions_UserData> filteredUserDataList;


    public Champions_RecyclerviewAdapter(Context context, List<Champions_UserData> userDataList) {
        this.context = context;
        this.userDataList = userDataList;
        this.filteredUserDataList = userDataList;
    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.champions_recycleview_item, parent, false);
        return new RecyclerviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {

        holder.userName.setText(filteredUserDataList.get(position).getUserName());
        holder.userImage.setImageResource(filteredUserDataList.get(position).getImageUrl());

//        ItemAnimation.animateFadeIn(holder.itemView, position);     //進入動畫



        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(context,"User Name : "+filteredUserDataList.get(position).getUserName(),Toast.LENGTH_SHORT).show();

            }
        });



        holder.userImage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Champions_detail.class);
                intent.putExtra("picture", filteredUserDataList.get(position).getImageUrl());
                intent.putExtra("username",filteredUserDataList.get(position).getUserName());
                intent.putExtra("item1", filteredUserDataList.get(position).getItem1());
                intent.putExtra("item2", filteredUserDataList.get(position).getItem2());
                intent.putExtra("item3", filteredUserDataList.get(position).getItem3());
                intent.putExtra("cost",filteredUserDataList.get(position).getCost());
                intent.putExtra("health",filteredUserDataList.get(position).getHealth());
                intent.putExtra("mana",filteredUserDataList.get(position).getMana());
                intent.putExtra("armor",filteredUserDataList.get(position).getArmor());
                intent.putExtra("mr",filteredUserDataList.get(position).getMr());
                intent.putExtra("dps",filteredUserDataList.get(position).getDps());
                intent.putExtra("damage",filteredUserDataList.get(position).getDamage());
                intent.putExtra("atk_spd",filteredUserDataList.get(position).getAtk_spd());
                intent.putExtra("crit_rate",filteredUserDataList.get(position).getCrit_rate());
                intent.putExtra("range",filteredUserDataList.get(position).getRange());
                context.startActivity(intent);



            }
        });
    }






    @Override
    public int getItemCount() {
        return filteredUserDataList.size();
    }

    public static final class RecyclerviewHolder extends RecyclerView.ViewHolder {


        ImageView userImage;
        TextView userName;

        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.userImage);
            userName = itemView.findViewById(R.id.userName);
        }
    }


    public Filter getFilter(){

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String Key = charSequence.toString();
                if(Key.isEmpty()){
                    filteredUserDataList = userDataList;
                }
                else{

                    List<Champions_UserData> lstFiltered = new ArrayList<>();
                    for(Champions_UserData row: userDataList){
                        if(row.getUserName().toLowerCase().contains(Key.toLowerCase())){
                            lstFiltered.add(row);

                        }
                    }

                    filteredUserDataList = lstFiltered;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredUserDataList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

                filteredUserDataList = (List<Champions_UserData>)filterResults.values;
                notifyDataSetChanged();

            }
        };

    }
}

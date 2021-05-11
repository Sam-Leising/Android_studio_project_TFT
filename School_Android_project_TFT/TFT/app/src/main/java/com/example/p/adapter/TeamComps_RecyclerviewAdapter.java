package com.example.p.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p.R;
import com.example.p.model.Champions_UserData;
import com.example.p.model.TeamComps_UserData;

import java.util.ArrayList;
import java.util.List;

public class TeamComps_RecyclerviewAdapter extends RecyclerView.Adapter<TeamComps_RecyclerviewAdapter.VersionVH> {
    List<com.example.p.model.TeamComps_UserData> versionsList;
    Context context;
//    List<TeamComps_UserData> filteredUserDataList;

    public TeamComps_RecyclerviewAdapter(Context context,List<com.example.p.model.TeamComps_UserData> versionsList) {
        this.versionsList = versionsList;
        this.context = context;
//        this.filteredUserDataList = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_comps_list_items,parent, false);
        return new VersionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        com.example.p.model.TeamComps_UserData versions=versionsList.get(position);
        holder.userName.setText(versions.getUserName());
        holder.userName1.setText(versions.getUserName1());
        holder.userName2.setText(versions.getUserName2());
        holder.userName3.setText(versions.getUserName3());
        holder.userImage.setImageResource(versions.getImageUrl());
        holder.image1.setImageResource(versions.getImageUrl1());
        holder.image2.setImageResource(versions.getImageUrl2());
        holder.image3.setImageResource(versions.getImageUrl3());
        holder.image4.setImageResource(versions.getImageUrl4());
        holder.image5.setImageResource(versions.getImageUrl5());
        holder.image6.setImageResource(versions.getImageUrl6());
        holder.image7.setImageResource(versions.getImageUrl7());
        holder.image8.setImageResource(versions.getImageUrl8());
        holder.image10.setImageResource(versions.getImageUrl10());
        holder.image11.setImageResource(versions.getImageUrl11());
        holder.image12.setImageResource(versions.getImageUrl12());
        holder.image13.setImageResource(versions.getImageUrl13());
        holder.image14.setImageResource(versions.getImageUrl14());
        holder.image15.setImageResource(versions.getImageUrl15());
        holder.image16.setImageResource(versions.getImageUrl16());
        holder.image17.setImageResource(versions.getImageUrl17());
        holder.image18.setImageResource(versions.getImageUrl18());


        boolean isExpandable = versionsList.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return versionsList.size();
    }

    public class VersionVH extends RecyclerView.ViewHolder {

        TextView userName, userName1, userName2, userName3;
        ConstraintLayout constraintLayout;
        RelativeLayout expandableLayout;

        ImageView userImage,image1,image2,image3,image4,image5,image6,image7,image8,image10,image11,image12,image13,image14,image15,image16,image17,image18;

        public VersionVH(@NonNull View itemView) {
            super(itemView);

            userName = itemView.findViewById(R.id.userName);
            userName1 = itemView.findViewById(R.id.userName1);
            userName2 = itemView.findViewById(R.id.userName2);
            userName3 = itemView.findViewById(R.id.userName3);
            userImage = itemView.findViewById(R.id.userImage);
            image1=itemView.findViewById(R.id.image1);
            image2=itemView.findViewById(R.id.image2);
            image3=itemView.findViewById(R.id.image3);
            image4=itemView.findViewById(R.id.image4);
            image5=itemView.findViewById(R.id.image5);
            image6=itemView.findViewById(R.id.image6);
            image7=itemView.findViewById(R.id.image7);
            image8=itemView.findViewById(R.id.image8);
            image10=itemView.findViewById(R.id.image10);
            image11=itemView.findViewById(R.id.image11);
            image12=itemView.findViewById(R.id.image12);
            image13=itemView.findViewById(R.id.image13);
            image14=itemView.findViewById(R.id.image14);
            image15=itemView.findViewById(R.id.image15);
            image16=itemView.findViewById(R.id.image16);
            image17=itemView.findViewById(R.id.image17);
            image18=itemView.findViewById(R.id.image18);



            constraintLayout = itemView.findViewById(R.id.constraintlayout);
            expandableLayout=itemView.findViewById(R.id.expandable_layout);

            constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    com.example.p.model.TeamComps_UserData versions = versionsList.get(getAdapterPosition());
                    versions.setExpandable(!versions.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
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


//    public Filter getFilter(){
//
//        return new Filter() {
//            @Override
//            protected FilterResults performFiltering(CharSequence charSequence) {
//
//                String Key = charSequence.toString();
//                if(Key.isEmpty()){
//                    versionsList = versionsList;
//                }
//                else{
//
//                    List<TeamComps_UserData> lstFiltered = new ArrayList<>();
//                    for(TeamComps_UserData row: versionsList){
//                        if(row.getUserName().toLowerCase().contains(Key.toLowerCase())){
//                            lstFiltered.add(row);
//
//                        }
//                    }
//
//                    versionsList = lstFiltered;
//                }
//
//                FilterResults filterResults = new FilterResults();
//                filterResults.values = versionsList;
//                return filterResults;
//            }
//
//            @Override
//            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
//
//                versionsList = (List<TeamComps_UserData>)filterResults.values;
//                notifyDataSetChanged();
//
//            }
//        };
//
//    }
}

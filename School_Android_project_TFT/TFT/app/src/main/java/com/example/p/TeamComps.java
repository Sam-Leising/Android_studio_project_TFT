package com.example.p;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.p.adapter.TeamComps_RecyclerviewAdapter;
import com.example.p.model.TeamComps_UserData;

import java.util.ArrayList;
import java.util.List;

public class TeamComps extends AppCompatActivity {

    RecyclerView recyclerView;
    List<TeamComps_UserData> userDataList;
//    EditText searchView;
//    CharSequence search="";
//    TeamComps_RecyclerviewAdapter RecyclerviewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_comps);
        getSupportActionBar().setTitle("LOL");
        recyclerView = findViewById(R.id.recyclerView);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        initData();
        setRecyclerView();


//        searchView.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                RecyclerviewAdapter.getFilter().filter(charSequence);
//                search = charSequence;
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
    }
    private void setRecyclerView() {
        TeamComps_RecyclerviewAdapter RecyclerviewAdapter = new TeamComps_RecyclerviewAdapter(this,userDataList);
        recyclerView.setAdapter(RecyclerviewAdapter);
        recyclerView.setHasFixedSize(true);
//        RecyclerviewAdapter = new TeamComps_RecyclerviewAdapter(this,userDataList);
    }

    private void initData() {

        userDataList = new ArrayList<>();

        userDataList.add(new TeamComps_UserData("Chosen Mages", "Early Comp", "Traits", "Positiobing", R.drawable.level_s, R.drawable.h_brand, R.drawable.h_twistedfate, R.drawable.h_annie, R.drawable.h_braum, R.drawable.h_lulu, R.drawable.h_veigar, R.drawable.h_aurelion_sol, R.drawable.h_ornn, R.drawable.h_annie, R.drawable.h_jarvaniv, R.drawable.h_lulu, R.drawable.h_rakan, R.drawable.h_veigar, R.drawable.team1_mage, R.drawable.team1_black, R.drawable.team1_wood, R.drawable.team1));
        userDataList.add(new TeamComps_UserData("Chosen Keppers", "Early Comp", "Traits", "Positiobing", R.drawable.level_s, R.drawable.h_jarvaniv, R.drawable.h_rakan, R.drawable.h_kennen, R.drawable.h_kindred, R.drawable.h_aatrox, R.drawable.h_xayah, R.drawable.h_azir, R.drawable.h_ornn, R.drawable.h_annie, R.drawable.h_jarvaniv, R.drawable.h_lulu, R.drawable.h_rakan, R.drawable.h_veigar, R.drawable.c_keeper, R.drawable.team2_king, R.drawable.team1_black, R.drawable.team2));
        userDataList.add(new TeamComps_UserData("Chosen Sharp", "Early Comp", "Traits", "Positiobing", R.drawable.level_s, R.drawable.h_diana, R.drawable.h_tristana, R.drawable.h_teemo, R.drawable.h_sivir, R.drawable.h_yuumi, R.drawable.h_kindred, R.drawable.h_shen,R.drawable.h_irelia, R.drawable.h_diana, R.drawable.h_tristana, R.drawable.h_teemo, R.drawable.h_kindred, R.drawable.h_yuumi, R.drawable.team3_shoot, R.drawable.team3_spirit, R.drawable.team3_mystic, R.drawable.team3));
        userDataList.add(new TeamComps_UserData("Vanguard Mystics", "Early Comp", "Traits", "Positiobing", R.drawable.level_a, R.drawable.h_nautilus, R.drawable.h_neeko, R.drawable.h_yuumi, R.drawable.h_aatrox, R.drawable.h_chogath, R.drawable.h_sejuani, R.drawable.h_ornn,R.drawable.h_zilean, R.drawable.h_maokai, R.drawable.h_janna, R.drawable.h_nautilus, R.drawable.h_neeko, R.drawable.h_chogath, R.drawable.team4_mystic, R.drawable.team3_fabled, R.drawable.team1_black, R.drawable.team4));
        userDataList.add(new TeamComps_UserData("Chosen Brawlers", "Early Comp", "Traits", "Positiobing", R.drawable.level_a, R.drawable.h_maokai, R.drawable.h_tahmkench, R.drawable.h_vi, R.drawable.h_nunu, R.drawable.h_shyvana, R.drawable.h_chogath, R.drawable.h_ornn,R.drawable.h_sett, R.drawable.h_maokai, R.drawable.h_lulu, R.drawable.h_nunu, R.drawable.h_shyvana, R.drawable.h_chogath, R.drawable.team4_brawler, R.drawable.team1_black, R.drawable.team1_wood, R.drawable.team5));


        // Change SupportActionBar text


    }



    //menu    menu    menu    menu    menu    menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(this, mainmeun.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }


}
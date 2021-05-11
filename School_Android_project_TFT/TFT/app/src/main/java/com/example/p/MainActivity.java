package com.example.p;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import com.example.p.adapter.Champions_RecyclerviewAdapter;
import com.example.p.model.Champions_UserData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView userRecycler;
    Champions_RecyclerviewAdapter recyclerviewAdapter;
    EditText searchView;
    CharSequence search="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView = findViewById(R.id.search_bar);
        getSupportActionBar().setTitle("Champions");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Change SupportActionBar text

        List<Champions_UserData> userDataList = new ArrayList<>();
        userDataList.add(new Champions_UserData("Samira",R.drawable.h_samira,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Aatrox",R.drawable.h_aatrox,R.drawable.i_gargoyle,R.drawable.i_sunfirecape,R.drawable.i_warmogsarmor,"4","850/1530/2754","150","70","40","39/70/126","60/108/194","0.65","25%","1"));
        userDataList.add(new Champions_UserData("Aurelion",R.drawable.h_aurelion_sol,R.drawable.i_bluebuff,R.drawable.i_hextechgunblade,R.drawable.i_jeweled,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Azir",R.drawable.h_azir,R.drawable.i_guardianangel,R.drawable.i_guinsoos,R.drawable.i_spearofshojin,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Chogath",R.drawable.h_chogath,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Katarina",R.drawable.h_katarina,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Kennen",R.drawable.h_kennen,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Leesin",R.drawable.h_leesin,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Olaf",R.drawable.h_olaf,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Ornn",R.drawable.h_ornn,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Pyke",R.drawable.h_pyke,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Sejuani",R.drawable.h_sejuani,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Sett",R.drawable.h_sett,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Shyvana",R.drawable.h_shyvana,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Swain",R.drawable.h_swain,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Talon",R.drawable.h_talon,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Tryndamere",R.drawable.h_tryndamere,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Xayah",R.drawable.h_xayah,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Yasuo",R.drawable.h_yasuo,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Yone",R.drawable.h_yone,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Zilean",R.drawable.h_zilean,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Akali",R.drawable.h_akali,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Annie",R.drawable.h_annie,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Irelia",R.drawable.h_irelia,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Janna",R.drawable.h_janna,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Jarvaniv",R.drawable.h_jarvaniv,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Jax",R.drawable.h_jax,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Kalista",R.drawable.h_kalista,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Kindred",R.drawable.h_kindred,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Lulu",R.drawable.h_lulu,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Morgana",R.drawable.h_morgana,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Nasus",R.drawable.h_nasus,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Nautilus",R.drawable.h_nautilus,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Neeko",R.drawable.h_neeko,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Nidalee",R.drawable.h_nidalee,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Rakan",R.drawable.h_rakan,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Shen",R.drawable.h_shen,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Sivir",R.drawable.h_sivir,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Tristana",R.drawable.h_tristana,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Veigar",R.drawable.h_veigar,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Yuumi",R.drawable.h_yuumi,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Zed",R.drawable.h_zed,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Brand",R.drawable.h_brand,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Darius",R.drawable.h_darius,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Diana",R.drawable.h_diana,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Elise",R.drawable.h_elise,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Fiora",R.drawable.h_fiora,R.drawable.i_dragonsclaw,R.drawable.i_guardianangel,R.drawable.i_hand,"1","600/1080/1944","95","35","30","34/61/146","45/81/146","0.75","25%","1"));
        userDataList.add(new Champions_UserData("Garen",R.drawable.h_garen,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Nunu",R.drawable.h_nunu,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Teemo",R.drawable.h_teemo,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("TwistedFate",R.drawable.h_twistedfate,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Vi",R.drawable.h_vi,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Braum",R.drawable.h_braum,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Maokai",R.drawable.h_maokai,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("TahmKench",R.drawable.h_tahmkench,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Vladimir",R.drawable.h_vladimir,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));
        userDataList.add(new Champions_UserData("Wukong",R.drawable.h_wukong,R.drawable.i_guardianangel,R.drawable.i_infinityedge,R.drawable.i_lastwhisper,"5","900/1620/2916","0","30","30","55/99/179","65/117/211","0.85","25%","3"));



        setUserRecycler(userDataList);

        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                recyclerviewAdapter.getFilter().filter(charSequence);
                search = charSequence;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }







    private void setUserRecycler(List<Champions_UserData> userDataList){
        userRecycler = findViewById(R.id.userRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        userRecycler.setLayoutManager(layoutManager);
        recyclerviewAdapter = new Champions_RecyclerviewAdapter(this,userDataList);
        userRecycler.setAdapter(recyclerviewAdapter);

        // test  horizontal   test  horizontal      test  horizontal      test  horizontal
        userRecycler.setLayoutManager(new Champions_LayoutManager());

        // test  horizontal   test  horizontal      test  horizontal      test  horizontal
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(this, mainmeun.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }


}
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
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.p.adapter.ChampionsLevel_RecyclerviewAdapter;
import com.example.p.model.ChampionsLevel_UserData;

import java.util.ArrayList;
import java.util.List;

public class ChampionsLevel extends AppCompatActivity  {
    RecyclerView userRecycler;
    ChampionsLevel_RecyclerviewAdapter recyclerviewAdapter;
    EditText searchView;
    CharSequence search = "";
    TextView text1;
    private List<ChampionsLevel_UserData>  userDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champions_level);
        getSupportActionBar().setTitle("Champions Level");
        searchView = findViewById(R.id.search_bar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        text1 = findViewById(R.id.text1);


        userDataList.add(new ChampionsLevel_UserData("Azir - TOP 1", "Azir charges forward with a wall of soldiers, knocking back enemies hit and dealing magic damage. After their charge, the wall of soldiers remains in place in front of Azir for 3 seconds as impassable terrain. Any spearmen from the General trait will accompany Azir for the charge and position themselves to protect him afterwards.", R.drawable.h_azir));
        userDataList.add(new ChampionsLevel_UserData("Akali - TOP 2", "Akali throws kunai at her target, dealing magic damage.", R.drawable.h_akali));
        userDataList.add(new ChampionsLevel_UserData("Zed - TOP 3", "Innate: When combat starts, Zed teleports to the enemy backline. Passive: Every third attack, Zed deals bonus magic damage and steals a percent of the target's current Attack Damage.", R.drawable.h_zed));
        userDataList.add(new ChampionsLevel_UserData("Teemo - TOP 4", "Teemo fires a dart at his target that explodes into a cloud of spores on contact, poisoning nearby enemies. Poisoned enemies take magic damage over a few seconds and are blinded for the duration.", R.drawable.h_teemo));
        userDataList.add(new ChampionsLevel_UserData("Talon - TOP 5", "Talon stabs his target, striking them for a percent of his attack damage plus bonus physical damage. If this kills them, Talon becomes unstoppable and untargetable while he leaps to the enemy with the lowest Armor.", R.drawable.h_talon));
        userDataList.add(new ChampionsLevel_UserData("Shen - TOP 6", "Shen dashes past his target, shielding himself against damage and taunting all adjacent enemies.", R.drawable.h_shen));
        userDataList.add(new ChampionsLevel_UserData("Yone - TOP 7", "Yone strikes along a path in front of him, dealing magic damage split between all enemies hit. Enemies hit are marked for death, reducing their Armor and Magic Resist. Yone's spell is then replaced with Unforgotten until there are no remaining enemies marked for death. Unforgotten (10 mana): Yone dashes to the lowest health enemy that is marked for death, killing them instantly.", R.drawable.h_yone));
        userDataList.add(new ChampionsLevel_UserData("Yasuo - TOP 8", "Yasuo strikes forward two hexes, dealing a percent of his Attack Damage as physical damage and applying on-hit effects.", R.drawable.h_yasuo));
        userDataList.add(new ChampionsLevel_UserData("Jarvan IV - TOP 9", "test4", R.drawable.h_jarvaniv));
        userDataList.add(new ChampionsLevel_UserData("Darius - TOP 10", "Darius dunks an enemy, dealing magic damage. While dunking, Darius is unstoppable. If this kills the target, Darius immediately casts again dealing 25% reduced damage.", R.drawable.h_darius));
        userDataList.add(new ChampionsLevel_UserData("Kayle", "Kayle Ascends, causing her attacks to launch waves that deal bonus magic damage.", R.drawable.h_kayle));
        userDataList.add(new ChampionsLevel_UserData("Lulu", "Lulu makes a low health ally giant, granting them bonus health and knocking up adjacent enemies near them for 1 seconds.", R.drawable.h_lulu));
        userDataList.add(new ChampionsLevel_UserData("Fiora", "Fiora enters a defensive stance for 1.5 seconds, becoming immune to damage and enemy spell effects. As she exits this stance, she ripostes, dealing magic damage to a nearby enemy and stunning them for a few seconds.", R.drawable.h_fiora));
        userDataList.add(new ChampionsLevel_UserData("Lee Sin", "Lee Sin punches his target, dealing magic damage, knocking them back to the edge of the battlefield, and stunning them for a few seconds. Any enemies the target collides with during the knockback receive half the damage and stunned for 1 second. If the target cannot be pushed back any further, they are knocked out of the battlefield instead, removing them from combat. If the target is still alive, Lee Sin will dash to them.", R.drawable.h_leesin));
        userDataList.add(new ChampionsLevel_UserData("Garen", "Garen spins his sword for 4 seconds, reducing incoming magic damage by 80% and dealing magic damage to nearby enemies over the duration.", R.drawable.h_garen));

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

    private void setUserRecycler(List<ChampionsLevel_UserData> userDataList) {
        userRecycler = findViewById(R.id.rV);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        userRecycler.setLayoutManager(layoutManager);
        recyclerviewAdapter = new ChampionsLevel_RecyclerviewAdapter(this, userDataList);
        userRecycler.setAdapter(recyclerviewAdapter);
    }

    public void showName(View v){
        Toast.makeText(this, "Top Hero is Selected",Toast.LENGTH_SHORT).show();
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

package com.example.p;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Items extends AppCompatActivity {

    private ImageButton b_f_sword, Chain_Vest, GBelt, Sparring_Gloves, Large_Rod, Negatron_Cloak, Recurve_Bow, Tear;
    private ImageView item_selected, show1, show2, combined;
    private TextView item_output, output, name;
    private int flag = 0;
    public int simulator;
    public int simulator1;
    @SuppressLint("UseCompatLoadingForDrawables")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        // Change SupportActionBar text
        getSupportActionBar().setTitle("Items");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        //ImageButton
        b_f_sword = findViewById(R.id.bfsword);
        Chain_Vest = findViewById(R.id.Chain_Vest);
        GBelt = findViewById(R.id.GBelt);
        Sparring_Gloves = findViewById(R.id.Sparring_Gloves);
        Large_Rod = findViewById(R.id.Large_Rod);
        Negatron_Cloak = findViewById(R.id.Negatron_Cloak);
        Recurve_Bow = findViewById(R.id.Recurve_Bow);
        Tear = findViewById(R.id.Tear);
        //ImageView
        item_selected = findViewById(R.id.item_selected);
        show1 = findViewById(R.id.show1);
        show2 = findViewById(R.id.show2);
        combined = findViewById(R.id.combined);
        //TextView
        item_output = findViewById(R.id.item_output);
        output = findViewById(R.id.output);
        name = findViewById(R.id.name);

        //if(show1.getDrawable.equals(show1.getContext().getDrawable(R.drawable.bfsword).getConstantState()))
        //if(show1.equals(R.drawable.bfsword)){
        //if(show1.getImageMatrix().equals(show1.getContext().getDrawable(R.drawable.bfsword))){
        // name.setText(R.string.deathblade);
        // }

    }

    public void item1 (View v){
        Toast.makeText(this, "You selected B.F Sword", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_bfsword);
        item_output.setText(R.string.afsword);
        flag++;

        if(flag == 1){
            show1.setImageResource(R.drawable.i_bfsword);
            simulator = 1;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_bfsword);
            flag = 0;
            simulator1 = 1;
        }
        if(simulator == 1 && simulator1 == 1){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.deathblade);
            output.setText(R.string.deathblade_desc);
            combined.setImageResource(R.drawable.i_deathblade);
        } else if(simulator == 1 && simulator1 == 2){
            name.setText(R.string.guardianangel);
            output.setText(R.string.guardianangel_desc);
            combined.setImageResource(R.drawable.i_guardianangel);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 2 && simulator1 == 1){
            name.setText(R.string.guardianangel);
            output.setText(R.string.guardianangel_desc);
            combined.setImageResource(R.drawable.i_guardianangel);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 1 && simulator1 == 3){
            name.setText(R.string.zekesherald);
            output.setText(R.string.zekesherald_desc);
            combined.setImageResource(R.drawable.i_zekesherald);
            simulator = 0;
            simulator1 = 0;
        }else if(simulator == 3 && simulator1 == 1){
            name.setText(R.string.zekesherald);
            output.setText(R.string.zekesherald_desc);
            combined.setImageResource(R.drawable.i_zekesherald);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 1 && simulator1 == 5){
            name.setText(R.string.hextechgunblade);
            output.setText(R.string.hextechgunblade_desc);
            combined.setImageResource(R.drawable.i_hextechgunblade);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 5 && simulator1 == 1){
            name.setText(R.string.hextechgunblade);
            output.setText(R.string.hextechgunblade_desc);
            combined.setImageResource(R.drawable.i_hextechgunblade);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 1 && simulator1 == 6){
            name.setText(R.string.bloodthirster);
            output.setText(R.string.bloodthirster_desc);
            combined.setImageResource(R.drawable.i_bloodthirster);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 6 && simulator1 == 1){
            name.setText(R.string.bloodthirster);
            output.setText(R.string.bloodthirster_desc);
            combined.setImageResource(R.drawable.i_bloodthirster);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 1 && simulator1 == 7){
            name.setText(R.string.giantslayer);
            output.setText(R.string.giantslayer_desc);
            combined.setImageResource(R.drawable.i_giantslayer);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 7 && simulator1 == 1){
            name.setText(R.string.giantslayer);
            output.setText(R.string.giantslayer_desc);
            combined.setImageResource(R.drawable.i_giantslayer);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 1 && simulator1 == 4){
            name.setText(R.string.infinityedge);
            output.setText(R.string.infinityedge_desc);
            combined.setImageResource(R.drawable.i_infinityedge);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 4 && simulator1 == 1){
            name.setText(R.string.infinityedge);
            output.setText(R.string.infinityedge_desc);
            combined.setImageResource(R.drawable.i_infinityedge);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 1 && simulator1 == 8){
            name.setText(R.string.spearofshojin);
            output.setText(R.string.spearofshojin_desc);
            combined.setImageResource(R.drawable.i_spearofshojin);
            simulator = 0;
            simulator1 = 0;
        }
        else if(simulator == 8 && simulator1 == 1){
            name.setText(R.string.spearofshojin);
            output.setText(R.string.spearofshojin_desc);
            combined.setImageResource(R.drawable.i_spearofshojin);
            simulator = 0;
            simulator1 = 0;
        }

    }
    public void item2 (View v){
        Toast.makeText(this, "You selected Chain Vest", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_chain_vest);
        item_output.setText(R.string.chainvest);
        flag++;
        if(flag == 1){
            show1.setImageResource(R.drawable.i_chain_vest);
            simulator = 2;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_chain_vest);
            flag = 0;
            simulator1 = 2;
        }

        if(simulator == 2 && simulator1 == 2){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.bramblevest);
            output.setText(R.string.bramblevest_desc);
            combined.setImageResource(R.drawable.i_bramblevest);
        }
        else if(simulator == 2 && simulator1 == 3){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.sunfirecape);
            output.setText(R.string.sunfirecape_desc);
            combined.setImageResource(R.drawable.i_sunfirecape);
        }
        else if(simulator == 3 && simulator1 == 2){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.sunfirecape);
            output.setText(R.string.sunfirecape_desc);
            combined.setImageResource(R.drawable.i_sunfirecape);
        }
        else if(simulator == 2 && simulator1 == 5){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.locketoftheIronsolari);
            output.setText(R.string.locketoftheIronsolari_desc);
            combined.setImageResource(R.drawable.i_locke);
        }
        else if(simulator == 5 && simulator1 == 2){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.locketoftheIronsolari);
            output.setText(R.string.locketoftheIronsolari_desc);
            combined.setImageResource(R.drawable.i_locke);
        }
        else if(simulator == 2 && simulator1 == 6){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.gargoyle);
            output.setText(R.string.gargoyle_desc);
            combined.setImageResource(R.drawable.i_gargoyle);
        }
        else if(simulator == 6 && simulator1 == 2){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.gargoyle);
            output.setText(R.string.gargoyle_desc);
            combined.setImageResource(R.drawable.i_gargoyle);
        }
        else if(simulator == 2 && simulator1 == 7){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.titans);
            output.setText(R.string.titans_desc);
            combined.setImageResource(R.drawable.i_titans);
        }
        else if(simulator == 7 && simulator1 == 2){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.titans);
            output.setText(R.string.titans_desc);
            combined.setImageResource(R.drawable.i_titans);
        }
        else if(simulator == 2 && simulator1 == 4){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.shroudo);
            output.setText(R.string.shroudo_desc);
            combined.setImageResource(R.drawable.i_shroudo);
        }
        else if(simulator == 4 && simulator1 == 2){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.shroudo);
            output.setText(R.string.shroudo_desc);
            combined.setImageResource(R.drawable.i_shroudo);
        }
        else if(simulator == 2 && simulator1 == 8){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.frozen);
            output.setText(R.string.frozen_desc);
            combined.setImageResource(R.drawable.i_frozen);
        }
        else if(simulator == 8 && simulator1 == 2){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.frozen);
            output.setText(R.string.frozen_desc);
            combined.setImageResource(R.drawable.i_frozen);
        }



    }
    public void item3 (View v){
        Toast.makeText(this, "You selected Giant's Belt", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_giants_belt);
        item_output.setText(R.string.gbelt);
        flag++;
        if(flag == 1){
            show1.setImageResource(R.drawable.i_giants_belt);
            simulator = 3;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_giants_belt);
            flag = 0;
            simulator1 = 3;
        }

        if(simulator == 3 && simulator1 == 3){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.warmogsarmor);
            output.setText(R.string.warmogsarmor_desc);
            combined.setImageResource(R.drawable.i_warmogsarmor);
        }
        else if(simulator == 3 && simulator1 == 5){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.morellonomicon);
            output.setText(R.string.morellonomicon_desc);
            combined.setImageResource(R.drawable.i_morellonomicon);
        }
        else if(simulator == 5 && simulator1 == 3){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.morellonomicon);
            output.setText(R.string.morellonomicon_desc);
            combined.setImageResource(R.drawable.i_morellonomicon);
        }
        else if(simulator == 3 && simulator1 == 6){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.zephyr);
            output.setText(R.string.zephyr_desc);
            combined.setImageResource(R.drawable.i_zephyr);
        }
        else if(simulator == 6 && simulator1 == 3){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.zephyr);
            output.setText(R.string.zephyr_desc);
            combined.setImageResource(R.drawable.i_zephyr);
        }
        else if(simulator == 3 && simulator1 == 7){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.zzrotportal);
            output.setText(R.string.zzrotportal_desc);
            combined.setImageResource(R.drawable.i_zzrotportal);
        }
        else if(simulator == 7 && simulator1 == 3){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.zzrotportal);
            output.setText(R.string.zzrotportal_desc);
            combined.setImageResource(R.drawable.i_zzrotportal);
        }
        else if(simulator == 3 && simulator1 == 4){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.trapclaw);
            output.setText(R.string.trapclaw_desc);
            combined.setImageResource(R.drawable.i_trapclaw);
        }
        else if(simulator == 4 && simulator1 == 3){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.trapclaw);
            output.setText(R.string.trapclaw_desc);
            combined.setImageResource(R.drawable.i_trapclaw);
        }
        else if(simulator == 3 && simulator1 == 8){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.redemption);
            output.setText(R.string.redemption_desc);
            combined.setImageResource(R.drawable.i_redemption);
        }
        else if(simulator == 8 && simulator1 == 3){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.redemption);
            output.setText(R.string.redemption_desc);
            combined.setImageResource(R.drawable.i_redemption);
        }

    }
    public void item4 (View v){
        Toast.makeText(this, "You selected Sparring Gloves", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_sparringgloves);
        item_output.setText(R.string.sparring_gloves);
        flag++;

        if(flag == 1){
            show1.setImageResource(R.drawable.i_sparringgloves);
            simulator = 4;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_sparringgloves);
            flag = 0;
            simulator1 = 4;
        }

        if(simulator == 4 && simulator1 == 4){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.thiefsgloves);
            output.setText(R.string.thiefsgloves_desc);
            combined.setImageResource(R.drawable.i_thiefsgloves);
        }
        else if(simulator == 4 && simulator1 == 5){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.jeweled);
            output.setText(R.string.jeweled_desc);
            combined.setImageResource(R.drawable.i_jeweled);
        }
        else if(simulator == 5 && simulator1 == 4){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.jeweled);
            output.setText(R.string.jeweled_desc);
            combined.setImageResource(R.drawable.i_jeweled);
        }
        else if(simulator == 4 && simulator1 == 6){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.quicksilver);
            output.setText(R.string.quicksilver_desc);
            combined.setImageResource(R.drawable.i_quicksilver);
        }
        else if(simulator == 6 && simulator1 == 4){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.quicksilver);
            output.setText(R.string.quicksilver_desc);
            combined.setImageResource(R.drawable.i_quicksilver);
        }
        else if(simulator == 4 && simulator1 == 7){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.lastwhisper);
            output.setText(R.string.lastwhisper_desc);
            combined.setImageResource(R.drawable.i_lastwhisper);
        }
        else if(simulator == 7 && simulator1 == 4){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.lastwhisper);
            output.setText(R.string.lastwhisper_desc);
            combined.setImageResource(R.drawable.i_lastwhisper);
        }
        else if(simulator == 4 && simulator1 == 8){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.handofJustice);
            output.setText(R.string.handofJustice_desc);
            combined.setImageResource(R.drawable.i_hand);
        }
        else if(simulator == 8 && simulator1 == 4){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.handofJustice);
            output.setText(R.string.handofJustice_desc);
            combined.setImageResource(R.drawable.i_hand);
        }
    }
    public void item5 (View v){
        Toast.makeText(this, "You selected Needlessly Large Rod", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_needlessly_large_rod);
        item_output.setText(R.string.large_rod);
        flag++;

        if(flag == 1){
            show1.setImageResource(R.drawable.i_needlessly_large_rod);
            simulator = 5;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_needlessly_large_rod);
            simulator1= 5;
            flag = 0;
        }
        if(simulator == 5 && simulator1 == 5){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.rabadons);
            output.setText(R.string.rabadons_desc);
            combined.setImageResource(R.drawable.i_rabadons);
        }
        else if(simulator == 5 && simulator1 == 6){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.lonicspark);
            output.setText(R.string.lonicspark_desc);
            combined.setImageResource(R.drawable.i_lonicspark);
        }
        else if(simulator == 6 && simulator1 == 5){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.lonicspark);
            output.setText(R.string.lonicspark_desc);
            combined.setImageResource(R.drawable.i_lonicspark);
        }
        else if(simulator == 5 && simulator1 == 7){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.guinsoos);
            output.setText(R.string.guinsoos_desc);
            combined.setImageResource(R.drawable.i_guinsoos);
        }
        else if(simulator == 7 && simulator1 == 5){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.guinsoos);
            output.setText(R.string.guinsoos_desc);
            combined.setImageResource(R.drawable.i_guinsoos);
        }
        else if(simulator == 5 && simulator1 == 8){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.ludensecho);
            output.setText(R.string.ludensecho_desc);
            combined.setImageResource(R.drawable.i_ludensecho);
        }
        else if(simulator == 8 && simulator1 == 5){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.ludensecho);
            output.setText(R.string.ludensecho_desc);
            combined.setImageResource(R.drawable.i_ludensecho);
        }
    }
    public void item6 (View v){
        Toast.makeText(this, "You selected Negatron Cloak", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_negatron_cloak);
        item_output.setText(R.string.negatron_cloak);
        flag++;

        if(flag == 1){
            show1.setImageResource(R.drawable.i_negatron_cloak);
            simulator = 6;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_negatron_cloak);
            flag = 0;
            simulator1 = 6;
        }
        if(simulator == 6 && simulator1 == 6){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.dragonsclaw);
            output.setText(R.string.dragonsclaw_desc);
            combined.setImageResource(R.drawable.i_dragonsclaw);
        }
        else if(simulator == 6 && simulator1 == 7){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.runaans);
            output.setText(R.string.runaans_desc);
            combined.setImageResource(R.drawable.i_runaans);
        }
        else if(simulator == 7 && simulator1 == 6){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.runaans);
            output.setText(R.string.runaans_desc);
            combined.setImageResource(R.drawable.i_runaans);
        }
        else if(simulator == 6 && simulator1 == 8){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.chaliceofpower);
            output.setText(R.string.chaliceofpower_desc);
            combined.setImageResource(R.drawable.i_chaliceofpower);
        }
        else if(simulator == 8 && simulator1 == 6){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.chaliceofpower);
            output.setText(R.string.chaliceofpower_desc);
            combined.setImageResource(R.drawable.i_chaliceofpower);
        }

    }
    public void item7 (View v){
        Toast.makeText(this, "You selected Recurve Bow", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_recurvebow);
        item_output.setText(R.string.recurve_bow);
        flag++;

        if(flag == 1){
            show1.setImageResource(R.drawable.i_recurvebow);
            simulator = 7;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_recurvebow);
            simulator1 = 7;
            flag = 0;
        }
        if(simulator == 7 && simulator1 == 7){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.rapid);
            output.setText(R.string.rapid_desc);
            combined.setImageResource(R.drawable.i_rapid);
        }
        else if(simulator == 7 && simulator1 == 8){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.statikkshiv);
            output.setText(R.string.statikkshiv_desc);
            combined.setImageResource(R.drawable.i_statikkshiv);
        }
        else if(simulator == 8 && simulator1 == 7){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.statikkshiv);
            output.setText(R.string.statikkshiv_desc);
            combined.setImageResource(R.drawable.i_statikkshiv);
        }
    }
    public void item8 (View v){
        Toast.makeText(this, "You selected Tear of the Goddess", Toast.LENGTH_SHORT).show();
        item_selected.setBackgroundResource(R.drawable.i_tearofthegoddess);
        item_output.setText(R.string.tear);
        flag++;

        if(flag == 1){
            show1.setImageResource(R.drawable.i_tearofthegoddess);
            simulator = 8;
        }else if(flag == 2){
            show2.setImageResource(R.drawable.i_tearofthegoddess);
            simulator1 = 8;
            flag = 0;
        }

        if(simulator == 8 && simulator1 == 8){
            simulator = 0;
            simulator1 = 0;
            name.setText(R.string.bluebuff);
            output.setText(R.string.bluebuff_desc);
            combined.setImageResource(R.drawable.i_bluebuff);
        }
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
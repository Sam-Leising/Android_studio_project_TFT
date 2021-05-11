    package com.example.p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Champions_detail extends AppCompatActivity {

    TextView detail_userName;
    ImageView detail_userImage;

    ImageView detail_item1,detail_item2,detail_item3;
    TextView Stats_cost,Stats_health,Stats_mana,Stats_armor,Stats_mr,Stats_dps,Stats_damage,Stats_atk_spd,Stats_crit_rate,Stats_range;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champions_detail);

        detail_userImage = findViewById(R.id.detail_userImage);
        detail_userName = findViewById(R.id.detail_userName);

        detail_item1 = findViewById(R.id.detail_item1);
        detail_item2 = findViewById(R.id.detail_item2);
        detail_item3 = findViewById(R.id.detail_item3);

        Stats_cost = findViewById(R.id.Stats_cost);
        Stats_health = findViewById(R.id.Stats_health);
        Stats_mana = findViewById(R.id.Stats_mana);
        Stats_armor = findViewById(R.id.Stats_armor);
        Stats_mr = findViewById(R.id.Stats_mr);
        Stats_dps = findViewById(R.id.Stats_dps);
        Stats_damage = findViewById(R.id.Stats_damage);
        Stats_atk_spd = findViewById(R.id.Stats_atk_spd);
        Stats_crit_rate = findViewById(R.id.Stats_crit_rate);
        Stats_range = findViewById(R.id.Stats_range);


        String username=getIntent().getStringExtra("username");
        Bundle bundle = getIntent().getExtras();
        int picture = bundle.getInt("picture");

        int item1 = bundle.getInt("item1");
        int item2 = bundle.getInt("item2");
        int item3 = bundle.getInt("item3");

        String cost=getIntent().getStringExtra("cost");
        String health=getIntent().getStringExtra("health");
        String mana=getIntent().getStringExtra("mana");
        String armor=getIntent().getStringExtra("armor");
        String mr=getIntent().getStringExtra("mr");
        String dps=getIntent().getStringExtra("dps");
        String damage=getIntent().getStringExtra("damage");
        String atk_spd=getIntent().getStringExtra("atk_spd");
        String crit_rate=getIntent().getStringExtra("crit_rate");
        String range=getIntent().getStringExtra("range");



        detail_userImage.setImageResource(picture);
        detail_userName.setText(username);

        detail_item1.setImageResource(item1);
        detail_item2.setImageResource(item2);
        detail_item3.setImageResource(item3);

        Stats_cost.setText(cost);
        Stats_health.setText(health);
        Stats_mana.setText(mana);
        Stats_armor.setText(armor);
        Stats_mr.setText(mr);
        Stats_dps.setText(dps);
        Stats_damage.setText(damage);
        Stats_atk_spd.setText(atk_spd);
        Stats_crit_rate.setText(crit_rate);
        Stats_range.setText(range);




    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
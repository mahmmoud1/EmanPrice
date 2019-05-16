package com.example.android.emanprice;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView man = findViewById(R.id.man);

// Set a click listener on that View
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manIntent = new Intent(MainActivity.this,ManActivity.class);
                startActivity(manIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView youth = findViewById(R.id.youth);

// Set a click listener on that View
        youth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthIntent = new Intent(MainActivity.this,YouthActivity.class);
                startActivity(youthIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView kids = findViewById(R.id.kids);

// Set a click listener on that View
        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kidsIntent = new Intent(MainActivity.this,KidsActivity.class);
                startActivity(kidsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView baby = findViewById(R.id.baby);

// Set a click listener on that View
        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent babyIntent = new Intent(MainActivity.this,BabyActivity.class);
                startActivity(babyIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView shoes = findViewById(R.id.shoes);

// Set a click listener on that View
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoesIntent = new Intent(MainActivity.this,ShoesActivity.class);
                startActivity(shoesIntent);
            }
        });
    }
}

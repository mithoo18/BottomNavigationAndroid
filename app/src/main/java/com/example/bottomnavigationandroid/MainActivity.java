package com.example.bottomnavigationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview = findViewById(R.id.textView);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
        (item) -> {
            switch (item.getItemId()) {
                case R.id.update_item:
                    textview.setText("Update Item Selected");
                    break;
                case R.id.location_item:
                    textview.setText("location Item Selected");
                    break;
                case R.id.favorite_item:
                    textview.setText("favorite Item Selected");
                    break;

            }
        return true;
        });
    }
}
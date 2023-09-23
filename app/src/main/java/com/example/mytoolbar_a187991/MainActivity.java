package com.example.mytoolbar_a187991;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.lang.reflect.WildcardType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        //ActionBar myActionBar = getSupportActionBar();
        //myActionBar.setDisplayHomeAsUpEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent intent;

        switch (item.getItemId()) {
            case R.id.menu_search:
                Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_cart:
                Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
                break;

            case R.id.menu_chat:
                Toast.makeText(MainActivity.this, "Chat", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(intent);
                break;

            case R.id.menu_setting:
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                break;

            case R.id.menu_help:
                Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
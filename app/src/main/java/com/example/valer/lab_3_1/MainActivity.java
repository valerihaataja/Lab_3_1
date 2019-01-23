package com.example.valer.lab_3_1;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.lang.invoke.ConstantCallSite;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ConstraintLayout)findViewById(R.id.layout);
        text_view = (TextView)findViewById(R.id.text_view);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =  getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.red_menu_item){
            layout.setBackgroundColor(Color.RED);
            text_view.setText("RED");
        }
        if(item.getItemId() == R.id.green_menu_item){
            layout.setBackgroundColor(Color.GREEN);
            text_view.setText("GREEN");
        }
        if(item.getItemId() == R.id.blue_menu_item){
            layout.setBackgroundColor(Color.BLUE);
            text_view.setText("BLUE");
        }
        if(item.getItemId() == R.id.yellow_menu_item){
            layout.setBackgroundColor(Color.YELLOW);
            text_view.setText("YELLOW");
        }
        return true;
    }
}

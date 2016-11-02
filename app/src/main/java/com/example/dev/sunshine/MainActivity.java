package com.example.dev.sunshine;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new ForecastFragment()).commit();
        }
    }


    public void onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.forecast_fragment, menu);
    }


    public boolean onOptionItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_refresh) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

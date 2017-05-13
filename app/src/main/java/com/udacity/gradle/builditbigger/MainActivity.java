package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       textView = (TextView) findViewById(R.id.jokes_text_view);
       textView.setVisibility(View.INVISIBLE);

       spinner = (ProgressBar) findViewById(R.id.progressBar1);

      }


    @Override
    protected void onResume() {
        super.onResume();
        spinner.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {

        spinner.setVisibility(View.VISIBLE);
        new FetchJokeTask().execute(this);
    }
  }

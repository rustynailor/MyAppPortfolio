package uk.co.rustynailor.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //onClick methods to launch the portfolio projects
        //(currently just launch toast messages)
        Button spotifyStreamerButton = (Button)findViewById(R.id.spotify_streamer_button);
        spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button scoresAppButton = (Button)findViewById(R.id.scores_app_button);
        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Scores app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button libraryAppButton = (Button)findViewById(R.id.library_app_button);
        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Library app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buildItBiggerAppButton = (Button)findViewById(R.id.build_it_bigger_app_button);
        buildItBiggerAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button xyzReaderAppButton = (Button)findViewById(R.id.xyz_reader_app_button);
        xyzReaderAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button capstoneAppButton = (Button)findViewById(R.id.capstone_app_button);
        capstoneAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

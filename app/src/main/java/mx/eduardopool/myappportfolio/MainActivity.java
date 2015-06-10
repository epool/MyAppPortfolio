package mx.eduardopool.myappportfolio;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyStreamerButton = (Button) findViewById(R.id.spotify_streamer_button);
        Button footballScoresButton = (Button) findViewById(R.id.football_scores_button);
        Button libraryAppButton = (Button) findViewById(R.id.library_app_button);
        Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        Button xyzReaderButton = (Button) findViewById(R.id.xyz_reader_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        ColorStateList udacityOrangeColorStateList = ColorStateList.valueOf(getResources().getColor(R.color.udacity_orange));
        ViewCompat.setBackgroundTintList(spotifyStreamerButton, udacityOrangeColorStateList);
        ViewCompat.setBackgroundTintList(footballScoresButton, udacityOrangeColorStateList);
        ViewCompat.setBackgroundTintList(libraryAppButton, udacityOrangeColorStateList);
        ViewCompat.setBackgroundTintList(buildItBiggerButton, udacityOrangeColorStateList);
        ViewCompat.setBackgroundTintList(xyzReaderButton, udacityOrangeColorStateList);

        ColorStateList redColorStateList = ColorStateList.valueOf(getResources().getColor(R.color.red_color));
        ViewCompat.setBackgroundTintList(capstoneButton, redColorStateList);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void openApplication(View v) {
        Toast.makeText(this, getString(R.string.click_message, ((Button) v).getText()), Toast.LENGTH_LONG).show();
    }
}

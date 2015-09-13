package sg.edu.nus.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        // Dynamically attach fragment 51 and 52 to activity 5
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction;

        // Attach frag51
        fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment51 = new Fragment51();
        fragmentTransaction.add(R.id.frag51, fragment51);
        fragmentTransaction.commit();

        // Attach frag52
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentTransaction = fragmentManager.beginTransaction();
            Fragment fragment52 = new Fragment52();
            fragmentTransaction.add(R.id.frag52, fragment52);
            fragmentTransaction.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity5, menu);
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

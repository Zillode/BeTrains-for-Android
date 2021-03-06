package tof.cv.mpp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.readystatesoftware.systembartint.SystemBarTintManager;

public class InfoTrainActivity extends ActionBarActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_info_train);


        setSupportActionBar((Toolbar) findViewById(R.id.my_awesome_toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = this.getIntent().getExtras();
        long timestamp = bundle.getLong("timestamp") * 1000;
        String name = bundle.getString("Name").replaceAll("[^0-9]+", "");
        Log.i("***", "bundle: " + bundle.getString("Name"));
        Log.i("***", "NAME: " + name);
        String fromTo = bundle.getString("fromto");
        getSupportActionBar().setTitle(name + " infos:");

        InfoTrainFragment fragment = (InfoTrainFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        String fileName = bundle.getString("FileName");
        if (fileName != null)
            fragment.displayInfo(fileName, name);
        else
            fragment.displayInfo(name, fromTo, timestamp);

        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        // enable status bar tint
        tintManager.setStatusBarTintEnabled(true);
        // enable navigation bar tint
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setTintResource(R.color.primarycolor);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, WelcomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
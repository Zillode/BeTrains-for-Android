package tof.cv.mpp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.MenuItem;

public class InfoTrainActivity extends FragmentActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_info_train);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = this.getIntent().getExtras();
        long timestamp = bundle.getLong("timestamp") * 1000;
        String name = bundle.getString("Name").replaceAll("[^0-9]+", "");
        Log.i("***", "bundle: " + bundle.getString("Name"));
        Log.i("***", "NAME: " + name);
        String fromTo = bundle.getString("fromto");
        getActionBar().setTitle(name + " infos:");

     InfoTrainFragment fragment = (InfoTrainFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        String fileName = bundle.getString("FileName");
        if (fileName != null)
            fragment.displayInfo(fileName,name);
        else
            fragment.displayInfo(name, fromTo, timestamp);
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
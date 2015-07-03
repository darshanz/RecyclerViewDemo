package me.games.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import me.games.recyclerviewexample.adapters.AndroidVersionAdapter;
import me.games.recyclerviewexample.model.AndroidVersion;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private ArrayList<AndroidVersion> mVersionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mVersionList = new ArrayList<AndroidVersion>();



        //Dummy Data
        AndroidVersion version =
                new AndroidVersion("Froyo", "Android 2.2", 8, R.drawable.lollipop);

        mVersionList.add(version);

        mVersionList.add(new AndroidVersion("Gingerbread(L)", "Android 2.3", 9, R.drawable.lollipop));
        mVersionList.add(new AndroidVersion("HoneyComb(K)", "Android 3.0", 9, R.drawable.kitkat));
        mVersionList.add(new AndroidVersion("Icecream Sandwich", "Android 3.5", 9, R.drawable.ics));
        mVersionList.add(new AndroidVersion("Jellybean", "Android 4.3", 9, R.drawable.jellybean));
        mVersionList.add(new AndroidVersion("Kitkat", "Android 4.4", 9, R.drawable.kitkat));
        mVersionList.add(new AndroidVersion("Lollipop", "Android 5.0", 9, R.drawable.lollipop));


        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        mAdapter = new AndroidVersionAdapter(mVersionList);


        //mLayoutManager = new LinearLayoutManager(this);

        //mLayoutManager = new GridLayoutManager(this, 2);

        mLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(mAdapter);


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
}

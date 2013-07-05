package com.freetymekiyan.coolwidgets.activity;

import static com.freetymekiyan.coolwidgets.constant.Constant.*;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.ListActivity;
import android.content.Intent;

import com.freetymekiyan.coolwidgets.R;

/**
 * Main activity for this custom ui collection
 * list all the custom uis
 * 
 * @author FreeTymeKiyan
 * @version 1.0
 * @date 2013-03-29
 */
public class UiListActivity extends ListActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        ListView lvActivities = (ListView) findViewById(android.R.id.list); 
        /*generate and set an adapter*/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                UiListActivity.this, 
                android.R.layout.simple_list_item_1, 
                getResources().getStringArray(R.array.activity_name_array));
        lvActivities.setAdapter(adapter);
        lvActivities.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView,
                    View item, int position, long id) {
                Intent i = new Intent();
                switch (position) {
                case ID_RADIAL_BTN_ACTIVITY:
                    i.setClass(UiListActivity.this, RadialMenuActivity.class);
                    startActivity(i);
                    break;
                default:
                    break;
                }
            }
        });
    }
}
package com.freetymekiyan.coolwidgets.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.freetymekiyan.coolwidgets.models.RadialMenuItem;
import com.freetymekiyan.coolwidgets.widgets.RadialMenuRenderer;
import com.freetymekiyan.coolwidgets.widgets.RadialMenuRenderer.OnRadailMenuClick;
import com.freetymekiyan.coolwidgets.R;

import java.util.ArrayList;

/**
 * Click the screen and show a radial menu right at 
 * the point
 * 
 * @author FreeTymeKiyan
 * @version 1.0
 * @date 2013-03-30
 */
public class RadialMenuActivity extends FragmentActivity {
    
    private FrameLayout flHolder;
    private RadialMenuRenderer mRenderer;
    private RadialMenuItem menuItem1;
    private RadialMenuItem menuItem2;
    private RadialMenuItem menuItem3;
    private ArrayList<RadialMenuItem> mMenuItems = new ArrayList<RadialMenuItem>(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radial_menu);
        initViews();
    }

    private void initViews() {
        flHolder = (FrameLayout) findViewById(R.id.fragment_holder);
        
        mRenderer = new RadialMenuRenderer(flHolder, true, 30, 60);
        menuItem1 = new RadialMenuItem(
                getResources().getString(R.string.menu_item_1), 
                getResources().getString(R.string.menu_item_1));
        menuItem2 = new RadialMenuItem(
                getResources().getString(R.string.menu_item_2), 
                getResources().getString(R.string.menu_item_2));
        menuItem3 = new RadialMenuItem(
                getResources().getString(R.string.menu_item_3), 
                getResources().getString(R.string.menu_item_3));
        
        mMenuItems.add(menuItem1);
        mMenuItems.add(menuItem2);
        mMenuItems.add(menuItem3);
        mRenderer.setRadialMenuContent(mMenuItems);
        
        flHolder.addView(mRenderer.renderView());
        
        menuItem1.setOnRadialMenuClickListener(new OnRadailMenuClick() {
            
            @Override
            public void onRadailMenuClickedListener(String id) {
//              System.out.println("menu item 1");
                Toast.makeText(RadialMenuActivity.this, 
                        R.string.menu_item_1, 
                        Toast.LENGTH_SHORT).show();
            }
        });
        menuItem2.setOnRadialMenuClickListener(new OnRadailMenuClick() {
            
            @Override
            public void onRadailMenuClickedListener(String id) {
//              System.out.println("menu item 2");
                Toast.makeText(RadialMenuActivity.this, 
                        R.string.menu_item_2, 
                        Toast.LENGTH_SHORT).show();
            }
        });
        menuItem3.setOnRadialMenuClickListener(new OnRadailMenuClick() {
            
            @Override
            public void onRadailMenuClickedListener(String id) {
//              System.out.println("menu item 3");
                Toast.makeText(RadialMenuActivity.this, 
                        R.string.menu_item_3, 
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.freetymekiyan.coolwidgets.widgets;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.freetymekiyan.coolwidgets.models.RadialMenuItem;

import java.util.ArrayList;

public class RadialMenuRenderer {
    public interface OnRadailMenuClick {
        public void onRadailMenuClickedListener(String id);
    }
    
    public static final String RADIAL_NO_TEXT = "HOLLOW";

    private ArrayList<RadialMenuItem> mRadialMenuContent = new ArrayList<RadialMenuItem>(0);
    
    private boolean alt = false;
    
    private float mThickness = 30;
    
    private float mRadius = 60;
    
    private int mMenuBackgroundColor = 0x80444444;
    
    private int mMenuSelectedColor = 0x8033b5e5;
    
    private int mMenuTextColor = Color.WHITE;
    
    private int mMenuBorderColor = 0xff777777;
    
    private View mParentView;

    /**
     * @param mRadialMenuContent
     * @param alt
     * @param mThick
     * @param mRadius
     */
    public RadialMenuRenderer(View parentView, boolean alt, float mThick, float mRadius) {
        this.mParentView = parentView;
        this.alt = alt;
        this.mThickness = mThick;
        this.mRadius = mRadius;
    }
    
    /**
     * @param mRadialMenuContent the mRadialMenuContent to set
     */
    public void setRadialMenuContent(ArrayList<RadialMenuItem> mRadialMenuContent) {
        this.mRadialMenuContent = mRadialMenuContent;
    }
    
    public View renderView() {
        final RadialMenuView menu = new RadialMenuView(mParentView.getContext(), this);
        mParentView.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return menu.gestureHandler(event, true);
            }
        });
        return menu;
    }

    /**
     * @return the mRadialMenuContent
     */
    public ArrayList<RadialMenuItem> getRadialMenuContent() {
        return mRadialMenuContent;
    }

    /**
     * @return the alt
     */
    public boolean isAlt() {
        return alt;
    }

    /**
     * @return the mThick
     */
    public float getMenuThickness() {
        return mThickness;
    }

    /**
     * @return the mRadius
     */
    public float getRadius() {
        return mRadius;
    }

    /**
     * @return the mMenuBackgroundColor
     */
    public int getMenuBackgroundColor() {
        return mMenuBackgroundColor;
    }

    /**
     * @param mMenuBackgroundColor the mMenuBackgroundColor to set
     */
    public void setMenuBackgroundColor(int mMenuBackgroundColor) {
        this.mMenuBackgroundColor = mMenuBackgroundColor;
    }

    /**
     * @return the mMenuSelectedColor
     */
    public int getMenuSelectedColor() {
        return mMenuSelectedColor;
    }

    /**
     * @param mMenuSelectedColor the mMenuSelectedColor to set
     */
    public void setMenuSelectedColor(int mMenuSelectedColor) {
        this.mMenuSelectedColor = mMenuSelectedColor;
    }

    /**
     * @return the mMenuTextColor
     */
    public int getMenuTextColor() {
        return mMenuTextColor;
    }

    /**
     * @param mMenuTextColor the mMenuTextColor to set
     */
    public void setMenuTextColor(int mMenuTextColor) {
        this.mMenuTextColor = mMenuTextColor;
    }

    /**
     * @return the mMenuBorderColor
     */
    public int getMenuBorderColor() {
        return mMenuBorderColor;
    }

    /**
     * @param mMenuBorderColor the mMenuBorderColor to set
     */
    public void setMenuBorderColor(int mMenuBorderColor) {
        this.mMenuBorderColor = mMenuBorderColor;
    }
}

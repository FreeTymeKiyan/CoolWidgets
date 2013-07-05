package com.freetymekiyan.coolwidgets.models;

import com.freetymekiyan.coolwidgets.widgets.RadialMenuRenderer.OnRadailMenuClick;

public class RadialMenuItem {
    
    private String mMenuID;
    private String mMenuName;
    private OnRadailMenuClick mCallback;
    
    /**
     * @param mMenuID
     * @param mMenuName
     */
    public RadialMenuItem(String mMenuID, String mMenuName) {
        this.mMenuID = mMenuID;
        this.mMenuName = mMenuName;
    }

    /**
     * @return the mMenuID
     */
    public String getMenuID() {
        return mMenuID;
    }
    
    /**
     * @return the mMenuName
     */
    public String getMenuName() {
        return mMenuName;
    }
    
    /**
     * 
     * @param onRadailMenuClick
     */
    public void setOnRadialMenuClickListener(OnRadailMenuClick onRadailMenuClick) {
        this.mCallback = onRadailMenuClick;
    }
    
    /**
     * 
     * @return
     */
    public OnRadailMenuClick getOnRadailMenuClick() {
        return mCallback;
    }
}

package com.freetymekiyan.coolwidgets.utils;

public class RadialMenuHelper {
    /**
     * 
     * @param mWidth
     * @param mHeight
     * @param x2
     * @param y2
     * @return
     */
    public float distance(float mWidth, float mHeight, float x2, float y2) {
        double dx = mWidth - x2; //horizontal difference 
        double dy = mHeight - y2; //vertical difference 
        float dist = (float) Math.sqrt(dx * dx + dy * dy); //distance using Pythagoras theorem
        return dist;
    }

    /**
     * 
     * @param mWidth
     * @param mHeight
     * @param x2
     * @param y2
     * @param alt
     * @param items
     * @return
     */
    public float angle(float mWidth, float mHeight, float x2, float y2, boolean alt, int items) {
        double dx = x2 - mWidth; //horizontal difference 
        double dy = y2 - mHeight; //vertical difference 
        float angle = (float) (Math.atan2(dy, dx) * 180 / Math.PI) + 90 + (alt ? (360 / items) / 2 : 0);
        if (angle < 0)
            return (angle + 360) / (360 / items);
        return angle / (360 / items);
    }
}

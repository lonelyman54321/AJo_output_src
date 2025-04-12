/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.ril.ajio.customviews.widgets;

import android.view.ViewGroup;
import com.ril.ajio.customviews.widgets.ScrollViewCallbacks;

public interface Scrollable {
    public int getCurrentScrollY();

    public void scrollVerticallyTo(int var1);

    public void setScrollViewCallbacks(ScrollViewCallbacks var1);

    public void setTouchInterceptionViewGroup(ViewGroup var1);
}


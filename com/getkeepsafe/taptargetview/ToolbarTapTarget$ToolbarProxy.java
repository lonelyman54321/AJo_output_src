/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.getkeepsafe.taptargetview;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

interface ToolbarTapTarget$ToolbarProxy {
    public void findViewsWithText(ArrayList var1, CharSequence var2, int var3);

    public View getChildAt(int var1);

    public int getChildCount();

    public CharSequence getNavigationContentDescription();

    public Drawable getNavigationIcon();

    public Drawable getOverflowIcon();

    public Object internalToolbar();

    public void setNavigationContentDescription(CharSequence var1);
}


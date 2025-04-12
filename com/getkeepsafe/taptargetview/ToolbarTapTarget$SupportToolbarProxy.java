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
import androidx.appcompat.widget.Toolbar;
import com.getkeepsafe.taptargetview.ToolbarTapTarget$ToolbarProxy;
import java.util.ArrayList;

class ToolbarTapTarget$SupportToolbarProxy
implements ToolbarTapTarget$ToolbarProxy {
    private final Toolbar toolbar;

    public ToolbarTapTarget$SupportToolbarProxy(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public void findViewsWithText(ArrayList arrayList, CharSequence charSequence, int n3) {
        this.toolbar.findViewsWithText(arrayList, charSequence, n3);
    }

    public View getChildAt(int n3) {
        return this.toolbar.getChildAt(n3);
    }

    public int getChildCount() {
        return this.toolbar.getChildCount();
    }

    public CharSequence getNavigationContentDescription() {
        return this.toolbar.getNavigationContentDescription();
    }

    public Drawable getNavigationIcon() {
        return this.toolbar.getNavigationIcon();
    }

    public Drawable getOverflowIcon() {
        return this.toolbar.getOverflowIcon();
    }

    public Object internalToolbar() {
        return this.toolbar;
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        this.toolbar.setNavigationContentDescription(charSequence);
    }
}


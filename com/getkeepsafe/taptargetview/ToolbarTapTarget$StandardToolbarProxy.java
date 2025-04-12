/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.widget.Toolbar
 */
package com.getkeepsafe.taptargetview;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.Toolbar;
import com.getkeepsafe.taptargetview.ToolbarTapTarget$ToolbarProxy;
import java.util.ArrayList;

class ToolbarTapTarget$StandardToolbarProxy
implements ToolbarTapTarget$ToolbarProxy {
    private final Toolbar toolbar;

    public ToolbarTapTarget$StandardToolbarProxy(Toolbar toolbar) {
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
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return go3.a(this.toolbar);
        }
        return null;
    }

    public Object internalToolbar() {
        return this.toolbar;
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        this.toolbar.setNavigationContentDescription(charSequence);
    }
}


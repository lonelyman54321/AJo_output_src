/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

class ViewOffsetHelper {
    private boolean horizontalOffsetEnabled;
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private boolean verticalOffsetEnabled;
    private final View view;

    public ViewOffsetHelper(View view) {
        boolean bl2;
        this.verticalOffsetEnabled = bl2 = true;
        this.horizontalOffsetEnabled = bl2;
        this.view = view;
    }

    public void applyOffsets() {
        View view = this.view;
        int n3 = this.offsetTop;
        int n4 = view.getTop();
        int n7 = this.layoutTop;
        ViewCompat.m(n3 - (n4 -= n7), view);
        view = this.view;
        n3 = this.offsetLeft;
        n4 = view.getLeft();
        n7 = this.layoutLeft;
        ViewCompat.l(n3 - (n4 -= n7), view);
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    public void onViewLayout() {
        int n3;
        this.layoutTop = n3 = this.view.getTop();
        this.layoutLeft = n3 = this.view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean bl2) {
        this.horizontalOffsetEnabled = bl2;
    }

    public boolean setLeftAndRightOffset(int n3) {
        int n4 = this.horizontalOffsetEnabled;
        if (n4 != 0 && (n4 = this.offsetLeft) != n3) {
            this.offsetLeft = n3;
            this.applyOffsets();
            return true;
        }
        return false;
    }

    public boolean setTopAndBottomOffset(int n3) {
        int n4 = this.verticalOffsetEnabled;
        if (n4 != 0 && (n4 = this.offsetTop) != n3) {
            this.offsetTop = n3;
            this.applyOffsets();
            return true;
        }
        return false;
    }

    public void setVerticalOffsetEnabled(boolean bl2) {
        this.verticalOffsetEnabled = bl2;
    }
}


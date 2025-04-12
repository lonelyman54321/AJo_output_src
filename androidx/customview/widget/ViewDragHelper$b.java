/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.customview.widget;

import android.view.View;

public abstract class ViewDragHelper$b {
    public int clampViewPositionHorizontal(View view, int n3, int n4) {
        return 0;
    }

    public int clampViewPositionVertical(View view, int n3, int n4) {
        return 0;
    }

    public int getOrderedChildIndex(int n3) {
        return n3;
    }

    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public void onEdgeDragStarted(int n3, int n4) {
    }

    public boolean onEdgeLock(int n3) {
        return false;
    }

    public void onEdgeTouched(int n3, int n4) {
    }

    public void onViewCaptured(View view, int n3) {
    }

    public void onViewDragStateChanged(int n3) {
    }

    public void onViewPositionChanged(View view, int n3, int n4, int n7, int n8) {
    }

    public void onViewReleased(View view, float f5, float f6) {
    }

    public abstract boolean tryCaptureView(View var1, int var2);
}


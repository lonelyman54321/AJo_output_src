/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets.onscrolllistener;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;

public abstract class HidingScrollListener
extends RecyclerView$s {
    private boolean mControlsVisible = true;
    private int mScrolledDistance = 0;
    private int threshold = 20;

    public abstract void onHide();

    public void onScrolled(RecyclerView object, int n3, int n4) {
        super.onScrolled((RecyclerView)object, n3, n4);
        object = (LinearLayoutManager)((RecyclerView)object).getLayoutManager();
        int n7 = ((LinearLayoutManager)object).findFirstVisibleItemPosition();
        n3 = 1;
        if (n7 == 0) {
            n7 = (int)(this.mControlsVisible ? 1 : 0);
            if (n7 == 0) {
                this.onShow();
                this.mControlsVisible = n3;
            }
        } else {
            boolean bl2;
            n7 = this.mScrolledDistance;
            int n8 = this.threshold;
            if (n7 > n8 && (bl2 = this.mControlsVisible)) {
                this.onHide();
                this.mControlsVisible = false;
                this.mScrolledDistance = 0;
            } else if (n7 < (n8 = -n8 + -10) && (n7 = (int)(this.mControlsVisible ? 1 : 0)) == 0) {
                this.onShow();
                this.mControlsVisible = n3;
                this.mScrolledDistance = 0;
            }
        }
        if ((n7 = (int)(this.mControlsVisible ? 1 : 0)) != 0 && n4 > 0 || n7 == 0 && n4 < 0) {
            this.mScrolledDistance = n7 = this.mScrolledDistance + n4;
        }
    }

    public abstract void onShow();

    public void setThreshold(int n3) {
        this.threshold = n3;
    }
}


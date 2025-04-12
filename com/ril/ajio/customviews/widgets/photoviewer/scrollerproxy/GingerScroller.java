/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.OverScroller
 */
package com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy;

import android.content.Context;
import android.widget.OverScroller;
import com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy.ScrollerProxy;

public class GingerScroller
extends ScrollerProxy {
    private boolean mFirstScroll = false;
    final OverScroller mScroller;

    public GingerScroller(Context context) {
        OverScroller overScroller;
        this.mScroller = overScroller = new OverScroller(context);
    }

    public boolean computeScrollOffset() {
        boolean bl2 = this.mFirstScroll;
        if (bl2) {
            this.mScroller.computeScrollOffset();
            bl2 = false;
            this.mFirstScroll = false;
        }
        return this.mScroller.computeScrollOffset();
    }

    public void fling(int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, int n17, int n18) {
        this.mScroller.fling(n3, n4, n7, n8, n10, n14, n15, n16, n17, n18);
    }

    public void forceFinished(boolean bl2) {
        this.mScroller.forceFinished(bl2);
    }

    public int getCurrX() {
        return this.mScroller.getCurrX();
    }

    public int getCurrY() {
        return this.mScroller.getCurrY();
    }

    public boolean isFinished() {
        return this.mScroller.isFinished();
    }
}


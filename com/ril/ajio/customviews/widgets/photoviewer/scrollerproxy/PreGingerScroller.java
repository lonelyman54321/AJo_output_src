/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Scroller
 */
package com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy;

import android.content.Context;
import android.widget.Scroller;
import com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy.ScrollerProxy;

public class PreGingerScroller
extends ScrollerProxy {
    private final Scroller mScroller;

    public PreGingerScroller(Context context) {
        Scroller scroller;
        this.mScroller = scroller = new Scroller(context);
    }

    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }

    public void fling(int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, int n17, int n18) {
        this.mScroller.fling(n3, n4, n7, n8, n10, n14, n15, n16);
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


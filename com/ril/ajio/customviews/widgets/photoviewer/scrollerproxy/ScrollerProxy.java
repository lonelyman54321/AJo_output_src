/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy;

import android.content.Context;
import com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy.IcsScroller;

public abstract class ScrollerProxy {
    public static ScrollerProxy getScroller(Context context) {
        IcsScroller icsScroller = new IcsScroller(context);
        return icsScroller;
    }

    public abstract boolean computeScrollOffset();

    public abstract void fling(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    public abstract void forceFinished(boolean var1);

    public abstract int getCurrX();

    public abstract int getCurrY();

    public abstract boolean isFinished();
}


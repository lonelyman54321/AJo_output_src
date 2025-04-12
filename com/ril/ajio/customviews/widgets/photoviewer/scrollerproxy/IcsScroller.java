/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy;

import android.content.Context;
import com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy.GingerScroller;

public class IcsScroller
extends GingerScroller {
    public IcsScroller(Context context) {
        super(context);
    }

    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }
}


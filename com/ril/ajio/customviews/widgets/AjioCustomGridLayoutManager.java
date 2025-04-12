/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public class AjioCustomGridLayoutManager
extends GridLayoutManager {
    public AjioCustomGridLayoutManager(Context context, int n3) {
        super(context, n3);
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}


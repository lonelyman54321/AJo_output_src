/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

public class AjioCustomLinearLayoutManager
extends LinearLayoutManager {
    public AjioCustomLinearLayoutManager(Context context) {
        super(context);
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.ViewCompat$b;

class ViewUtils$3
implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        ViewCompat$b.c(view);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}


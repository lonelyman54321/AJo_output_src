/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;

class FloatingActionButtonImpl$6
implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ FloatingActionButtonImpl this$0;

    public FloatingActionButtonImpl$6(FloatingActionButtonImpl floatingActionButtonImpl) {
        this.this$0 = floatingActionButtonImpl;
    }

    public boolean onPreDraw() {
        this.this$0.onPreDraw();
        return true;
    }
}


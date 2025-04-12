/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.floatingactionbutton;

import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ShadowAnimatorImpl;

class FloatingActionButtonImpl$DisabledElevationAnimation
extends FloatingActionButtonImpl$ShadowAnimatorImpl {
    final /* synthetic */ FloatingActionButtonImpl this$0;

    public FloatingActionButtonImpl$DisabledElevationAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        this.this$0 = floatingActionButtonImpl;
        super(floatingActionButtonImpl, null);
    }

    public float getTargetShadowSize() {
        return 0.0f;
    }
}


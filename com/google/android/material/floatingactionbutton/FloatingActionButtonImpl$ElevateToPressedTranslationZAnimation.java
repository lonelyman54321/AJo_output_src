/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.floatingactionbutton;

import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ShadowAnimatorImpl;

class FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation
extends FloatingActionButtonImpl$ShadowAnimatorImpl {
    final /* synthetic */ FloatingActionButtonImpl this$0;

    public FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        this.this$0 = floatingActionButtonImpl;
        super(floatingActionButtonImpl, null);
    }

    public float getTargetShadowSize() {
        FloatingActionButtonImpl floatingActionButtonImpl = this.this$0;
        float f5 = floatingActionButtonImpl.elevation;
        float f6 = floatingActionButtonImpl.pressedTranslationZ;
        return f5 + f6;
    }
}


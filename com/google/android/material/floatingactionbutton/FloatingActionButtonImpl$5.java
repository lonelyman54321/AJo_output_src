/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.FloatEvaluator
 *  android.animation.TypeEvaluator
 */
package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;

class FloatingActionButtonImpl$5
implements TypeEvaluator {
    FloatEvaluator floatEvaluator;
    final /* synthetic */ FloatingActionButtonImpl this$0;

    public FloatingActionButtonImpl$5(FloatingActionButtonImpl floatingActionButtonImpl) {
        this.this$0 = floatingActionButtonImpl;
        this.floatEvaluator = floatingActionButtonImpl;
    }

    public Float evaluate(float f5, Float f6, Float f7) {
        float f8;
        FloatEvaluator floatEvaluator = this.floatEvaluator;
        Float f11 = floatEvaluator.evaluate(f5, (Number)f6, (Number)f7);
        float f12 = (f5 = f11.floatValue()) - (f8 = 0.1f);
        Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = 0.0f;
            f11 = null;
        }
        return Float.valueOf(f5);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import com.google.android.material.internal.TextScale$1;
import java.util.HashMap;

public class TextScale
extends Transition {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(Or3 object) {
        Object object2 = ((Or3)object).b;
        boolean bl2 = object2 instanceof TextView;
        if (bl2) {
            float f5 = ((TextView)object2).getScaleX();
            object2 = Float.valueOf(f5);
            object = ((Or3)object).a;
            String string2 = PROPNAME_SCALE;
            ((HashMap)object).put(string2, object2);
        }
    }

    public void captureEndValues(Or3 or3) {
        this.captureValues(or3);
    }

    public void captureStartValues(Or3 or3) {
        this.captureValues(or3);
    }

    public Animator createAnimator(ViewGroup object, Or3 object2, Or3 object3) {
        boolean bl2;
        View view;
        boolean bl3;
        int n3 = 0;
        object = null;
        if (object2 != null && object3 != null && (bl3 = (view = ((Or3)object2).b) instanceof TextView) && (bl2 = (view = ((Or3)object3).b) instanceof TextView)) {
            float f5;
            int n4;
            float f6;
            view = (TextView)view;
            object2 = ((Or3)object2).a;
            String string2 = PROPNAME_SCALE;
            Object v4 = ((HashMap)object2).get(string2);
            float f7 = 1.0f;
            if (v4 != null) {
                object2 = (Float)((HashMap)object2).get(string2);
                f6 = ((Float)object2).floatValue();
            } else {
                n4 = 1065353216;
                f6 = 1.0f;
            }
            object3 = ((Or3)object3).a;
            v4 = ((HashMap)object3).get(string2);
            if (v4 != null) {
                object3 = (Float)((HashMap)object3).get(string2);
                f7 = ((Float)object3).floatValue();
            }
            if ((f5 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1)) == false) {
                return null;
            }
            n3 = 2;
            object = new float[n3];
            f5 = 0.0f;
            object3 = null;
            object[0] = (ViewGroup)f6;
            n4 = 1;
            f6 = Float.MIN_VALUE;
            object[n4] = (ViewGroup)f7;
            object = ValueAnimator.ofFloat((float[])object);
            object2 = new TextScale$1(this, (TextView)view);
            object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        }
        return object;
    }
}


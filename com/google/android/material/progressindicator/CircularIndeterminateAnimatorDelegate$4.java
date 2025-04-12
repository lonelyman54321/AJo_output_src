/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 */
package com.google.android.material.progressindicator;

import android.util.Property;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate;

class CircularIndeterminateAnimatorDelegate$4
extends Property {
    public CircularIndeterminateAnimatorDelegate$4(Class clazz, String string2) {
        super(clazz, string2);
    }

    public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        return Float.valueOf(CircularIndeterminateAnimatorDelegate.access$300(circularIndeterminateAnimatorDelegate));
    }

    public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f5) {
        float f6 = f5.floatValue();
        CircularIndeterminateAnimatorDelegate.access$400(circularIndeterminateAnimatorDelegate, f6);
    }
}


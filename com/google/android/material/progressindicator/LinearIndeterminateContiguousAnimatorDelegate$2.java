/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 */
package com.google.android.material.progressindicator;

import android.util.Property;
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate;

class LinearIndeterminateContiguousAnimatorDelegate$2
extends Property {
    public LinearIndeterminateContiguousAnimatorDelegate$2(Class clazz, String string2) {
        super(clazz, string2);
    }

    public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
        return Float.valueOf(LinearIndeterminateContiguousAnimatorDelegate.access$300(linearIndeterminateContiguousAnimatorDelegate));
    }

    public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f5) {
        float f6 = f5.floatValue();
        linearIndeterminateContiguousAnimatorDelegate.setAnimationFraction(f6);
    }
}


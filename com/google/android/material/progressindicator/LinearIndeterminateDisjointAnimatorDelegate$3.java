/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 */
package com.google.android.material.progressindicator;

import android.util.Property;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;

class LinearIndeterminateDisjointAnimatorDelegate$3
extends Property {
    public LinearIndeterminateDisjointAnimatorDelegate$3(Class clazz, String string2) {
        super(clazz, string2);
    }

    public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
        return Float.valueOf(LinearIndeterminateDisjointAnimatorDelegate.access$300(linearIndeterminateDisjointAnimatorDelegate));
    }

    public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f5) {
        float f6 = f5.floatValue();
        linearIndeterminateDisjointAnimatorDelegate.setAnimationFraction(f6);
    }
}


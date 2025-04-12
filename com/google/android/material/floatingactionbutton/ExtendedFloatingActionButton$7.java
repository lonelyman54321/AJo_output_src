/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

class ExtendedFloatingActionButton$7
extends Property {
    public ExtendedFloatingActionButton$7(Class clazz, String string2) {
        super(clazz, string2);
    }

    public Float get(View view) {
        return Float.valueOf(view.getLayoutParams().height);
    }

    public void set(View view, Float f5) {
        int n3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = n3 = f5.intValue();
        view.requestLayout();
    }
}


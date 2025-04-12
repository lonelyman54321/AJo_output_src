/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 *  android.view.View
 */
package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

class ExtendedFloatingActionButton$9
extends Property {
    public ExtendedFloatingActionButton$9(Class clazz, String string2) {
        super(clazz, string2);
    }

    public Float get(View view) {
        return Float.valueOf(view.getPaddingEnd());
    }

    public void set(View view, Float f5) {
        int n3 = view.getPaddingStart();
        int n4 = view.getPaddingTop();
        int n7 = f5.intValue();
        int n8 = view.getPaddingBottom();
        view.setPaddingRelative(n3, n4, n7, n8);
    }
}


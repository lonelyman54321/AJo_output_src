/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.animation;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$id;

public class ChildrenAlphaProperty
extends Property {
    public static final Property CHILDREN_ALPHA;

    static {
        ChildrenAlphaProperty childrenAlphaProperty = new ChildrenAlphaProperty("childrenAlpha");
        CHILDREN_ALPHA = childrenAlphaProperty;
    }

    private ChildrenAlphaProperty(String string2) {
        super(Float.class, string2);
    }

    public Float get(ViewGroup object) {
        int n3 = R$id.mtrl_internal_children_alpha_tag;
        if ((object = (Float)object.getTag(n3)) != null) {
            return object;
        }
        return Float.valueOf(1.0f);
    }

    public void set(ViewGroup viewGroup, Float f5) {
        float f6 = f5.floatValue();
        int n3 = R$id.mtrl_internal_children_alpha_tag;
        viewGroup.setTag(n3, (Object)f5);
        int n4 = viewGroup.getChildCount();
        for (n3 = 0; n3 < n4; ++n3) {
            View view = viewGroup.getChildAt(n3);
            view.setAlpha(f6);
        }
    }
}


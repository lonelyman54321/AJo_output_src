/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.DeterminateDrawable;

class DeterminateDrawable$1
extends jS0 {
    public DeterminateDrawable$1(String string2) {
        super(string2);
    }

    public float getValue(DeterminateDrawable determinateDrawable) {
        return DeterminateDrawable.access$000(determinateDrawable) * 10000.0f;
    }

    public void setValue(DeterminateDrawable determinateDrawable, float f5) {
        DeterminateDrawable.access$100(determinateDrawable, f5 /= 10000.0f);
    }
}


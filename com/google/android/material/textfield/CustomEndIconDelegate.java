/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.EndIconDelegate;

class CustomEndIconDelegate
extends EndIconDelegate {
    public CustomEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    public void setUp() {
        this.endLayout.setEndIconOnLongClickListener(null);
    }
}


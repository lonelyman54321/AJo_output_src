/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ImageButton
 */
package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class VisibilityAwareImageButton
extends ImageButton {
    private int userSetVisibility;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        this.userSetVisibility = n4 = this.getVisibility();
    }

    public final int getUserSetVisibility() {
        return this.userSetVisibility;
    }

    public final void internalSetVisibility(int n3, boolean bl2) {
        super.setVisibility(n3);
        if (bl2) {
            this.userSetVisibility = n3;
        }
    }

    public void setVisibility(int n3) {
        this.internalSetVisibility(n3, true);
    }
}


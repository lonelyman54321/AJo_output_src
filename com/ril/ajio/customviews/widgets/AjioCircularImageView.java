/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class AjioCircularImageView
extends AppCompatImageView {
    public AjioCircularImageView(Context context) {
        super(context);
        this.init();
    }

    public AjioCircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    public AjioCircularImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.init();
    }

    private void init() {
        this.setLayerType(1, null);
    }
}


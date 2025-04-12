/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ToggleButton
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;

public class AjioToggleButton
extends ToggleButton
implements CustomTextViewImpl {
    public AjioToggleButton(Context context) {
        super(context);
        this.initField(context, null);
    }

    public AjioToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public AjioToggleButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    public AjioToggleButton(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        this.initField(context, attributeSet);
    }

    public void initField(Context context, AttributeSet attributeSet) {
    }
}


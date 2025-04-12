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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;

public class LuxeUnderlineButton
extends AjioButton
implements CustomTextViewImpl {
    public LuxeUnderlineButton(Context context) {
        super(context);
        this.initField(context, null);
    }

    public LuxeUnderlineButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public LuxeUnderlineButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    public void initField(Context context, AttributeSet attributeSet) {
        int n3 = this.getPaintFlags() | 8;
        this.setPaintFlags(n3);
        this.setBackground(null);
    }
}


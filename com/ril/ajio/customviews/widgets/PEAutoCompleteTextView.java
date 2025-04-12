/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.widget.Filter
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Filter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

public class PEAutoCompleteTextView
extends AppCompatAutoCompleteTextView {
    public PEAutoCompleteTextView(Context context) {
        super(context);
    }

    public PEAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PEAutoCompleteTextView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public boolean enoughToFilter() {
        return true;
    }

    public void onFocusChanged(boolean bl2, int n3, Rect rect) {
        Filter filter;
        super.onFocusChanged(bl2, n3, rect);
        if (bl2 && (filter = this.getFilter()) != null) {
            filter = this.getText();
            n3 = 0;
            this.performFiltering((CharSequence)filter, 0);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ListView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class PENonScrollableListView
extends ListView {
    public PENonScrollableListView(Context context) {
        super(context);
    }

    public PENonScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PENonScrollableListView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public PENonScrollableListView(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
    }

    public void onMeasure(int n3, int n4) {
        n4 = View.MeasureSpec.makeMeasureSpec((int)(-1 >>> 3), (int)(-1 << -1));
        super.onMeasure(n3, n4);
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        layoutParams.height = n4 = this.getMeasuredHeight();
    }
}


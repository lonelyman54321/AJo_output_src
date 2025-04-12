/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$MarginLayoutParams
 */
package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class SlidingPaneLayout$LayoutParams
extends ViewGroup.MarginLayoutParams {
    public static final int[] d = new int[]{0x1010181};
    public float a;
    public boolean b;
    public boolean c;

    public SlidingPaneLayout$LayoutParams() {
        int n3 = -1;
        super(n3, n3);
        this.a = 0.0f;
    }

    public SlidingPaneLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        this.a = 0.0f;
        int[] nArray = d;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        this.a = f5 = context.getFloat(0, 0.0f);
        context.recycle();
    }
}


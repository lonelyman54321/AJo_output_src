/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$MarginLayoutParams
 */
package androidx.drawerlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;

public class DrawerLayout$LayoutParams
extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    public float b;
    public boolean c;
    public int d;

    public DrawerLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        int[] nArray = DrawerLayout.LAYOUT_ATTRS;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        this.a = n3 = context.getInt(0, 0);
        context.recycle();
    }
}


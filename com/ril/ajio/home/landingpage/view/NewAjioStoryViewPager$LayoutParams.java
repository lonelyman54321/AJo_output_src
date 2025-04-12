/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 */
package com.ril.ajio.home.landingpage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public class NewAjioStoryViewPager$LayoutParams
extends ViewGroup.LayoutParams {
    public boolean a;
    public final int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public NewAjioStoryViewPager$LayoutParams() {
        int n3 = -1;
        super(n3, n3);
        this.c = 0.0f;
    }

    public NewAjioStoryViewPager$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        this.c = 0.0f;
        int[] nArray = NewAjioStoryViewPager.t0;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        this.b = n3 = context.getInteger(0, 48);
        context.recycle();
    }
}


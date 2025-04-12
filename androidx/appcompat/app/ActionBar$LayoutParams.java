/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package androidx.appcompat.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.R$styleable;

public class ActionBar$LayoutParams
extends ViewGroup.MarginLayoutParams {
    public int a = 0;

    public ActionBar$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] nArray = R$styleable.ActionBarLayout;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n3 = R$styleable.ActionBarLayout_android_layout_gravity;
        this.a = n3 = context.getInt(n3, 0);
        context.recycle();
    }

    public ActionBar$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public ActionBar$LayoutParams(ActionBar$LayoutParams actionBar$LayoutParams) {
        super((ViewGroup.MarginLayoutParams)actionBar$LayoutParams);
        int n3;
        this.a = n3 = actionBar$LayoutParams.a;
    }
}


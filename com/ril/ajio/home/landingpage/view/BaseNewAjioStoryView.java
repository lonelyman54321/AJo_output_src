/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 */
package com.ril.ajio.home.landingpage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ril.ajio.home.landingpage.activity.NewAjioStoryActivity;
import java.util.ArrayList;

public abstract class BaseNewAjioStoryView
extends FrameLayout {
    public final int a;
    public NewAjioStoryActivity b;
    public L82 c;

    public BaseNewAjioStoryView(Context context) {
        super(context);
        int n3;
        this.a = n3 = hv3_0.F() / 2;
    }

    public BaseNewAjioStoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        this.a = n3 = hv3_0.F() / 2;
    }

    public BaseNewAjioStoryView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        this.a = n4 = hv3_0.F() / 2;
    }

    public void setActivity(NewAjioStoryActivity newAjioStoryActivity) {
        this.b = newAjioStoryActivity;
    }

    public abstract void setData(ArrayList var1, int var2);

    public void setOnNewAjioStoryClick(L82 l82) {
        this.c = l82;
    }
}


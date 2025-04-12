/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 */
package com.ril.ajio.pdprefresh.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ril.ajio.home.landingpage.activity.NewAjioStoryActivity;

public abstract class BasePDPNewAjioView
extends FrameLayout {
    public BasePDPNewAjioView(Context context) {
        super(context);
    }

    public BasePDPNewAjioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BasePDPNewAjioView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public void setActivity(NewAjioStoryActivity newAjioStoryActivity) {
    }

    public abstract void setData();
}


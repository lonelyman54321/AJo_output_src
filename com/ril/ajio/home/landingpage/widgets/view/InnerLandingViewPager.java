/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.ril.ajio.home.landingpage.widgets.view;

import android.content.Context;
import android.util.AttributeSet;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public class InnerLandingViewPager
extends NewAjioStoryViewPager {
    public InnerLandingViewPager(Context context) {
        super(context);
    }

    public InnerLandingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean canScrollHorizontally(int n3) {
        return false;
    }
}


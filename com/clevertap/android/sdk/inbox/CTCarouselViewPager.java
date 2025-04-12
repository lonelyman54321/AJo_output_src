/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class CTCarouselViewPager
extends ViewPager {
    public CTCarouselViewPager(Context context) {
        super(context);
    }

    public CTCarouselViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        int n8 = 0;
        for (int i3 = 0; i3 < (n7 = this.getChildCount()); ++i3) {
            View view = this.getChildAt(i3);
            int n10 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            view.measure(n3, n10);
            n7 = view.getMeasuredHeight();
            if (n7 <= n8) continue;
            n8 = n7;
        }
        if (n8 != 0) {
            n4 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)0x40000000);
        }
        super.onMeasure(n3, n4);
    }
}


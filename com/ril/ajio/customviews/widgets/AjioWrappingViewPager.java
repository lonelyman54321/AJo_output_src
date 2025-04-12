/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.ril.ajio.customviews.widgets.AjioWrappingViewPager$1;
import com.ril.ajio.customviews.widgets.AjioWrappingViewPager$2;

public class AjioWrappingViewPager
extends ViewPager {
    private Boolean mAnimStarted;

    public AjioWrappingViewPager(Context object) {
        super((Context)object);
        object = Boolean.FALSE;
        this.mAnimStarted = object;
    }

    public AjioWrappingViewPager(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        object = Boolean.FALSE;
        this.mAnimStarted = object;
    }

    public static /* bridge */ /* synthetic */ void a(AjioWrappingViewPager ajioWrappingViewPager, Boolean bl2) {
        ajioWrappingViewPager.mAnimStarted = bl2;
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        Object object = this.mAnimStarted;
        boolean n7 = (Boolean)object;
        if (!n7 && (object = this.getAdapter()) != null) {
            object = (vw0_0)this.getAdapter();
            int n8 = this.getCurrentItem();
            object = ((vw0_0)object).n(n8);
            View view = ((Fragment)object).getView();
            int n10 = 0;
            if (view != null) {
                n10 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                view.measure(n3, n10);
                n10 = view.getMeasuredHeight();
                n8 = object instanceof ro1_1;
                if (n8 != 0) {
                    object = (ro1_1)object;
                    n10 = object.getHeight();
                }
            }
            int n14 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000);
            view = this.getLayoutParams();
            n8 = view.height;
            if (n8 != 0 && n4 != n14) {
                int n15 = this.getLayoutParams().height;
                n8 = n10 - n15;
                AjioWrappingViewPager$1 ajioWrappingViewPager$1 = new AjioWrappingViewPager$1(this, n10, n8, n15);
                object = new AjioWrappingViewPager$2(this);
                ajioWrappingViewPager$1.setAnimationListener((Animation.AnimationListener)object);
                long l2 = 1000L;
                ajioWrappingViewPager$1.setDuration(l2);
                this.startAnimation(ajioWrappingViewPager$1);
                this.mAnimStarted = object = Boolean.TRUE;
            } else {
                n4 = n14;
            }
        }
        super.onMeasure(n3, n4);
    }
}


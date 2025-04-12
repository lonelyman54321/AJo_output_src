/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.o;
import com.google.android.material.carousel.CarouselSnapHelper;

class CarouselSnapHelper$1
extends o {
    final /* synthetic */ CarouselSnapHelper this$0;
    final /* synthetic */ RecyclerView$o val$layoutManager;

    public CarouselSnapHelper$1(CarouselSnapHelper carouselSnapHelper, Context context, RecyclerView$o recyclerView$o) {
        this.this$0 = carouselSnapHelper;
        this.val$layoutManager = recyclerView$o;
        super(context);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        float f5;
        float f6;
        RecyclerView$o recyclerView$o = this.val$layoutManager;
        int n3 = recyclerView$o.canScrollVertically();
        if (n3 != 0) {
            int n4 = displayMetrics.densityDpi;
            f6 = n4;
            n3 = 1112014848;
            f5 = 50.0f;
            return f5 / f6;
        }
        int n7 = displayMetrics.densityDpi;
        f6 = n7;
        n3 = 1120403456;
        f5 = 100.0f;
        return f5 / f6;
    }

    public void onTargetFound(View object, RecyclerView$y object2, RecyclerView$x$a recyclerView$x$a) {
        object2 = CarouselSnapHelper.access$000(this.this$0);
        if (object2 != null) {
            object2 = this.this$0;
            RecyclerView$o recyclerView$o = CarouselSnapHelper.access$000((CarouselSnapHelper)object2).getLayoutManager();
            int n3 = 1;
            object = CarouselSnapHelper.access$100((CarouselSnapHelper)object2, recyclerView$o, object, n3 != 0);
            object2 = null;
            View view = object[0];
            View view2 = object[n3];
            int n4 = Math.abs((int)view);
            n3 = Math.abs((int)view2);
            n4 = Math.max(n4, n3);
            if ((n4 = this.calculateTimeForDeceleration(n4)) > 0) {
                DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                recyclerView$x$a.b((int)view, (int)view2, (Interpolator)decelerateInterpolator, n4);
            }
        }
    }
}


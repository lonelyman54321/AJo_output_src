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
package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.y;

public final class y$b
extends o {
    public final /* synthetic */ y a;

    public y$b(y y5, Context context) {
        this.a = y5;
        super(context);
    }

    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        float f5 = displayMetrics.densityDpi;
        return 100.0f / f5;
    }

    public final void onTargetFound(View object, RecyclerView$y object2, RecyclerView$x$a recyclerView$x$a) {
        object2 = this.a;
        Object object3 = ((y)object2).mRecyclerView;
        if (object3 == null) {
            return;
        }
        object3 = ((RecyclerView)object3).getLayoutManager();
        object = ((y)object2).calculateDistanceToFinalSnap((RecyclerView$o)object3, (View)object);
        object2 = null;
        View view = object[0];
        View view2 = object[1];
        int n3 = Math.abs((int)view);
        int n4 = Math.abs((int)view2);
        n3 = Math.max(n3, n4);
        if ((n3 = this.calculateTimeForDeceleration(n3)) > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            recyclerView$x$a.b((int)view, (int)view2, (Interpolator)decelerateInterpolator, n3);
        }
    }
}


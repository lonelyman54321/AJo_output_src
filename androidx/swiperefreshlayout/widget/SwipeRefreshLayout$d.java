/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 */
package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class SwipeRefreshLayout$d
extends Animation {
    public final /* synthetic */ SwipeRefreshLayout a;

    public SwipeRefreshLayout$d(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f5, Transformation transformation) {
        this.a.e(f5);
    }
}


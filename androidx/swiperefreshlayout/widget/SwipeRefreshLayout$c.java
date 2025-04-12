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

public final class SwipeRefreshLayout$c
extends Animation {
    public final /* synthetic */ SwipeRefreshLayout a;

    public SwipeRefreshLayout$c(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f5, Transformation object) {
        int n3;
        object = this.a;
        int n4 = object.I;
        if (n4 == 0) {
            n4 = object.y;
            n3 = Math.abs(object.x);
            n4 -= n3;
        } else {
            n4 = object.y;
        }
        n3 = object.v;
        n4 = (int)((float)(n4 - n3) * f5);
        n3 += n4;
        KU kU = object.t;
        n4 = kU.getTop();
        object.setTargetOffsetTopAndBottom(n3 -= n4);
        object = object.A;
        n4 = 1065353216;
        float f6 = 1.0f - f5;
        QU$a qU$a = object.a;
        float f7 = qU$a.p;
        n3 = (int)(f6 == f7 ? 0 : (f6 > f7 ? 1 : -1));
        if (n3 != 0) {
            qU$a.p = f6;
        }
        object.invalidateSelf();
    }
}


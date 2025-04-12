/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.widget;

import androidx.core.widget.NestedScrollView;

public final class NestedScrollView$c
implements sq0_0 {
    public final /* synthetic */ NestedScrollView a;

    public NestedScrollView$c(NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    public final boolean a(float f5) {
        NestedScrollView nestedScrollView = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object == false) {
            return false;
        }
        this.c();
        nestedScrollView = this.a;
        int n3 = (int)f5;
        nestedScrollView.e(n3);
        return true;
    }

    public final float b() {
        return -this.a.getVerticalScrollFactorCompat();
    }

    public final void c() {
        this.a.d.abortAnimation();
    }
}


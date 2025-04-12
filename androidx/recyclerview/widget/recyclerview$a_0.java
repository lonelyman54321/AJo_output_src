/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/*
 * Renamed from androidx.recyclerview.widget.RecyclerView$a
 */
public final class recyclerview$a_0
implements Interpolator {
    public final float getInterpolation(float f5) {
        float f6 = 1.0f;
        return (f5 -= f6) * f5 * f5 * f5 * f5 + f6;
    }
}


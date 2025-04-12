/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

public final class ItemTouchHelper$c$a
implements Interpolator {
    public final float getInterpolation(float f5) {
        return f5 * f5 * f5 * f5 * f5;
    }
}


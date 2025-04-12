/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
package com.ril.ajio.home.landingpage.view;

import android.view.animation.Interpolator;

public final class NewAjioStoryViewPager$b
implements Interpolator {
    public final float getInterpolation(float f5) {
        float f6 = 1.0f;
        return (f5 -= f6) * f5 * f5 * f5 * f5 + f6;
    }
}


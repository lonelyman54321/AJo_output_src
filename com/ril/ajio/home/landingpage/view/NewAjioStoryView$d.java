/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.home.landingpage.view;

import android.view.View;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$h;

public final class NewAjioStoryView$d
implements NewAjioStoryViewPager$h {
    public final void a(float f5, View view) {
        float f6;
        view.getWidth();
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        float f7 = 1.0f;
        view.setScaleX(f7);
        view.setScaleY(f7);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        float f8 = -1.0f;
        float f11 = f5 == f8 ? 0 : (f5 < f8 ? -1 : 1);
        if (f11 <= 0 || (f6 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1)) >= 0) {
            f7 = 0.0f;
        }
        view.setAlpha(f7);
        f5 = view.getWidth();
        f7 = view.getHeight();
        view.setPivotX(f5 *= 0.5f);
        view.setPivotY(f7);
        view.setRotation(0.0f);
    }
}


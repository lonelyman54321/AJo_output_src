/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.home.landingpage.view;

import android.view.View;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$h;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements NewAjioStoryViewPager$h {
    public final void a(float f5, View view) {
        String string2 = "page";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = 1065353216;
        float f6 = 1.0f;
        int n4 = -1082130432;
        float f7 = -1.0f;
        Object object = f5 == f7 ? 0 : (f5 < f7 ? -1 : 1);
        if (object < 0) {
            f5 = -1.0f;
        } else {
            object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (object > 0) {
                f5 = 1.0f;
            }
        }
        view.getWidth();
        object = false;
        float f8 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(f6);
        view.setScaleY(f6);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        n4 = (int)(f5 == f7 ? 0 : (f5 < f7 ? -1 : 1));
        if (n4 <= 0 || (n4 = (int)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1))) >= 0) {
            n3 = 0;
            f6 = 0.0f;
            string2 = null;
        }
        view.setAlpha(f6);
        string2 = null;
        view.setEnabled(false);
        f6 = view.getWidth() * 20;
        view.setCameraDistance(f6);
        float f11 = f5 - 0.0f;
        n3 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
        if (n3 < 0) {
            n3 = view.getWidth();
            f8 = n3;
        }
        view.setPivotX(f8);
        f6 = (float)view.getHeight() * 0.5f;
        view.setPivotY(f6);
        view.setRotationY(f5 *= 90.0f);
    }
}


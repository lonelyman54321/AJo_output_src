/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$ChildScrollEffect;

public class AppBarLayout$CompressChildScrollEffect
extends AppBarLayout$ChildScrollEffect {
    private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
    private final Rect ghostRect;
    private final Rect relativeRect;

    public AppBarLayout$CompressChildScrollEffect() {
        Rect rect;
        this.relativeRect = rect = new Rect();
        this.ghostRect = rect = new Rect();
    }

    private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
        view.getDrawingRect(rect);
        appBarLayout.offsetDescendantRectToMyCoords(view, rect);
        int n3 = -appBarLayout.getTopInset();
        rect.offset(0, n3);
    }

    public void onOffsetChanged(AppBarLayout object, View view, float f5) {
        AppBarLayout$CompressChildScrollEffect.updateRelativeRect(this.relativeRect, (AppBarLayout)object, view);
        object = this.relativeRect;
        int n3 = ((Rect)object).top;
        float f6 = n3;
        f5 = Math.abs(f5);
        f6 -= f5;
        f5 = 0.0f;
        int n4 = 0;
        float f7 = 0.0f;
        Rect rect = null;
        float f8 = f6 - 0.0f;
        float f11 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (f11 <= 0) {
            Rect rect2 = this.relativeRect;
            float f12 = rect2.height();
            f12 = Math.abs(f6 / f12);
            float f14 = 1.0f;
            f7 = PK1.a(f12, 0.0f, f14);
            f6 = -f6;
            f7 = f14 - f7;
            f7 *= f7;
            f14 -= f7;
            f7 = (float)this.relativeRect.height() * 0.3f * f14;
            view.setTranslationY(f6 -= f7);
            rect = this.ghostRect;
            view.getDrawingRect(rect);
            rect = this.ghostRect;
            f12 = -f6;
            f11 = (int)f12;
            rect.offset(0, (int)f11);
            rect = this.ghostRect;
            n4 = rect.height();
            f7 = n4;
            n3 = (int)(f6 == f7 ? 0 : (f6 > f7 ? 1 : -1));
            if (n3 >= 0) {
                n3 = 4;
                f6 = 5.6E-45f;
                view.setVisibility(n3);
            } else {
                view.setVisibility(0);
            }
            object = this.ghostRect;
            view.setClipBounds((Rect)object);
        } else {
            object = ViewCompat.a;
            n3 = 0;
            f6 = 0.0f;
            object = null;
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
        }
    }
}


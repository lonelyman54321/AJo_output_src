/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.getkeepsafe.taptargetview;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.getkeepsafe.taptargetview.TapTargetView;

class TapTargetView$12
extends ViewOutlineProvider {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$12(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void getOutline(View view, Outline outline) {
        view = this.this$0;
        int[] nArray = view.outerCircleCenter;
        if (nArray == null) {
            return;
        }
        float f5 = nArray[0];
        float f6 = view.outerCircleRadius;
        float f7 = f5 - f6;
        int n3 = (int)f7;
        float f8 = nArray[1];
        float f11 = f8 - f6;
        int n4 = (int)f11;
        int n7 = (int)(f5 += f6);
        int n8 = (int)(f8 + f6);
        outline.setOval(n3, n4, n7, n8);
        view = this.this$0;
        f6 = (float)view.outerCircleAlpha / 255.0f;
        outline.setAlpha(f6);
        n8 = Build.VERSION.SDK_INT;
        int n10 = 22;
        f8 = 3.1E-44f;
        if (n8 >= n10) {
            view = this.this$0;
            n8 = view.SHADOW_DIM;
            ii3_1.a(outline, n8);
        }
    }
}


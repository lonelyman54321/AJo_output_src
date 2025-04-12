/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.ril.ajio.rto.ui;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;

public final class RtoBottomSheet$setKeyboardVisibilityListener$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean a;
    public final int b;
    public final Rect c;
    public final /* synthetic */ uq2_0 d;
    public final /* synthetic */ H82 e;

    public RtoBottomSheet$setKeyboardVisibilityListener$1(uq2_0 uq2_02, H82 h82) {
        this.d = uq2_02;
        this.e = h82;
        this.b = 148;
        this.c = uq2_02;
    }

    public final void onGlobalLayout() {
        int n3;
        int n4 = this.b;
        float f5 = n4;
        Object object = this.d;
        NestedScrollView nestedScrollView = ((uq2_0)object).p;
        nestedScrollView = nestedScrollView != null && (nestedScrollView = nestedScrollView.getResources()) != null ? nestedScrollView.getDisplayMetrics() : null;
        int n7 = 1;
        f5 = TypedValue.applyDimension((int)n7, (float)f5, (DisplayMetrics)nestedScrollView);
        n4 = (int)f5;
        nestedScrollView = ((uq2_0)object).p;
        Rect rect = this.c;
        if (nestedScrollView != null) {
            nestedScrollView.getWindowVisibleDisplayFrame(rect);
        }
        object = ((uq2_0)object).p;
        nestedScrollView = null;
        if (object != null && (object = object.getRootView()) != null) {
            n3 = object.getHeight();
            int n8 = rect.bottom;
            int n10 = rect.top;
            n3 -= (n8 -= n10);
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 < n4) {
            n7 = 0;
        }
        n4 = (int)(this.a ? 1 : 0);
        if (n7 == n4) {
            return;
        }
        this.a = n7;
        this.e.W();
    }
}


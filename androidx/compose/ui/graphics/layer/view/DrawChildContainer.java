/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.R$id;
import androidx.compose.ui.graphics.layer.ViewLayer;
import kotlin.jvm.internal.Intrinsics;

public class DrawChildContainer
extends ViewGroup {
    public boolean a;

    public DrawChildContainer(Context context) {
        super(context);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        int n3 = R$id.hide_graphics_layer_in_inspector_tag;
        Boolean bl2 = Boolean.TRUE;
        this.setTag(n3, bl2);
    }

    public final void a(iL iL2, View view, long l2) {
        iL2 = Nf.a(iL2);
        super.drawChild((Canvas)iL2, view, l2);
    }

    public void dispatchDraw(Canvas canvas) {
        int n3 = super.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            String string2 = "null cannot be cast to non-null type androidx.compose.ui.graphics.layer.ViewLayer";
            Intrinsics.checkNotNull(view, string2);
            view = (ViewLayer)view;
            boolean bl2 = view.d;
            if (!bl2) continue;
            n3 = 1;
            this.a = n3;
            try {
                super.dispatchDraw(canvas);
                break;
            }
            finally {
                this.a = false;
            }
        }
    }

    public final void forceLayout() {
    }

    public int getChildCount() {
        int n3 = this.a;
        n3 = n3 != 0 ? super.getChildCount() : 0;
        return n3;
    }

    public final ViewParent invalidateChildInParent(int[] nArray, Rect rect) {
        return null;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public final void onMeasure(int n3, int n4) {
        this.setMeasuredDimension(0, 0);
    }

    public final void requestLayout() {
    }
}

